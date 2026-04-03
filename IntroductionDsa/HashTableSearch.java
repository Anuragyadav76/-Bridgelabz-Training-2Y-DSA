import java.util.HashSet;

public class HashTableSearch {

    public static boolean findUsername(HashSet<String> hashTable, String username) {

        return hashTable.contains(username);
    }

    public static void main(String[] args) {

        HashSet<String> users = new HashSet<>();

        users.add("amit");
        users.add("rahul");
        users.add("anurag");
        users.add("rohit");

        boolean result = findUsername(users, "anurag");

        System.out.println("Username Found: " + result);
    }
}