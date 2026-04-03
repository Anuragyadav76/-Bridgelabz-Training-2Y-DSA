public class CountingSortAges {

    public static void countingSort(int[] ages) {

        int maxAge = 18;
        int minAge = 10;

        int[] count = new int[maxAge + 1];

        for (int age : ages)
            count[age]++;

        int index = 0;

        for (int i = minAge; i <= maxAge; i++) {

            while (count[i] > 0) {

                ages[index++] = i;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {

        int[] ages = {15, 12, 18, 10, 14, 12, 16};

        countingSort(ages);

        System.out.println("Sorted Student Ages:");

        for (int a : ages)
            System.out.print(a + " ");
    }
}