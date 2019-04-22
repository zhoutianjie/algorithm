import bean.ListNode;

/**
 * 链表实现LRU缓存淘汰算法
 * 思路：内部维护一个有序单链表，越靠近链表尾部的结点为越早之前访问的
 * 当有一个新的数据被访问时，如果该数据在缓存队列中存在，就把该数据在原来的位置删除
 * 重新插入到链表头部。如果该数据不存在，第一种情况，队列未满，就插入到链表头部，队列满了
 * 就删除链表尾部的元素，把新的元素插入到链表的头部
 */
public class LRUBaseLinkedList<T> {
    //链表长度
    private int length = 0;
    //链表容量
    private int capacity = 0;
    //头结点
    private ListNode<T> head = null;


    public LRUBaseLinkedList(int capacity) {
        this.capacity = capacity;
    }

    public void add(T data){
      if(length == 0){
          head = new ListNode<>(data);
          length++;
      }

       //遍历链表,并且保存前驱结点
        ListNode deletePre = null; //保存链表最末尾节点的前驱结点
        ListNode cur = head;
        ListNode pre = cur;
        while (cur!=null){
            if(cur.val.equals(data)){
                //插入数据和头结点数据相同的情况
                if(cur == pre){
                    return;
                }else {
                    //插入数据不和头结点相同
                    pre.next = cur.next; //删除原来的结点
                    ListNode newVal = new ListNode(data);
                    newVal.next = head;
                    head = newVal;
                    return;
                }
            }

            if(cur.next == null){
                deletePre = pre;
            }

            pre = cur;
            cur = cur.next;
        }
        if(length<capacity){
         ListNode newVal = new ListNode(data);
         newVal.next = head;
         head = newVal;
         length++;
        }else {
            ListNode newVal = new ListNode(data);
            newVal.next = head;
            head = newVal;
            deletePre.next = null;
        }
    }

    public T getCache(){
        return head.val;
    }

    public void print(){
        ListNode cur = head;
        while (cur!=null){
            System.out.print(" "+cur.val);
            cur = cur.next;
        }
        System.out.println();
    }


}
