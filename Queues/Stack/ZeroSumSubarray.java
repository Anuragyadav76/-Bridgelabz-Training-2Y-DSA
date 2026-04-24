import java.util.HashMap;

public class ZeroSumSubarray {

    public static void main(String[] args) {

        int arr[] = {6, -1, -3, 4, -2, 2, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        int sum = 0, count = 0;

        for (int x : arr) {

            sum += x;

            if (sum == 0)
                count++;

            if (map.containsKey(sum))
                count++;

            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }

        System.out.println("Count = " + count);
    }
}
