package huawei2;

import java.util.Scanner;

/**
 * 输出单向链表中倒数第k个节点
 * 输入一个单向链表，输出该链表中倒数第k个结点，链表的倒数第1个结点为链表的尾指针。
 */

public class Solution52 {
    static class ListNode{
        public int value;
        public ListNode next;

        public ListNode(int value) {
            this.value = value;
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            int num = in.nextInt();
            ListNode head = null;
            ListNode p = head;
            for(int i=0;i<num;i++){
                int val = in.nextInt();
                if(head == null){
                    head = new ListNode(val);
                    p=head;
                    continue;
                }
                p.next = new ListNode(val);
                p=p.next;
            }
            int k = in.nextInt();
            ListNode node = getKthNode(k,head);
            if(node !=null){
                System.out.println(node.value);
            }else {
                System.out.println(0);
            }
            head = null;
        }
    }

    public static ListNode getKthNode(int k,ListNode head){
        ListNode p = head;
        ListNode q = head;
        while (k>0 && p!=null){
            p=p.next;
            k--;
        }
        if(k!=0){
            return null;
        }else {
            while (p!=null){
                p=p.next;
                q=q.next;
            }
        }
        return q;
    }
}
