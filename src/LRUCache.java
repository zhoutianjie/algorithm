import java.util.HashMap;
import java.util.Map;
/**
 * LettCode 习题
 * Serial:
 * difficulty:
 * Description:加首尾节点更好用
 */
public class LRUCache {

    private class Node{
        public int value;
        public int key;
        public Node next;
        public Node pre;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private Map<Integer,Node> map = new HashMap<>();
    private int capacity;
    private int size;
    private Node head = new Node(-1,-1);
    private Node tail = new Node(-1,-1);

    public LRUCache(int capacity) {
        this.capacity = capacity;
        size = 0;
        head.next = tail;
        tail.pre = head;
    }

    public int get(int key) {
        Node node = map.get(key);
        if(node == null){
            return -1;
        }
        del(node);
        add(node);
        return node.value;
    }

    public void put(int key, int value) {
        Node node = map.get(key);
        if(node!=null){
            node.value = value;
            del(node);
            add(node);
        }else {
            if(size<capacity){
                Node addNode = new Node(key,value);
                add(addNode);
                map.put(key,addNode);
                size++;
            }else {
                map.remove(tail.pre.key);
                del(tail.pre);
                Node addNode = new Node(key,value);
                map.put(key,addNode);
                add(addNode);
            }
        }
    }

    private void del(Node node){
       node.pre.next = node.next;
       node.next.pre = node.pre;
    }

    private void add(Node node){
       node.next = head.next;
       head.next.pre = node;
       node.pre = head;
       head.next =node;
    }
}
