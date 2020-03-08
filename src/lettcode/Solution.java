package lettcode;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;
import sun.text.normalizer.Trie;

import java.util.*;

/**
 * LettCode 习题
 * Serial:
 * difficulty:
 * Description: 链表和二叉树
 */
public class Solution {
    class ListNode{
        int val;
        ListNode next;
        public ListNode(int val) { this.val = val;}
    }

    class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    //for test
    public ListNode create(int[] arr){
        ListNode head = new ListNode(arr[0]);
        ListNode p = head;
        for (int i=1;i<arr.length;i++){
            p.next = new ListNode(arr[i]);
            p=p.next;
        }
        return head;
    }
    //for test
    public void print(ListNode head){
        if(head == null){
            System.out.println("list is null");
        }else {
            ListNode p = head;
            while (p!=null){
                System.out.print(p.val+" ");
                p=p.next;
            }
            System.out.println();
        }
    }

    /**
     * 206 反转链表
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode cur = head;
        ListNode cur_next;
        ListNode reverseHead = null;
        while (cur!=null){
            cur_next = cur.next;
            cur.next = reverseHead;
            reverseHead = cur;
            cur = cur_next;
        }
        return reverseHead;
    }

    /**
     * 合并两个有序链表
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
        if(l1 == null) return l2;
        if(l2 == null) return l1;
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode head = null;
        if(p1.val<p2.val){
            head = p1;
            p1=p1.next;
        }else {
            head= p2;
            p2=p2.next;
        }
        ListNode q = head;
        while (p1!=null && p2!=null){
            if(p1.val<p2.val){
                q.next = p1;
                p1=p1.next;
            }else {
                q.next = p2;
                p2=p2.next;
            }
            q=q.next;
        }

        if(p1 == null){
            q.next=p2;
        }
        if(p2==null){
            q.next=p1;
        }
        return head;

    }

    //101对称二叉树
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        return isMirror(root,root);
    }

    private boolean isMirror(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left == null && right!=null){
            return false;
        }
        if(left!=null && right == null){
            return false;
        }

        if(left.val == right.val){
            return isMirror(left.left,right.right) && isMirror(left.right,right.left);
        }else {
            return false;
        }

    }

    //合并k个排序链表

    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        return mergeKLists(lists,0,lists.length-1);
    }

    public ListNode mergeKLists(ListNode[] list,int left,int right){
        if(left>=0 && right<list.length){
            if(right==left){
                return list[left];
            }else {
                int mid = (right+left)/2;
                ListNode l1 = mergeKLists(list,left,mid);
                ListNode l2 = mergeKLists(list,mid+1,right);
                return mergeTwoLists(l1,l2);
            }

        }else {
            return  null;
        }
    }

    //相交链表
    //遍历两遍就可以了
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return  null;
        }
        ListNode pA =  headA;
        ListNode pB = headB;
        while (pA!=pB){
            pA = pA == null ? headB:pA.next;
            pB = pB == null ? headA:pB.next;
        }
        return pA;
    }

    //排序链表 148 在O(nlogn)的时间复杂度内 O1空间复杂度
    //字地向上的归并 切割链表 logn 合并两个链表n
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode pre = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        return mergeTwoLists(sortList(head),sortList(slow));
    }

    /**
     * 98 验证二叉搜索树
     * 中序遍历的方法 递归验证 一股出口返回正例其他的返回返例
     */

    public boolean isValidBST(TreeNode root) {
      return isValidBST(root,null,null);
    }

    private boolean isValidBST(TreeNode root,Integer lower,Integer upper){
        if (root == null) return true;
        int val = root.val;
        if(lower!=null && val<=lower) return false;
        if(upper!=null && val>=upper)return false;
        if(!isValidBST(root.right,val,upper))return false;
        if(!isValidBST(root.left,lower,val))return false;
        return true;
    }

    //搜索二叉树，如果中序遍历放在一个数组中，他就是一个有序的数组
    private void inorder(TreeNode root, List<Integer> list){
        if(root == null) return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }
    public boolean isValid(TreeNode root){
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        for (int i=0;i<list.size()-1;i++){
            if(list.get(i)>=list.get(i+1)){
                return false;
            }
        }
        return true;
    }

