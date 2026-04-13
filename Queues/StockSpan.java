import java.util.*;

public class StockSpan {
    public static void main(String[] args) {
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int n = price.length;
        int[] span = new int[n];

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && price[stack.peek()] <= price[i]) {
                stack.pop();
            }

            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());
            stack.push(i);
        }

        System.out.println(Arrays.toString(span));
    }
}