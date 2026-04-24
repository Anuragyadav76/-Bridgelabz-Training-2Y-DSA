import java.util.Stack;

public class SortStack {

    static void sortedInsert(Stack<Integer> s, int x) {

        if (s.isEmpty() || s.peek() <= x) {
            s.push(x);
            return;
        }

        int temp = s.pop();
        sortedInsert(s, x);
        s.push(temp);
    }

    static void sortStack(Stack<Integer> s) {

        if (!s.isEmpty()) {

            int x = s.pop();
            sortStack(s);

            sortedInsert(s, x);
        }
    }

    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>();

        s.push(3);
        s.push(1);
        s.push(4);

        sortStack(s);

        System.out.println(s);
    }
}