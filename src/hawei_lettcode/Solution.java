package hawei_lettcode;



import java.util.*;

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
    //5 最长回文字串
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 1){
            return s;
        }
        for (int i=0;i<s.length();i++){
            GetMaxLen(s,i,i);
            GetMaxLen(s,i,i+1);
        }
        return s.substring(index,index+maxLen);
    }

    private int maxLen = 0;
    private int index = 0;

    private void GetMaxLen(String s,int i,int j){
        while (i>=0 && j<s.length() && s.charAt(i)==s.charAt(j)){
            if(maxLen<j-i+1){
                maxLen = j-i+1;
                index = i;
            }
            i--;j++;
        }
    }


    //3 无重复字符的最长子串
    //滑动窗口来解答
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i + 1);
            map.put(s.charAt(j), j + 1);
        }
        return ans;
    }

    public int lengthOfLongestSubstring1(String s){
        Map<Character, Integer> map = new HashMap<>();
        int maxlen = 0;
        int i=0,j=0;
        for (j=0;j<s.length();j++){
            if(map.containsKey(s.charAt(j))){
                i=Math.max(i,map.get(s.charAt(j)));
            }
            maxlen = Math.max(maxlen,j-i+1);
            map.put(s.charAt(j),j+1);
        }
        return maxlen;
    }

    //两数之和
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] twoSum = new int[2];
        for(int i=0;i<nums.length;i++){
            int sum = target-nums[i];
            if(map.containsKey(sum)){
                twoSum[0]=map.get(sum);
                twoSum[1]=i;
                return twoSum;
            }else {
                map.put(nums[i],i);
            }
        }
        return twoSum;
    }

    //2 两数相加
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode head = new ListNode(0);
        ListNode p = head;
        int val = 0;
        while (p1!=null && p2!=null){
            p.next = new ListNode((p1.val+p2.val+val)%10);
            val = (p1.val+p2.val+val)/10;
            p1=p1.next;
            p2=p2.next;
            p=p.next;
        }

        ListNode p3 = p1!=null ? p1:p2;
        while (p3!=null){
            p.next = new ListNode((p3.val+val)%10);
            val = (p3.val+val)/10;
            p3 = p3.next;
            p=p.next;
        }

        if(val == 1){
            p.next = new ListNode(1);
        }
        return head.next;
    }

    //7 整数反转 注意要判断反转以后有没有溢出
    public int reverse(int x) {
        int y = 0;
        int tmp = 0;
        while (x!=0){
            tmp = y;
            y=10*tmp+(x%10);
            if(x>0 && (y-(x%10))/10<tmp)return 0;
            if(x<0 && (y-(x%10))/10>tmp)return 0;
            x=x/10;
        }
        return y;
    }

    //20 有效括号
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c == '('|| c=='{'||c=='['){
                stack.push(c);
            }else if(c == ')'){
                if(stack.isEmpty() || stack.pop()!='('){
                    return false;
                }
            }else if(c==']'){
                if(stack.isEmpty() || stack.pop()!='['){
                    return false;
                }
            }else {
                if(stack.isEmpty() || stack.pop()!='{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    //字符串相乘  累加的时间复杂度太高了
    public String multiply(String num1, String num2) {
//        String sum = "0";
//        for (int i=0;i<Integer.parseInt(num2);i++){
//            sum = addLongStr(sum,num1);
//        }
//        return sum;
        if(num1.equals("0")||num2.equals("0")){
            return "0";
        }
        StringBuilder sb = new StringBuilder(num2).reverse();
        String sum = "0";
        String result = "0";
        for(int i=0;i<sb.length();i++){
            sum = "0";
            for (int j=0;j<Integer.parseInt(""+sb.charAt(i));j++){
                sum = addLongStr(sum,num1);
            }
            for (int k=0;k<i;k++){
                sum+="0";
            }
            result=addLongStr(result,sum);
        }
        return result;
    }

    private String addLongStr(String num1,String num2){
        StringBuilder sb1 = new StringBuilder(num1).reverse();
        StringBuilder sb2 = new StringBuilder(num2).reverse();
        StringBuilder sb = new StringBuilder();
        int sum = 0;
        int val = 0;
        int len1 = sb1.length();
        int len2 = sb2.length();
        int len = len1<len2?len1:len2;
        for(int i=0;i<len;i++){
            sum = Integer.parseInt(""+sb1.charAt(i))+Integer.parseInt(""+sb2.charAt(i))+val;
            sb.append(sum%10);
            val = sum/10;
        }
        if(len == len1){
            for (int i=len;i<len2;i++){
                sum=Integer.parseInt(""+sb2.charAt(i))+val;
                sb.append(sum%10);
                val = sum/10;
            }
        }else {
            for (int i=len;i<len1;i++){
                sum = Integer.parseInt(""+sb1.charAt(i))+val;
                sb.append(sum%10);
                val = sum/10;
            }
        }
        if (val==1){
            sb.append(1);
        }
        return sb.reverse().toString();
    }

    //53 最大字序和
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int curSum = nums[0];
        for(int i=1;i<nums.length;i++){
            curSum = Math.max(nums[i],curSum+nums[i]);
            maxSum = Math.max(maxSum,curSum);
        }
        return maxSum;
    }
    public int maxSub(int[] nums){
        int sum = 0;
        int max = 0;
        for(int i=0;i<nums.length;i++){
            if(sum>0){
                sum+=nums[i];
            }else {
                sum = nums[i];
            }
            max = Math.max(sum,max);
        }
        return max;
    }

    public String decodeString(String s) {
        Stack<String> digitStack = new Stack<>();
        Stack<String> letterStack = new Stack<>();
        String digitalStr = "";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                digitalStr+=c;
            }else {
                if(!digitalStr.equals("")){
                    digitStack.push(digitalStr);
                    digitalStr = "";
                }

                if(c == '['|| Character.isLetter(c)){
                    letterStack.push(""+c);
                }else {
                    StringBuilder tmp = new StringBuilder();
                    int num = Integer.parseInt(digitStack.pop());
                    while (!letterStack.isEmpty() && letterStack.peek().charAt(0)!='['){
                        tmp.append(letterStack.pop());
                    }
                    letterStack.pop();

                    for (int j=0;j<num;j++){
                        for (int k=tmp.length()-1;k>=0;k--){
                            letterStack.push(""+tmp.charAt(k));
                        }
                    }
                }
            }
        }
        StringBuilder result = new StringBuilder();
        while (!letterStack.isEmpty()){
            result.append(letterStack.pop());
        }
        return result.reverse().toString();
    }

    public int myAtoi(String str) {
       String temp="";
       for (int i=0;i<str.length();i++){
           if(str.charAt(i)!=' '){
               temp = str.substring(i);
               break;
           }
       }
       if (temp.equals(""))return 0;
       StringBuilder sb = new StringBuilder();
       if(temp.charAt(0)=='+'){
           for (int i=1;i<temp.length();i++){
               char c = temp.charAt(i);
               if(Character.isDigit(c)){
                   sb.append(c);
               }else {
                   break;
               }
           }
           if(sb.toString().equals(""))return 0;
           if(compare(sb.toString(),""+Integer.MAX_VALUE)==1){
               return Integer.MAX_VALUE;
           }else {
               return Integer.parseInt(sb.toString());
           }
       }else if(temp.charAt(0)=='-'){
           for (int i=1;i<temp.length();i++){
               char c = temp.charAt(i);
               if(Character.isDigit(c)){
                   sb.append(c);
               }else {
                   break;
               }
           }
           if(sb.toString().equals(""))return 0;
           if(compare("-"+sb.toString(),""+Integer.MIN_VALUE)==-1){
               return Integer.MIN_VALUE;
           }else {
               return -Integer.parseInt(sb.toString());
           }
       }else if(Character.isDigit(temp.charAt(0))){
           for (int i=0;i<temp.length();i++){
               char c = temp.charAt(i);
               if(Character.isDigit(c)){
                   sb.append(c);
               }else {
                   break;
               }
           }
           if(sb.toString().equals(""))return 0;
           if(compare(sb.toString(),""+Integer.MAX_VALUE)==1){
               return Integer.MAX_VALUE;
           }else {
               return Integer.parseInt(sb.toString());
           }
       }else {
          return 0;
       }
    }

    private int compare(String str1,String str2){
        if(str1.equals(str2)){
            return 0;
        }
        int len1 = str1.length();
        int len2 = str2.length();
        if(len1!=len2){
            if(len1<len2){
                return -1;
            }else {
                return 1;
            }
        }else {
            for (int i=0;i<len1;i++){
                if(str1.charAt(i)==str2.charAt(i)){
                    continue;
                }
                if(str1.charAt(i)<str2.charAt(i)){
                    return -1;
                }else {
                    return 1;
                }
            }
        }
        return 0;
    }

    public boolean isSymmetric(TreeNode root) {
        if(root == null)return true;
        return isMirror(root.left,root.right);
    }

    public boolean isMirror(TreeNode left,TreeNode right){
        if(left == null && right == null){
            return true;
        }
        if(left!=null && right == null){
            return false;
        }
        if(left == null && right!=null){
            return false;
        }

        if(left!=null && right!=null){
            if(left.val!=right.val){
                return false;
            }else{
                return isMirror(left.left,right.right)
                        && isMirror(left.right,right.left);
            }
        }

        return true;
    }

    //盛水最多的容器
    //双指针法
    //决定水位高低的是短的那条
    //一个指针指向开头，一个指针指向结尾
    //每次更新，长度短的指针向长度长的指针靠近一步
    //
    public int maxArea(int[] height) {
        int maxValue = 0;
        int i=0;
        int j=height.length-1;
        while (i<j){
            int h = height[i] <height[j]?height[i]:height[j];
            int val = (j-i)*h;
            if(maxValue<val){
                maxValue = val;
            }
            if(height[i]<height[j]){
                i++;
            }else {
                j--;
            }
        }
        return maxValue;
    }

    //相交链表
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        if(headA == null || headB == null){
            return null;
        }
        ListNode pA = headA;
        ListNode pB = headB;
        while (pA!=pB){
            pA = pA == null?headB:pA.next;
            pB = pB == null?headA:pB.next;
        }
        return pA;
    }

    //链表排序
    public ListNode sortList(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode pre = head;
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while (fast!=null && fast.next!=null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        return mergeTwoList(sortList(head),sortList(slow));
    }

    public ListNode mergeTwoList(ListNode l1,ListNode l2){
        if(l1 == null)return l2;
        if(l2 == null)return l1;
        ListNode p1 = l1;
        ListNode p2 = l2;
        ListNode head;
        if(p1.val<p2.val){
            head = p1;
            p1= p1.next;
        }else {
            head = p2;
            p2=p2.next;
        }
        ListNode p3 = head;
        while (p1!=null && p2!=null){
            if(p1.val<p2.val){
                p3.next = p1;
                p1=p1.next;
            }else {
                p3.next = p2;
                p2=p2.next;
            }
            p3=p3.next;
        }

        if(p1!=null){
            p3.next = p1;
        }else {
            p3.next = p2;
        }
        return head;
    }

    //判断是否是有效的二叉搜索树
    public boolean isValidBST(TreeNode root){
        List<Integer> list = new ArrayList<>();
        inorder(root,list);
        for (int i=0;i<list.size()-1;i++){
            if(list.get(i)>=list.get(i+1)){
                return false;
            }
        }
        return true;
    }

    private void inorder(TreeNode root,List<Integer> list){
        if(root == null) return;
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
    }

    //是否有环
    public boolean hasCycle(ListNode head){
        if(head == null){
            return false;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    //二叉树的中序遍历 迭代
    public List<Integer> inorderTraversal(TreeNode root){
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        do {
            while (root!=null){
                stack.push(root);
                root=root.left;
            }

            if (!stack.isEmpty()){
                TreeNode node = stack.pop();
                result.add(node.val);
                root = node.right;
            }

        }while (!stack.isEmpty() || root!=null );

        return result;
    }

    //二叉树的前序遍历
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if(root == null){
            return result;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            result.add(node.val);
            if(node.right!=null){
                stack.push(node.right);
            }
            if(node.left!=null){
                stack.push(node.left);
            }
        }
        return result;
    }

    //二叉树的层次遍历2
    public List<List<Integer>> levelOrderBottom(TreeNode root){
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
            result.add(0,list);
        }
        return result;
    }

    //两两交换节点
    public ListNode swapPairs(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode p1 = head;
        ListNode p2 = head.next;
        ListNode p3;
        ListNode p4;
        p3 = p2.next;
        p1.next = p2.next;
        p2.next = p1;
        head = p2;
        p4 = p1;
        p1 = p3;
        if(p1 == null)return head;
        p2 = p1.next;

        while (p1!=null && p2!=null){
            p3 = p2.next;
            p1.next = p2.next;
            p2.next = p1;
            p4.next = p2;

            p4 = p1;
            p1=p3;
            if (p1 == null)break;
            p2 = p1.next;

        }
        return head;
    }

    //复制带随机指针的链表

    public Node copyRandomList(Node head){
        if(head == null){
            return head;
        }
        Map<Node,Node> map = new HashMap<>();
        Node p = head;
        while (p!=null){
            Node clone = new Node(p.val);
            map.put(p,clone);
            p=p.next;
        }

        p=head;
        while (p!=null){
            map.get(p).next = map.get(p.next);
            map.get(p).random = map.get(p.random);
            p=p.next;
        }
        return map.get(head);
    }

    //合并二叉树
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2){
        if(t1 == null){
            return t2;
        }
        if(t2 == null){
            return t1;
        }
        t1.val+=t1.val+t2.val;
        t1.left = mergeTrees(t1.left,t2.left);
        t1.right = mergeTrees(t1.right,t2.right);
        return t1;
    }

    //环形链表2
    public ListNode detectCycle(ListNode head){
        if(head == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head;
        int cnt = 1;
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

    //重排链表
    //快慢指针断开链表，后半段链表逆置
    //然后两个链表再交叉合并
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

    //二叉树的最近公共祖先
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root == null || p == null || q == null){
            return null;
        }
        if(p.val<q.val){
            return lowestAncestor(root,p,q);
        }else {
            return lowestAncestor(root,q,p);
        }

    }

    private TreeNode lowestAncestor(TreeNode root,TreeNode p,TreeNode q){
        if(root!=null){
            if( root.val>=p.val && root.val<=q.val){
                return root;
            }else if(root.val<p.val){
                return lowestAncestor(root.right,p,q);
            }else {
                return lowestAncestor(root.left,p,q);
            }

        }else {
            return null;
        }
    }

    //二叉树展开为链表
    //前序遍历
    public void flatten(TreeNode root){
        if(root == null){
            return;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        preOrder(root,queue);
        root = queue.poll();
        root.right = null;
        root.left = null;
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

    private void preOrder(TreeNode root,Queue<TreeNode> queue){
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
                stack.add(node.right);
            }

            if(node!=null && node.left!=null){
                stack.add(node.left);
            }
        }
    }

    //删除总和为0的节点
    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        Map<Integer,ListNode> map = new HashMap<>();
        dummy.next = head;
        ListNode d = dummy;
        int sum = 0;
        while (d!=null){
            sum+=d.val;
            map.put(sum,d);
            d=d.next;
        }
        d = dummy;
        sum = 0;
        while (d!=null){
            sum+=d.val;
            d.next = map.get(sum).next;
            d=d.next;
        }
        return dummy.next;
    }

    //翻转二叉搜索树
    public TreeNode invertTree(TreeNode root){
        fangzhuang(root);
        return root;
    }

    private void fangzhuang(TreeNode root){
        if(root == null){
            return;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        fangzhuang(root.left);
        fangzhuang(root.right);

    }

    //删除二叉搜索树的节点
    public TreeNode deleteNode(TreeNode root, int key){
        TreeNode p = root;
        TreeNode pp = null;
        while (p!=null && p.val!=key){
           if(p.val<key)p=p.right;
           else p=p.left;
        }
        if(p==null) return null; // 没有找到
        if(p.left!=null && p.right!=null){//p节点有左右子树
            TreeNode minP = p.right;
            TreeNode minPP = minP;
            while (minP.left!=null){
                minPP = minP;
                minP = minP.left;
            }
            p.val = minP.val;
            p = minP;
            pp = minPP;
        }
        TreeNode child;
        if(p.left != null) child = p.left;
        else if(p.right!=null) child = p.right;
        else child = null;

        if(pp==null) root = child;
        else if (pp.left == p) pp.left = child;
        else pp.right = child;
        return root;
    }


    //根据前序和中序构造二叉树
    private int preIndex = 0;
    public TreeNode buildTree(int[] preorder, int[] inorder){
        if(preorder == null || inorder == null) return null;
        return buildTree(preorder,inorder,0,preorder.length-1);
    }

    private TreeNode buildTree(int[] preorder,int[] inorder,int inbegin,int inend){
        if(inbegin<inend){
            int index = find(inorder,inbegin,inend,preorder[preIndex]);
            if(index == -1) return null;
            preIndex++;
            TreeNode root = new TreeNode(inorder[index]);
            root.left = buildTree(preorder,inorder,inbegin,index-1);
            root.right= buildTree(preorder,inorder,index+1,inend);
            return root;
        }
        return null;
    }

    private int find(int[] inorder,int inbegin,int inend,int val){
        for (int i=inbegin;i<=inend;i++){
            if(val == inorder[i]){
                return i;
            }
        }
        return -1;
    }

    /**
     * 有序链表转换成高度平衡的二叉树
     * @param head
     * @return
     */
    public TreeNode sortedListToBST(ListNode head){
        if(head == null)return null;
        if(head.next == null) return new TreeNode(head.val);
        ListNode pre = head;
        ListNode slow = head.next;
        ListNode fast = head.next.next;
        while (fast!=null && fast.next!=null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        TreeNode root = new TreeNode(slow.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(slow.next);
        return root;
    }

    //二叉树转换为雷家书
    private int add=0;
    public TreeNode convertBST(TreeNode root){
        if(root == null) return null;
        convertBST(root.right);
        root.val+=add;
        add = root.val;
        convertBST(root.left);
        return root;
    }


}


