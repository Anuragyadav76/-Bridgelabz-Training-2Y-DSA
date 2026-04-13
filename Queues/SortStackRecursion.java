import java.util.*;

public class SortStackRecursion {

    static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int top = stack.pop();
            sortStack(stack);
            insert(stack, top);
        }
    }

    static void insert(Stack<Integer> stack, int value) {
        if (stack.isEmpty() || stack.peek() <= value) {
            stack.push(value);
            return;
        }

        int temp = stack.pop();
        insert(stack, value);
        stack.push(temp);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(1);
        stack.push(4);
        stack.push(2);

        sortStack(stack);

        System.out.println(stack); // [1, 2, 3, 4]
    }
}