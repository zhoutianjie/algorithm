import bean.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 常见练习题
 */
public class Solution {

    public static class ListNode{
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode createList(int n){
        ListNode head = new ListNode(0);
        ListNode cur = head;
        for (int i = 1;i<n;i++){
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        return head;
    }

    public static void print(ListNode head){
        ListNode p = head;
        while (p!=null){
            System.out.print(p.val);
            p=p.next;
        }
        System.out.println();
    }

    /**
     * 倒序打印单链表
     * 首先想到的就是递归打印
     */

    public static void reversePrintList(ListNode head){
        if(head!=null){
            reversePrintList(head.next);
            System.out.print(head.val);
        }
    }

    /**
     * 给定头结点和指定节点O(1)时间复杂度里面删除指定节点
     * 这里只能是均摊时间复杂度为O(1)
     */
    public static ListNode deleteListNode(ListNode head,ListNode t){
        if(head == null || t == null){
            return head;
        }
        if(t.next!=null){
            //不是尾结点，后面节点的值覆盖当前节点，再删除后面的结点
            t.val = t.next.val;
            t.next = t.next.next;
        }else {
            //如果t是尾结点
            ListNode p = head;
            ListNode pre = p;
            while (p.next!=null){
                pre = p;
                p = p.next;
            }
            pre.next=null;
        }
        return head;
    }

    /**
     * 找到链表倒数第k个节点
     * 遍历一遍就能找到
     * k取值从0开始取(边节点容易出错)
     */
    public ListNode removeNthFromEnd(ListNode head,int k){
            if(head == null){
                return null;
            }
            ListNode pFast = head;
            ListNode pCur = head;
            ListNode pre = pCur;
            while (k>0 && pFast!=null){
                pFast = pFast.next;
                k--;
            }

            if(pFast == null){
                //k值不合理
                return head;
            }

            while (pFast.next!=null){
                pFast = pFast.next;
                pre = pCur;
                pCur = pCur.next;
            }

            if(pre == pCur){
                //删除首节点
                return head.next;
            }

            pre.next = pCur.next;
            return head;

    }

    /**
     * 反转链表
     */
    public static ListNode reverse(ListNode head){
        if (head == null || head.next == null){
            return head;
        }

        ListNode cur = head;
        ListNode curNext;
        ListNode reverseHead = null;

        while (cur!=null){
            curNext = cur.next;
            cur.next = reverseHead;
            reverseHead = cur;

            cur = curNext;

        }
        return reverseHead;
    }

    /**
     * 就是有公共部分的两个链表
     * 输入两个链表找到第一个公共节点
     * 借助外部空间，使用栈
     * 如果不借助外部空间
     * 除了比较长度，还有一个不太好理解的方法(学习一下)
     *
     * 可以定义两个指针，第一轮让两个达到末尾的指针分别指向另一个链表，再次重新开始遍历，遍历到
     * 相同的就返回，第一轮让走到末尾的指针指向另一个链表，抵消了长度查
     */

    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if(headA == null || headB == null){
            return null;
        }

        ListNode pA = headA;
        ListNode pB = headB;

        while (pA!=pB){//这个条件记住pA!=pB
            pA = pA == null ? headB:pA.next;
            pB = pB == null ? headA:pB.next;
        }
        return pA;
    }

    /**
     * 输出二叉树镜像
     */
    public TreeNode getMirror(TreeNode root){
        if (root == null){
            return null;
        }
        inverse(root);
        return root;
    }

    private void inverse(TreeNode root){
        if(root.left==null && root.right==null){
            return;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        if(root.left!=null){
            inverse(root.left);
        }
        if(root.right!=null){
            inverse(root.right);
        }
    }



    /**树的最小深度好好理解一下
     * 求树的最小深度
     */

    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        if(root.left == null) return minDepth(root.right)+1;
        if(root.right == null) return minDepth(root.left)+1;
        return Math.min(minDepth(root.left),minDepth(root.right))+1;
    }

    /**
     * 二叉树广度遍历(遍历打印)
     */
    public void printlevelOrder(TreeNode root){
        if (root == null){
            return;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode treeNode = queue.poll();
            System.out.print(treeNode.val);
            if(treeNode.left!=null){
                queue.offer(treeNode.left);
            }
            if(treeNode.right!=null) {
                queue.offer(treeNode.right);
            }
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root == null){
            return null;
        }
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> integers = new ArrayList<>();
            for (int i=0;i<size;++i){
                TreeNode treeNode = queue.poll();
                integers.add(treeNode.val);

                if(treeNode.left !=null){
                    queue.offer(treeNode.left);
                }

                if(treeNode.right!=null){
                    queue.offer(treeNode.right);
                }
            }
            result.add(integers);
        }

        return result;
    }



}
