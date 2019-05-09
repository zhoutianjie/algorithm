import java.util.Stack;

/**
 * 顺序栈：基于数组实现
 */
public class StatckBasedArray {

    private String[] arr;
    private int capacity;
    private int length;

    public StatckBasedArray(int capacity) {
        this.capacity = capacity;
        length = 0;
        arr = new String[capacity];
    }

    public void push(String val){
        if(length == capacity){
            //栈满了
            return;
        }
        arr[length] = val;
        length++;
    }

    public String pop(){
        if(length == 0){
            return null;
        }
        String val = arr[length-1];
        length--;
        return val;
    }

    //思考：动态扩容，利用栈实现表达式求和
    //leetcode 栈相关的练习20,155,232,844,224,682,496
    //判断括号的有效性
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(Character c:s.toCharArray()){
            if(c == '(' || c=='[' || c == '{'){
                stack.push(c);
            }else if(c == ')'){
                if(stack.isEmpty()||stack.pop()!='('){
                    return false;
                }
            }else if(c==']'){
                if(stack.isEmpty()||stack.pop()!='['){
                    return false;
                }
            }else if(c=='}'){
                if(stack.isEmpty()||stack.pop()!='{'){
                    return false;
                }
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }



}
