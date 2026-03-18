import java.util.HashSet;

public class PairSum {

    public static void main(String[] args) {

        int arr[] = {10, 15, 3, 7};
        int target = 17;

        HashSet<Integer> set = new HashSet<>();

        for (int x : arr) {

            if (set.contains(target - x)) {
                System.out.println("Pair Found");
                return;
            }

            set.add(x);
        }

        System.out.println("No Pair");
    }
}