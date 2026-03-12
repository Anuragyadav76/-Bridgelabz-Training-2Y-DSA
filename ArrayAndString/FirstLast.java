public class FirstLast{

    static int first(int[] arr, int target) {

        int left = 0, right = arr.length - 1, result = -1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                result = mid;
                right = mid - 1;
            } else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return result;
    }

    static int last(int[] arr, int target) {

        int left = 0, right = arr.length - 1, result = -1;

        while (left <= right) {

            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                result = mid;
                left = mid + 1;
            } else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return result;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 4, 4, 6, 8};

        System.out.println("First: " + first(arr, 4));
        System.out.println("Last: " + last(arr, 4));
    }
}
