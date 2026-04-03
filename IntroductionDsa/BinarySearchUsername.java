import java.util.Arrays;

public class BinarySearchUsername {

    public static boolean findUsername(String[] userList, String target) {

        int left = 0;
        int right = userList.length - 1;

        while (left <= right) {

            int mid = (left + right) / 2;

            int compare = userList[mid].compareTo(target);

            if (compare == 0)
                return true;

            else if (compare < 0)
                left = mid + 1;

            else
                right = mid - 1;
        }

        return false;
    }

    public static void main(String[] args) {

        String[] users = {"amit", "anurag", "rahul", "rohit", "vikas"};
        Arrays.sort(users);

        boolean result = findUsername(users, "anurag");

        System.out.println("Username Found: " + result);
    }
}