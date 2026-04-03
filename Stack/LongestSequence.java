import java.util.HashSet;

public class LongestSequence {

    public static void main(String[] args) {

        int arr[] = {100, 4, 200, 1, 3, 2};

        HashSet<Integer> set = new HashSet<>();

        for (int x : arr)
            set.add(x);

        int longest = 0;

        for (int x : arr) {

            if (!set.contains(x - 1)) {

                int current = x;
                int count = 1;

                while (set.contains(current + 1)) {
                    current++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }

        System.out.println("Longest = " + longest);
    }
}