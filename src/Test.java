import bean.TreeNode;

import java.util.ArrayDeque;
import java.util.Queue;

public class Test {

    private class ListNode{
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }

        ListNode newHead = null;
        ListNode curent = head;
        ListNode currentNext;

        while (curent!=null){
            currentNext = curent.next;
            curent.next = newHead;
            newHead = curent;
            curent = currentNext;
        }
        return newHead;
    }

    public ListNode reversee(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode cur = head;
        ListNode reverseHead = null;
        ListNode curnext;

        while (cur!=null){
            curnext = cur.next;
            cur.next = reverseHead;
            reverseHead = cur;

            cur = curnext;
        }
        return reverseHead;
    }

    //链表中的环检测
    public boolean hasCycle(ListNode head) {
        if(head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (slow!=null && fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    //给定一个链表，返回链表开始入环的第一个节点。 如果链表无环，则返回 null。
    //先判断有没有环，找到快慢指针相交的点，然后再走一圈，判断环的大小，
    //然后重新设置快慢指针，快指针，先走环的长度的步数。然后满指针和快指针一起走，相交的节点就是所要找的节点

    public ListNode detectCycle(ListNode head) {
        int cnt =1;
        if(head == null){
            return head;
        }

        ListNode slow = head;
        ListNode fast = head;
        while (slow!=null && fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                slow = slow.next;
                fast = fast.next.next;
                while (slow!=fast){
                    slow = slow.next;
                    fast = fast.next.next;
                    cnt++;
                }

                slow = head;
                fast = head;
                while (cnt>0){
                    fast = fast.next;
                    cnt--;
                }
                while (slow!=fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }

    //两个有序链表合并
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(null == l1){
            return l2;
        }
        if(null == l2){
            return l1;
        }

        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode head;
        ListNode ph;
        if(p1.val<p2.val){
            head = p1;
            p1=p1.next;
        }else {
            head = p2;
            p2 = p2.next;
        }
        ph = head;

        while (p1!=null && p2!=null){
           if(p1.val<p2.val){
               ph.next = p1;
               p1 = p1.next;
           }else {
               ph.next = p2;
               p2=p2.next;
           }
           ph = ph.next;
        }
        if(p1 == null){
            ph.next = p2;
        }else {
            ph.next = p1;
        }
        return head;
    }

    //删除链表倒数第n个节点(n 从1开始)
    public ListNode removeNthFromEnd(ListNode head, int n) {
       if(head == null){
           return head;
       }
       ListNode fast = head;
       int cnt = n;
       while (cnt>0 && fast!=null){
           fast = fast.next;
           cnt--;
       }
       if(fast == null && cnt>0){
           return head;
       }
       if(fast == null && cnt == 0){ //判断首节点
           return head.next;
       }

       ListNode slow = head;
       ListNode pre = slow;
       while (fast!=null){
           pre = slow;
           fast = fast.next;
           slow = slow.next;
       }
       pre.next = slow.next;
       return head;
    }
    //求链表的中间节点 链表是带头结点的非空节点
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while (slow!=null && fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    //二叉树遍历，递归非递归
    //二叉树的其他面试题


    //二叉树章节



    //判断是否是平衡二叉树
    public boolean isBalanced(TreeNode root) {
        if(null == root){
            return true;
        }
        if(Math.abs(getDeth(root.left)-getDeth(root.right))>1){
            return false;
        }else {
            return isBalanced(root.left) && isBalanced(root.right);
        }
    }

    private int getDeth(TreeNode root){
        if(root == null){
            return 0;
        }
        int ld = getDeth(root.left)+1;
        int rd = getDeth(root.right)+1;
        return Math.max(ld,rd);
    }

    /**
     * 合并二叉树
     * @param t1
     * @param t2
     * @return
     * 递归：找递归终止条件
     * 找一般规律 也就是找迭代公式
     */
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if(t1 == null){
            return t2;
        }
        if(t2 == null){
            return t1;
        }
        t1.val +=t2.val;
        t1.left = mergeTrees(t1.left,t2.left);
        t1.right = mergeTrees(t1.right,t2.right);
        return t1;
    }


    /**
     * 镜像二叉树
     * @param root
     * @return
     *递归版本
     */
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root,root);
    }

    private boolean isMirror(TreeNode r1,TreeNode r2){
        if(r1 == null && r2 == null){
            return true;
        }
        if(r1 == null && r2!=null){
            return false;
        }
        if(r2 == null && r1!=null){
            return false;
        }

        if(r1.val == r2.val){
            return isMirror(r1.left,r2.right) &&  isMirror(r1.right,r2.left);
        }

        return false;
    }

    /**
     * 二叉树的裁剪
     * 返回去除了不包含1的子树的二叉树
     * 思路：左子树为空，右子树也为空 根节点的值为0 就删除根节点
     * 后续遍历
     */
    public TreeNode pruneTree(TreeNode root) {
        if(root == null){
            return null;
        }
        root.left = pruneTree(root.left);
        root.right = pruneTree(root.right);
        if(root.left == null && root.right == null && root.val == 0){
            return null;
        }
        return root;
    }

    /**
     * 翻转二叉树
     * @param root
     * @return
     */
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    private void invert(TreeNode root){
        if(root == null){
            return;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;

        invertTree(root.left);
        invertTree(root.right);
    }

    /**
     * 单值二叉树
     * @param root
     * @return
     */
    public boolean isUnivalTree(TreeNode root) {
        if(root == null){
            return true;
        }
        return isUnivalTree(root,root.val);
    }

    private boolean isUnivalTree(TreeNode root,int val){
        if(root == null){
            return true;
        }
        if(root.val!=val){
            return false;
        }
        return isUnivalTree(root.left,val) && isUnivalTree(root.right,val);
    }


    /**
     * 二叉树展开为链表
     * @param root
     */
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        preTravel(root,queue);
        root = queue.poll();
        root.left = null;
        TreeNode cur = root;
        while (!queue.isEmpty()){
           TreeNode treeNode = queue.poll();
           if(treeNode!=null){
               cur.right = treeNode;
               cur.left = null;
               cur = treeNode;
           }
        }

    }

    private void preTravel(TreeNode root,Queue<TreeNode> queue){
        if(root == null){
            return;
        }
        queue.offer(root);
        preTravel(root.left,queue);
        preTravel(root.right,queue);
    }






}
