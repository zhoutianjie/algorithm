import bean.ListNode;

import java.util.List;

public class SingleListChar {

    //头结点
    private ListCharNode head;


    public void add(char c){
        if(null == head){
            head = new ListCharNode(c);
            return;
        }
        ListCharNode cur = head;
        while (cur.next!=null){
            cur = cur.next;
        }
        cur.next = new ListCharNode(c);
    }

    public void print(){
        print(head);
    }

    public void print(ListCharNode head){
        ListCharNode cur = head;
        while (cur!=null){
            System.out.print(" "+cur.val);
            cur = cur.next;
        }
        System.out.println();
    }

    public ListCharNode inverse(){
        return inverse(head);
    }

    /**
     * 链表逆置 逆置以后原链表已经被影响 注意这一点
     */
    public ListCharNode inverse(ListCharNode head){
        if(null == head || null == head.next){
            return head;
        }
        ListCharNode current = head;
        ListCharNode currentNext;
        ListCharNode reverseHead = null;

        while (current!=null){
            currentNext = current.next;
            current.next = reverseHead;
            reverseHead = current;
            current = currentNext;

        }
        return reverseHead;
    }

    public boolean isPara(){
        boolean flag = isPara(head);
        head = null;
        return flag;
    }

    /**
     * 如果字符串用单链表保存如何判断回文串
     * 思路：快慢指针 链表逆置
     */
    public boolean isPara(ListCharNode head){
        if(null == head || null == head.next){
            System.out.println("链表元素不超过1个");
            return true;
        }
        ListCharNode fast = head;
        ListCharNode slow = head;
        ListCharNode slowPre = slow;

        while (fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slowPre = slow;
            slow = slow.next;
        }

        ListCharNode leftList = head;
        ListCharNode rightList = slow.next;
        if(fast.next!=null){
            //偶数节点个数
            //断开成两条链表
            slow.next = null;
        }else {
            //奇数个节点个数
            slowPre.next = null;
        }

        ListCharNode reverse = inverse(leftList);
        return isMatch(reverse,rightList);

    }

    //left和right是等长的非空链表
    private boolean isMatch(ListCharNode left,ListCharNode right){
        while (left!=null && right!=null){
            if(left.val != right.val){
               return false;
            }else {
                left = left.next;
                right = right.next;
            }
        }
        return true;
    }



    private static class ListCharNode{
        public char val;
        public ListCharNode next;
        public ListCharNode(char val) {
            this.val = val;
        }
    }


}
