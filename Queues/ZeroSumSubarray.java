import java.util.*;

public class ZeroSumSubarray {
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};

        Set<Integer> set = new HashSet<>();
        int sum = 0;

        for (int num : arr) {
            sum += num;

            if (sum == 0 || set.contains(sum)) {
                System.out.println("Subarray exists");
                return;
            }

            set.add(sum);
        }

        System.out.println("No subarray");
    }
}