    //二叉树的最大深度
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        int ld = maxDepth(root.left);
        int rd = maxDepth(root.right);

        return Math.max(ld,rd)+1;
    }

    //删除链表的第N个节点 N 从以开始
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode pre = slow;
        while (fast!=null && n>0){
            fast = fast.next;
            n--;
        }
        if(fast == null && n>0){ //n不合法
            return head;
        }

        while (fast!=null){
            fast = fast.next;
            pre = slow;
            slow = slow.next;
        }

        if (pre == slow){
            return pre.next;
        }else {
            pre.next = slow.next;
            return head;
        }
    }

    //环形链表
    public boolean hasCycle(ListNode head) {
        if(head == null)return false;
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

    //203 移除链表元素 适当的利用头结点
    public ListNode removeElements(ListNode head, int val) {
        ListNode preHead = new ListNode(val-1);
        preHead.next = head;
        ListNode pre = preHead;
        ListNode p = head;
        while (p!=null){
            if(p.val == val){
                pre.next = p.next;
                p=p.next;
            }else {
                pre = p;
                p=p.next;
            }
        }
        return preHead.next;

    }

    //二叉树的右视图
    //思路按层遍历，每次都是队列里面最右边的节点，组成的就是右视图
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null)return result;
        //要两个队列来实现
        ArrayDeque<TreeNode> queue1 = new ArrayDeque<>();
        ArrayDeque<TreeNode> queue2 = new ArrayDeque<>();
        queue1.push(root);

        while (!queue1.isEmpty()){
            result.add(queue1.getLast().val);//取队列的最右边的值
            queue2.clear();
            while (!queue1.isEmpty()){
                TreeNode node = queue1.poll();
                if(node!=null){
                    if(node.left!=null){
                        queue2.add(node.left);
                    }
                    if(node.right!=null){
                        queue2.add(node.right);
                    }
                }
            }
            queue1.addAll(queue2);
        }
        return result;
    }

    public List<Integer> rightSideView2(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            for (int i=0;i<size;i++){
                TreeNode node = queue.poll();
                if(node!=null && i==size-1){
                    result.add(node.val);
                }
                if(node!=null && node.left!=null){
                    queue.add(node.left);
                }
                if(node!=null && node.right!=null){
                    queue.add(node.right);
                }
            }
        }
        return result;
    }

    //中序遍历递归
    List<Integer> list = new ArrayList<>();
    public void inorder(TreeNode root){
        if(root == null)return;
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
    }

    //迭代 借用stack 背出来
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        if(root == null){
            return result;
        }
        do{
            while (root!=null){
                stack.push(root);
                root=root.left;
            }
            if(!stack.isEmpty()){
                TreeNode treeNode = stack.pop();
                result.add(treeNode.val);
                root = treeNode.right;
            }

        }while (!stack.isEmpty() ||  root!=null);
        return result;
    }


    //迭代前序遍历 背出来
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null) return result;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(node.val);
            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left!=null){
                stack.push(node.left);
            }
        }
        return list;
    }

    //后续 迭代 背出来
    public static List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return null;
        }
        List<Integer> list = new ArrayList<Integer>();

        Stack<TreeNode> s = new Stack<TreeNode>();

        s.push(root);

        while( !s.isEmpty() ) {
            TreeNode node = s.pop();
            if(node.left != null) {
                s.push(node.left);
            }

            if(node.right != null) {
                s.push(node.right);
            }

            list.add(0, node.val);
        }

        return list;
    }

    //二叉树的层次遍历二
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        Queue<TreeNode> queue1 = new ArrayDeque<>();
        Queue<TreeNode> queue2 = new ArrayDeque<>();
        queue1.add(root);
        while (!queue1.isEmpty()){
            Queue<TreeNode> tmp = new ArrayDeque<>(queue1);
            List<Integer> list = convert2InterList(tmp);
            result.add(0,list);
            queue2.clear();
            while (!queue1.isEmpty()){
                TreeNode node = queue1.poll();
                if(node!=null && node.left!=null){
                    queue2.add(node.left);
                }
                if(node!=null && node.right!=null){
                    queue2.add(node.right);
                }
            }
            queue1.addAll(queue2);
        }
        return result;
    }

    private List<Integer> convert2InterList(Queue<TreeNode> queue){
        List<Integer> list = new ArrayList<>();
        while (!queue.isEmpty()){
            list.add(queue.poll().val);
        }
        return list;
    }

    public List<List<Integer>>  getResult(TreeNode root){
        List<List<Integer>> result = new ArrayList<>();
        if (root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i=0;i<size;i++){
                TreeNode node = queue.poll();
                if(node!=null){
                    list.add(node.val);
                }
                if(node!=null && node.left!=null){
                    queue.add(node.left);
                }
                if(node!=null && node.right!=null){
                    queue.add(node.right);
                }
            }
            result.add(0,list);
        }
        return result;
    }

   //删除节点
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    //两两交换链表中的节点
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode p1 = head;
        ListNode p2 = head.next;
        p1.next = p2.next;
        p2.next=p1;
        head = p2;  //确定头结点

        p2 = head.next;
        while (p2!=null){
            ListNode p3 = p2.next;
            if(p3 == null){
                break;
            }
            ListNode p4 = p2.next.next;
            if(p4 == null){
                break;
            }
            p3.next=p4.next;
            p4.next=p3;
            p2.next=p4;

            p2=p2.next.next;
        }

        return head;
    }

    //138 复制带随机指针的链表
    //思路：第一次遍历链表的时候，复制旧链表的节点值新建立一个新的链表，
    //同时定义一个map 键值就是旧的链表的节点，value就是新的链表的节点
    //第二次遍历的时候，遍历每个几点的随机指针，得到的value值就是新链表每个几点的随机指针要指向的节点
    public Node copyRandomList(Node head) {
        if(head == null){
            return head;
        }
        Node node = head;
        Map<Node,Node> map = new HashMap<>();
        while (node!=null){
            Node clone = new Node(node.val);
            map.put(node,clone);
            node=node.next;
        }
        node = head;
        while (node!=null){
            map.get(node).next = map.get(node.next);
            map.get(node).random = map.get(node.random);
            node=node.next;
        }
        return map.get(head);

    }

    //102 二叉树的层次遍历
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            List<Integer> list = new ArrayList<>();
            for (int i=0;i<size;i++){
                TreeNode node = queue.poll();
                if(node!=null){
                    list.add(node.val);
                }
                if(node!=null && node.left!=null){
                    queue.add(node.left);
                }
                if(node!=null && node.right!=null){
                    queue.add(node.right);
                }
            }
            result.add(list);
        }
        return result;
    }

    //在每个树行中找最大值
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int size = queue.size();
            int maxValue = Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                TreeNode node = queue.poll();
                if(node!=null){
                    if(maxValue<=node.val){
                        maxValue = node.val;
                    }
                }
                if(node!=null && node.left!=null){
                    queue.add(node.left);
                }
                if(node!=null && node.right!=null){
                    queue.add(node.right);
                }
            }
            result.add(maxValue);
        }
        return result;
    }

    //不同的二叉搜索树，涉及到公式推导的可能就是动态回话问题
    public int numTrees(int n) {
        int[] G = new int[n + 1];
        G[0] = 1;
        G[1] = 1;

        for (int i = 2; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                G[i] += G[j - 1] * G[i - j];
            }
        }
        return G[n];
    }

    //143重排单链表
    //思路 重链表中间节点断开，把有半段链表反转，然后再合并两条链表
    public void reorderList(ListNode head) {
        if(head == null || head.next == null){
            return;
        }
        ListNode middle = middle(head);
        ListNode left = head;
        ListNode right = middle.next;
        middle.next = null;

        right = reverseList(right);

        merge(left,right);

    }

    //找出中间节点把链表分为两份
    private ListNode middle(ListNode head){
        if(head == null || head.next ==null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }

    private void merge(ListNode left,ListNode right){
        ListNode lefttmp;
        ListNode righttmp;
        while (left!=null && right!=null){
            lefttmp = left.next;
            righttmp = right.next;

            left.next = right;
            right.next = lefttmp;

            left = lefttmp;
            right = righttmp;
        }

    }

    //142环形链表二
    public ListNode detectCycle(ListNode head){
        int cnt = 1;
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

    //100 相同的树
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q==null){
            return true;
        }
        if(p!=null && q!=null){
            if(p.val == q.val){
                return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
            }else {
                return false;
            }
        }

        return false;
    }

    //235. 二叉搜索树的最近公共祖先
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null || p==null || q==null){
            return null;
        }

        if(p.val<q.val){
            return lowerAncestor(root,p,q);
        }else {
            return lowerAncestor(root,q,p);
        }

    }

    public TreeNode lowerAncestor(TreeNode root,TreeNode p,TreeNode q){
        if(root!=null){
            if(root.val>=p.val && root.val<=q.val){
                return root;
            }else if(root.val>q.val){
                return lowerAncestor(root.left,p,q);
            }else {
                return lowerAncestor(root.right,p,q);
            }
        }else {
            return null;
        }
    }

    //114 二叉树展开为链表 这就是一个前序遍历，前序遍历用两种方法来实现，一种是简单的递归，一种是迭代
    public void flatten(TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        preOrder(queue,root);
        root = queue.poll();
        root.left = null;
        root.right = null;
        TreeNode cur = root;
        while (!queue.isEmpty()){
            TreeNode node = queue.poll();
            if(node!=null){
                node.left = null;
                node.right = null;
                cur.right = node;
                cur = cur.right;
            }
        }
    }

    private void preOrder(Queue<TreeNode> queue,TreeNode root){
        if(root == null){
            return;
        }
        queue.offer(root);
        preOrder(queue,root.left);
        preOrder(queue,root.right);
    }

    private void preOrder2(Queue<TreeNode> queue,TreeNode root){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node!=null){
                queue.add(node);
            }
            if(node!=null && node.right!=null){
                stack.push(node.right);
            }
            if(node!=null&& node.left!=null){
                stack.push(node.left);
            }
        }

    }

    //92 反转链表2  1 ≤ m ≤ n ≤ 链表长度 (没有很好的理解)
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode pre = dummy;
        for(int i = 1; i < m; i++){
            pre = pre.next;
        }
        head = pre.next;
        for(int i = m; i < n; i++){
            ListNode nex = head.next;
            head.next = nex.next;
            nex.next = pre.next;
            pre.next = nex;
        }
        return dummy.next;
    }


    //回顾链表反转
    private ListNode reverse(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode cur_next;
        ListNode cur = head;
        ListNode reverseHead = null;
        while (cur!=null){
            cur_next = cur.next;
            cur.next = reverseHead;
            reverseHead = cur;

            cur = cur_next;
        }
        return reverseHead;
    }

    //二叉搜索树第k小的元素
    //中序遍历为一个递增的数组，求第k个树
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root,list,k);
        return list.get(0);
    }

    private void inorder(TreeNode root,List<Integer> list,int k){
        if (root == null){
            return;
        }
        inorder(root.left,list,k);
        if(list.size()<k){
            list.add(0,root.val);
        }else {
            return;
        }

        inorder(root.right,list,k);
    }

    //实现Trie 前缀树 208
    //反复删除链表中总和为0的序列直到不存在这样的序列

    /**
     * 输入：head = [1,2,3,-3,4]
     * 输出：[1,2,4]
     * 示例 3：
     *
     * 输入：head = [1,2,3,-3,-2]
     * 输出：[1]
     * @param head
     * @return
     * 思路借助map
     * map的键对应的是钱k个节点的和，value为对应的第k个节点
     *两次遍历
     */

    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        Map<Integer,ListNode> map = new HashMap<>();
        int sum = 0;
        ListNode d = dummy;
        while (d!=null){
            sum+=d.val;
            map.put(sum,d);
            d =d.next;
        }

        sum = 0;
        d=dummy;
        while (d!=null){
            sum+=d.val;
            d.next = map.get(sum).next;
            d=d.next;
        }
        return dummy.next;
    }

    //翻转二叉树
    public TreeNode invertTree(TreeNode root) {
        fangzhuan(root);
        return root;
    }

    private void fangzhuan(TreeNode root){
        if(root == null){
            return;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        fangzhuan(root.left);
        fangzhuan(root.right);
    }

    //450. 删除二叉搜索树中的节点
    //三种情况1.要删除的节点没有子节点，直接删除，其指针置为null
    //2.要删除的节点只有一个子节点，那删除字节点以后，直接和被删除节点的父节点相连
    //3.要删除的节点有左右子树，找出要被删除的节点的右子树的最下节点，然后交换，然后删除最小节点

    /**
     * 1.
     * @param root
     * @param key
     * @return
     */
    public TreeNode deleteNode(TreeNode root, int key) {
        TreeNode p = root;//p指向要删除的节点，初始化指向根节点
        TreeNode pp = null;//pp记录的是p的父节点
        while (p!=null && p.val!=key){
            pp = p;
            if(key>p.val)p=p.right;
            else p=p.left;
        }
        if(p == null) return root; // 没找到
        //要删除的节点有两个子节点
        if(p.left!=null && p.right!=null){ //查找右子树中的最小节点
            TreeNode minP = p.right;
            TreeNode minPP = p;
            while (minP.left!=null){
                minPP = minP;
                minP = minP.left;
            }
            p.val = minP.val;
            p=minP;
            pp = minPP;
        }
        TreeNode child;//p的子节点
        if(p.left!=null) child = p.left;
        else if(p.right!=null) child = p.right;
        else child = null;

        if(pp == null) root = child; //删除
        else if(pp.left == p)pp.left = child;
        else pp.right = child;
        return root;

    }

    //543 二叉树的直径
    private int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root){
        dfs(root);
        return diameter;
    }

    private int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int ld = dfs(root.left);
        int rd = dfs(root.right);
        diameter = Math.max(diameter,ld+rd);
        return Math.max(ld,rd)+1;
    }

    //617 合并二叉树
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2){
        if(t1 == null){
            return t2;
        }
        if(t2 == null){
            return t1;
        }
        t1.val+=t2.val;
        t1.left = mergeTrees(t1.left,t2.left);
        t1.right = mergeTrees(t1.right,t2.right);
        return t1;
    }

    //1019 链表中的下一个更大节点
    //题目意思，除了当前节点以后找最大的数
    //对单调栈的理解
    //出栈序列递增，就是单调递增栈
    //出栈序列递减，就是单调递减栈

    /**
     * 输入：[2,7,4,3,5]
     * 输出：[7,0,5,5,0]
     * @param head
     * @return
     */


    private int preIndex = 0;
    private int find(int[] inorder,int inbegin, int inend,int val){
        for (int i=inbegin;i<=inend;i++){
            if (inorder[i]==val){
                return i;
            }
        }
        return -1;
    }

    private TreeNode buildTree(int[] preorder,int[] inorder,int inbegin,int inend){
        if(inbegin>inend) return null;
        TreeNode node = new TreeNode(preorder[preIndex]);
        int index = find(inorder,inbegin,inend,preorder[preIndex]);
        if(index == -1) return null;
        preIndex++;
        node.left = buildTree(preorder,inorder,inbegin,index-1);
        node.right = buildTree(preorder,inorder,index+1,inend);
        return node;
    }

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder == null || inorder == null)return null;
        return buildTree(preorder,inorder,0,preorder.length-1);
    }


  //109 有序链表转换二叉搜索树
  public TreeNode sortedListToBST(ListNode head) {
      if (head == null) return null;
      if (head.next == null) return new TreeNode(head.val);
      ListNode pre = head, slow = head.next, fast = head.next.next;
      while (fast != null && fast.next != null) {
          pre = pre.next;
          slow = slow.next;
          fast = fast.next.next;
      }                   // slow 抵达中点！
      pre.next = null;    // pre  用于从中点断链
      TreeNode root = new TreeNode(slow.val);
      root.left  = sortedListToBST(head);
      root.right = sortedListToBST(slow.next);
      return root;
  }

  //83 删除排序链表中的重复元素
  public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode(-1);
      dummy.next = head;
      ListNode pre = dummy;
      ListNode p = head;
      while (p!=null){
          if(p.val == pre.val){
              pre.next = p.next;
          }else {
              pre = p;
          }
          p=p.next;
      }

      return dummy.next;
  }

  //538 吧二叉搜索树转换为累加树
  int add = 0;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) return root;
        convertBST(root.right);
        root.val += add;
        add = root.val;
        convertBST(root.left);
        return root;
    }

    //非负整数四则运算
    public int caculate(String express){
        Queue<String> queue = converbackExpress(express);
        Stack<String> stack = new Stack<>();
        while (!queue.isEmpty()){
            String element = queue.poll();
            if(element.matches("[0-9]+")){
                stack.push(element);
            }else {
                String youzhi = stack.pop();
                String zuozhi = stack.pop();
                String result = ""+caculate(Integer.parseInt(zuozhi),Integer.parseInt(youzhi),element);
                stack.push(result);
            }
        }
        return Integer.parseInt(stack.pop());
    }

    private int caculate(int a,int b,String operation){
        switch (operation){
            case "+":
                return a+b;
            case "-":
                return a-b;
            case "*":
                return a*b;
            case "/":
                return a/b;
        }
        return 0;
    }
    private int protity(String str){
        switch (str){
            case "-":
            case "+":
                return 0;
            case "*":
            case "/":
                return 1;
        }
        return -1;
    }

    public Queue<String> converbackExpress(String express){
        Queue<String> queue = new LinkedList<>();//用在保后缀表达式
        //中缀表达式的预处理,用空格分开
        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<express.length();i++){
            char c = express.charAt(i);
            if(Character.isDigit(c)){
                sb.append(c);
            }else {
                if(i-1>=0){
                    sb.append(" ");
                }
                sb.append(c);
                if(i+1<express.length()){
                    sb.append(" ");
                }
            }
        }
        String[] strs = sb.toString().split(" ");
        //转换为后缀表达式
        for(int i=0;i<strs.length;i++){
            String str = strs[i];
            if(str.equals(""))continue;//去除空元素
            if(str.matches("[0-9]+")){//处理数字
                queue.offer(str);
            }else {//处理符号
                if(str.equals("(")||stack.isEmpty()){
                    stack.push(str);
                }else if(str.equals(")")){
                    while (!stack.isEmpty()){
                        String element = stack.pop();
                        if(!element.equals("(")){
                            queue.offer(element);
                        }else {
                            break;
                        }
                    }
                }else {
                    while (!stack.isEmpty()){
                        String element = stack.peek();
                        if(protity(element)>=protity(str)){
                            queue.offer(stack.pop());
                        }else {
                            break;
                        }
                    }
                    stack.push(str);
                }
            }
        }
        while (!stack.isEmpty()){
            queue.offer(stack.pop());
        }
        return queue;
    }

    public String converbackExpress1(String express){
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        for (int i=0;i<express.length();i++){
            char c = express.charAt(i);
            if(Character.isDigit(c)){//数字的处理  考虑到不能直接处理表中缀表达式，因为。如果是10位数或者百味数，数字就分开了
                sb.append(c);
            }else{
                //符号的处理
                if(c == '('||stack.isEmpty()){//左符号处理
                    stack.push(c);
                }else if(c == ')'){//右符号处理
                    while (!stack.isEmpty()){
                        char elemet = stack.pop();
                       if(elemet!='('){
                           sb.append(elemet);
                       }else {
                           break;
                       }
                    }
                }else {//其他符号处理
                    while (!stack.isEmpty()){
                        char element = stack.peek();
                        if(protity(""+element)>=protity(""+c)){
                            sb.append(stack.pop());
                        }else {
                            //这里不能放进站的操作，原因是这一步有可能走不到
                            break;
                        }
                    }
                    stack.push(c);
                }
            }
        }

        while (!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }

    //回溯递归
    public boolean canJump(int[] nums) {
        return canJump(0,nums);
    }

    public boolean canJump(int position,int[] nums){
        if(position == nums.length-1){
            return true;
        }

        int furPosition = Math.min(position+nums[position],nums.length-1);
        for (int i=position+1;i<=furPosition;i++){
            if(canJump(i,nums)){
                return true;
            }
        }
        return false;
    }

    //trie 树
    class TrieNode{
        public char c;
        public TrieNode[] children = new TrieNode[26];
        public boolean isEnding = false; //表示这个节点是不是trie树中的最后一个节点

        public TrieNode(char c) {
            this.c = c;
        }
    }

    //820 单词的压缩编码
    public int minimumLengthEncoding(String[] words) {
        //构建一个words单词全部反转以后的Trie树
        for (int i=0;i<words.length;i++){
            String reverseWord = new StringBuilder(words[i]).reverse().toString();
            insert(reverseWord);
        }

        int sum = 0;
        Set<String> set = new HashSet<>();
        for(int i=0;i<words.length;i++){
            String reverseWord = new StringBuilder(words[i]).reverse().toString();
            if(set.contains(reverseWord)){
                continue;
            }else {
                set.add(reverseWord);
            }
            if(find(reverseWord)){
                sum+=words[i].length()+1;
            }
        }
        return sum;
    }

    private TrieNode root = new TrieNode('/');
    private void insert(String word) {
        TrieNode p = root;
        //稍微改动一下 用于判断是否是叶子节点
        for (int i = 0; i < word.length(); i++) {
            int index = word.charAt(i)-'a';
            if (p.children[index] == null) {
                p.children[index] = new TrieNode(word.charAt(i));
            }
            p = p.children[index];
        }
    }
    private boolean find(String word){
        TrieNode p = root;
        for(int i=0;i<word.length();i++){
            int index = word.charAt(i)-'a';
            if(p.children[index]==null){
                return false;//不存在
            }
            p=p.children[index];
        }

        //判断是不是叶子节点
        for(int i=0;i<p.children.length;i++){
            if(p.children[i]!=null){
                return false;
            }
        }
        return true;
    }



    //使用队列实现栈
    Queue<Integer> queue = new LinkedList();
    public void push(int val){
        Queue<Integer> tmp = new LinkedList<>();
        tmp.offer(val);
        while (!queue.isEmpty()){
            tmp.offer(queue.poll());
        }
        queue = tmp;
    }

    //复原ip地址
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        int a=0,b=0,c=0,d=0;
        for(a=1;a<4;a++){
            for (b=1;b<4;b++){
                for (c=1;c<4;c++){
                    for (d=1;d<4;d++){
                        if(a+b+c+d == s.length()){
                            int n1 = Integer.parseInt(s.substring(0,a));
                            int n2 = Integer.parseInt(s.substring(a,a+b));
                            int n3 = Integer.parseInt(s.substring(a+b,a+b+c));
                            int n4 = Integer.parseInt(s.substring(a+b+c,s.length()));
                            if(n1<=255 && n2<=255 && n3<=255 && n4<=255){
                                sb.append(n1).append(".").append(n2).append(".").append(n3)
                                        .append(".").append(n4);
                                result.add(sb.toString());
                                sb.delete(0,sb.length());
                            }
                        }
                    }
                }
            }
        }
        return result;

    }

    public String convert(String s, int numRows) {
        if (numRows == 1)return s;
        List<List<Character>> contains = new ArrayList<>();
        for (int i=0;i<numRows;i++){
            contains.add(new ArrayList<>());
        }

        int flag = 2*numRows-2;
        for (int i=0;i<s.length();i++){
            int index = i%flag;
            if(index<numRows){
                contains.get(index).add(s.charAt(i));
            }else {
                contains.get(2*numRows-index-2).add(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<contains.size();i++){
            for (int j=0;j<contains.get(i).size();j++){
                sb.append(contains.get(i).get(j));
            }
        }
        return sb.toString();
    }

    public int findClosest(String[] words, String word1, String word2) {
        int a = -1;
        int b = -1;
        int minValue = Integer.MAX_VALUE;
        for (int i=0;i<words.length;i++){
            if(words[i].equals(word1)){
                a=i;
                if(b!=-1){
                    minValue = Math.min(minValue,Math.abs(b-a));
                }
            }else if(words[i].equals(word2)){
                b=i;
                if(a!=-1){
                    minValue = Math.min(minValue,Math.abs(b-a));
                }
            }
        }
        if(a==-1 || b==-1){
            return 0;
        }
        return minValue;
    }












}
