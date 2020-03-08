package huawei2;

import java.util.*;

/**
 * 表达式求值
 */
public class Solution55 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while (in.hasNext()){
            String exp = in.nextLine();
            String expstr = exp.replace("{","(")
                    .replace("[","(")
                    .replace("}",")")
                    .replace("]",")");
            System.out.println(getResult(operationExpressionToRPN(expstr)));
        }
    }

    private static int getResult(List<String> result) {
        if (null == result || result.size() == 0) {
            throw new RuntimeException("表达式不合法！");
        }
        Stack<String> stack = new Stack<>();
        Set<String> operation = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
        double d = 0.0d;
        for (String str : result) {
            if (!operation.contains(str)) {
                stack.push(str);
            } else {
                double up = Double.parseDouble(stack.pop());
                double down = Double.parseDouble(stack.pop());
                switch (str) {
                    case "+":
                        d = down + up;
                        break;
                    case "-":
                        d = down - up;
                        break;
                    case "*":
                        d = down * up;
                        break;
                    case "/":
                        d = down / up;
                        break;
                    default:
                        break;
                }
                stack.push(String.valueOf(d));
            }
        }
        return (int)Double.parseDouble(stack.pop());
    }


    /**
     * 将中缀表达式转换为后缀表达式
     *
     * @param operationExpression
     * @return
     */
    private static List<String> operationExpressionToRPN(String operationExpression) {
        if (null == operationExpression || "".equals(operationExpression)) {
            throw new RuntimeException("表达式不合法！");
        }
        List<String> result = new LinkedList<>();

        char[] chars = operationExpression.toCharArray();

        Set<String> operation = new HashSet<>(Arrays.asList("+", "-", "*", "/"));
        Set<String> numbers = new HashSet<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));


        Stack<String> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        String lastChar = "";
        for (char c : chars) {

            String currentChar = String.valueOf(c);

            // 上一个字符 和 当前字符 都是数字的话
            if (numbers.contains(lastChar) && numbers.contains(currentChar)) {
                String lastestChar = result.get(result.size() - 1);
                result.remove(result.size() - 1);
                result.add(lastestChar + currentChar);
                lastChar = currentChar;
                continue;
            }
            if (numbers.contains(currentChar)) {
                sb.append(currentChar);
            } else {
                /**
                 *
                 * 1：当前符号是 (, 则直接进栈
                 * 2：当前符号是 + - * /, 弹出所有优先级大于或者等于该运算符的栈顶元素，然后将该运算符入栈
                 * 3：当前符号是 ), 则把栈中的符号依次出栈，直到遇到 ）为止。
                 */

                if ("(".equals(currentChar)) {
                    stack.push(currentChar);
                } else if (operation.contains(currentChar)) {
                    /*while (true) {
                        // 栈空、栈顶符号为"("、当前符号优先级 > 栈顶符号优先级。当前符号入栈
                        if (stack.isEmpty() || getOperationLevel(stack.peek()) < getOperationLevel(currentChar) || "(".equals(stack.peek())) {
                            stack.push(currentChar);
                            break;
                        } else {
                            result.add(stack.pop());
                        }
                    }*/
                    while(!stack.isEmpty() && (getOperationLevel(stack.peek()) >= getOperationLevel(currentChar)) && !"(".equals(stack.peek())){
                        result.add(stack.pop());
                    }
                    stack.push(currentChar);
                } else if (")".equals(currentChar)) {
                    String str;
                    while (!stack.isEmpty() && !"(".equals(str = stack.pop())) {
                        result.add(str);
                    }
                }
            }

            if (!"".equals(sb.toString())) {
                result.add(sb.toString());
                sb.delete(0, sb.length());
            }
            lastChar = currentChar;
        }
        // 最后清空栈
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }
        return result;
    }

    private static int getOperationLevel(String operation) {
        int result;
        switch (operation) {
            case "+":
                result = 1;
                break;
            case "-":
                result = 1;
                break;
            case "*":
                result = 2;
                break;
            case "/":
                result = 2;
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }
}
