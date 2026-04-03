import java.util.*;

class SortStack {

    static void sortStack(Stack<Integer> s) {
        if (!s.isEmpty()) {
            int x = s.pop();
            sortStack(s);
            insertSorted(s, x);
        }
    }

    static void insertSorted(Stack<Integer> s, int x) {
        if (s.isEmpty() || x > s.peek()) {
            s.push(x);
            return;
        }

        int temp = s.pop();
        insertSorted(s, x);
        s.push(temp);
    }
}