/**
 * 链表常用操作复习
 */
public class SingleListInt {

    //单链表环检测比较难

    public boolean checkCircke(ListNode head){
        if(head == null)return false;
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
            if(slow == fast){
                return true;
            }
        }
        return false;

    }

    //单链表反转
    public ListNode inverse(ListNode head){
        if(null == head || null == head.next){
            return head;
        }

        ListNode current = head;
        ListNode currentNext;
        ListNode reverseHead = null;

        while (current!=null){
            currentNext = current.next;
            current.next = reverseHead;
            reverseHead = current;
            current = currentNext;
        }
        return reverseHead;
    }

    //两个有序链表的合并
    public ListNode merger(ListNode l1,ListNode l2){
        if(null == l1)return l2;
        if(null == l2)return l1;

        ListNode cur1 = l1;
        ListNode cur2 = l2;
        ListNode head;
        if(cur1.val<cur2.val){
            head = cur1;
            cur1 =cur1.next;
        }else {
            head = cur2;
            cur2 = cur2.next;
        }
        ListNode p = head;
        while (cur1!=null && cur2!=null){
            if(cur1.val<cur2.val){
                p.next = cur1;
                cur1 = cur1.next;
            }else {
                p.next = cur2;
                cur2 = cur2.next;
            }
            p=p.next;
        }

        if(cur1 == null){
            p.next =cur2;
        }else {
            p.next = cur1;
        }
        return head;
    }

    //删除链表倒数第K个节点(k 的范围 k从1开始)
    //主要的难点是考虑一下边界值
    public ListNode deleteLastKth(ListNode head,int k){
        ListNode fast = head;
        ListNode slow = head;

        while (k>0 && fast!=null){
            fast = fast.next;
            k--;
        }
        if(k>0){
            System.out.println("k值不合法,删除失败");
            return head;
        }
        if(k == 0 && fast == null){
            //删除的就是首节点
            return head.next;
        }

        if(k == 0 && fast!=null){
            while (fast.next!=null){
                slow = slow.next;
                fast = fast.next;
            }
            slow.next = slow.next.next;
        }
        return head;
    }

    //求链表的中间节点
    public ListNode fidMiddleNode(ListNode head){
        if(null == head)return null;
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }


    /**
     * 链表排序 要求时间复杂度为O(nlogn) 空间复杂度 O(1)
     * 思路:归并+有序链表合并+拆分成两条链表
     * @param head
     * @return
     */
    public ListNode mergeSort(ListNode head){
        if(null == head || null == head.next){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;

        while (fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode right = slow.next;
        slow.next = null;
        ListNode left= head;
        ListNode l1 = mergeSort(left);
        ListNode l2 = mergeSort(right);
        return merger(l1,l2);
    }

    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        return mergeSort(head);
    }



    private static class ListNode{
        public int val;
        public ListNode next;

        public ListNode(int val) {
            this.val = val;
        }
    }
}
