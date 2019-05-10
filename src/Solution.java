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

    /**
     * 判断一个字符串是另一个字符串的子串(KMP算法 了解一下)
     *这个一定要掌握
     */

    /**
     * 如何判断一个字符串是回文
     */
    public boolean isPara(String str){
        if (str == null || str.length() == 0){
            return true;
        }
        int i=0;
        int j=str.length()-1;
        while (i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    /**
     * 递归实现?
     */
    /**(n>=0)
     * 幂函数的实现a的x幂次方（有点二分的意思所以时间复杂度应该是O(logn)）
     */
    public static long pow(int x,int n){
        if(n==0)return 1;
        if(n==1)return x;
        long tmp;
        if(n%2 == 0){
            tmp = pow(x,n/2);
            return tmp*tmp;
        }else {
            tmp = pow(x,(n-1)/2);
            return tmp*tmp*x;
        }
    }




    /**
     * 二分查找（递归和非递归）
     */
    public int binarySearch(int[] arr,int value){
        int low = 0;
        int high=arr.length-1;

        while (low<=high){
            int mid = low+(high-low)>>1;
            if(arr[mid] == value){
                return mid;
            }else if(value<arr[mid]){
                high=mid-1;
            }else {
                low=mid+1;
            }
        }
        return -1;
    }

    public int binarySearch2(int[] arr,int value){
        int low = 0;
        int high = arr.length-1;
        return binarySearc(arr,low,high,value);
    }

    private int binarySearc(int[] arr,int low,int high,int value){
        if(low>high)return -1;
        int mid=low+(high-low)>>1;
        if(arr[mid] == value){
            return mid;
        }else if(value<arr[mid]){
            return binarySearc(arr,low,mid-1,value);
        }else {
            return binarySearc(arr,mid+1,high,value);
        }
    }

    /**
     * 输入一个数组，让所有偶数在奇数前面
     * 奇数在前偶数在后(快排思想)
     */
    public int[] sortArrayByParity(int[] A) {
        int left=0;
        int right = A.length-1;

        int key=A[left];
        while (left<right){
            while (left<right && (A[right] & 1)==1){
                right--;
            }
            A[left]=A[right];

            while (left<right && (A[left] & 1)==0){
                left++;
            }
            A[right]=A[left];
        }

        A[left]=key;

        return A;
    }

    /**
     * 把一个int型数组中的数字拼成一个字符串，这个串代表的数字最小
     */
    public String convertStr(int[] arr){
        quickSort(arr,0,arr.length-1);
        StringBuilder builder = new StringBuilder();

        int k=-1;
        for (int i=0;i<arr.length;i++){
            if(arr[i] != 0){
                k=i;
                break;
            }
        }
        if(k==-1)return "0";

        for (int i=k;i<arr.length;i++){
            builder.append(""+arr[i]);
        }

        String result = new String(builder);
        return result;

    }

    /**
     * 两个栈实现一个队列
     */

    /**
     * 合并排序
     */

    /**
     * 归并排序
     */

    /**
     * 快速排序
     */

    private int partition(int[]arr,int left,int right){
        int key = arr[left];
        while (left<right){
            while (left<right && arr[right]>key){
                right--;
            }
            arr[left]=arr[right];
            while (left<right && arr[left]<=key){
                left++;
            }
            arr[right]=arr[left];
        }

        arr[left]=key;
        return left;
    }

    public void quickSort(int[] arr,int left,int right){
        if(left<right){
            int partition=partition(arr,left,right);
            quickSort(arr,left,partition-1);
            quickSort(arr,partition+1,right);
        }
    }

    /**
     * 循环移动数组 原地排序算法 时间复杂度为O(k)
     */

    public void rotate(int[] nums, int k) {
        int len = nums.length;
        for (int i=0;i<k;i++){
            int tmp = nums[0];
            for (int j=1;j<len;j++){
                nums[j-1]=nums[j];
            }
            nums[len-1]=tmp;
        }
    }

}
