import java.util.*;

public class QueueUsingStacks {
    static class MyQueue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        void enqueue(int x) {
            s1.push(x);
        }

        int dequeue() {
            if (s2.isEmpty()) {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
            }
            if (s2.isEmpty()) {
                return -1;
            }
            return s2.pop();
        }
    }

    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        System.out.println(q.dequeue()); // 10
        System.out.println(q.dequeue()); // 20
    }
}