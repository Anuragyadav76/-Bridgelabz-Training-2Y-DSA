import java.util.*;

public class PairSum {
    public static void main(String[] args) {
        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(target - num)) {
                System.out.println("Pair Found");
                return;
            }
            set.add(num);
        }

        System.out.println("No Pair");
    }
}