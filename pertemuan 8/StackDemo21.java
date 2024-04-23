public class StackDemo21 {
    public static void main(String[] args) {
        Stack21 stack = new Stack21(10);
        stack.push(8);
        stack.push(12);
        stack.push(18);
        stack.print();
        stack.pop();
        stack.peek();
        stack.push(-5);
        stack.print();
    }    
}