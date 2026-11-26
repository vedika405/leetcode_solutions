
class Solution {
    public int evalRPN(String[] tokens) {

        Stack<Integer> stack = new Stack<>();

        for(String token : tokens) {

            if(!token.equals("+") &&
               !token.equals("-") &&
               !token.equals("*") &&
               !token.equals("/")) {

                int x = Integer.parseInt(token);
                stack.push(x);
            }
            else {

                int op2 = stack.pop();
                int op1 = stack.pop();

                int ans = calculate(op1, op2, token);
                stack.push(ans);
            }
        }

        return stack.peek();
    }

    public int calculate(int op1, int op2, String op) {

        switch(op) {

            case "+":
                return op1 + op2;

            case "-":
                return op1 - op2;

            case "*":
                return op1 * op2;

            case "/":
                return op1 / op2;

            default:
                return 0;
        }
    }
}
