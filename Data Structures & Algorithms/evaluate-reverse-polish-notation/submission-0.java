class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;

                case "-": {
                    int b = stack.pop(); // الرقم الثاني
                    int a = stack.pop(); // الرقم الأول
                    stack.push(a - b);   // ✅ ترتيب صح
                    break;
                }

                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;

                case "/": {
                    int b = stack.pop(); // الرقم الثاني
                    int a = stack.pop(); // الرقم الأول
                    stack.push(a / b);   // ✅ ترتيب صح
                    break;
                }

                default:
                    // تحويل النص لرقم وإضافته للـ stack
                    stack.push(Integer.parseInt(token));
                    break;
            }
        }

        return stack.pop();
    }
}