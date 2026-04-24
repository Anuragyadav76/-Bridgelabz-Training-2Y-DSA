public class LinearSearch {

    public static boolean findUsername(String[] userList, String targetUsername) {

        for (int i = 0; i < userList.length; i++) {
            if (userList[i].equals(targetUsername)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        String[] users = {"amit", "rahul", "rohit", "anurag", "vikas"};

        boolean result = findUsername(users, "anurag");

        System.out.println("Username Found: " + result);
    }
}
