import java.util.*;

class SlidingWindow {

    static int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new LinkedList<>();
        int n = nums.length;
        int[] result = new int[n - k + 1];

        int j = 0;

        for (int i = 0; i < n; i++) {

            // Remove out of window
            while (!dq.isEmpty() && dq.peek() < i - k + 1) {
                dq.poll();
            }

            // Remove smaller elements
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            dq.offer(i);

            if (i >= k - 1) {
                result[j++] = nums[dq.peek()];
            }
        }
        return result;
    }
}
