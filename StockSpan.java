import java.util.*;

class StockSpan {

    static int[] calculateSpan(int[] price) {
        Stack<Integer> s = new Stack<>();
        int n = price.length;
        int[] span = new int[n];

        for (int i = 0; i < n; i++) {

            while (!s.isEmpty() && price[s.peek()] <= price[i]) {
                s.pop();
            }

            span[i] = s.isEmpty() ? (i + 1) : (i - s.peek());

            s.push(i);
        }
        return span;
    }
}