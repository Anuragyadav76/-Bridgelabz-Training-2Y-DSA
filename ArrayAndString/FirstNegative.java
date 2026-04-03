public class FirstNegative {

    public static void main(String[] args) {

        int[] arr = {5, 10, -3, 8, -1};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < 0) {
                System.out.println("First negative index: " + i);
                return;
            }
        }

        System.out.println("-1");
    }
}
