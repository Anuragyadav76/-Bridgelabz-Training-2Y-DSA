import java.util.*;

class MinStack {
    Stack<Integer> main = new Stack<>();
    Stack<Integer> minStack = new Stack<>();

    void push(int x) {
        main.push(x);

        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    void pop() {
        if (main.pop().equals(minStack.peek())) {
            minStack.pop();
        }
    }

    int getMin() {
        return minStack.peek();
    }
}