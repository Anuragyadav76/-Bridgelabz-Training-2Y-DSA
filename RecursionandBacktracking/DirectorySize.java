package RecursionandBacktracking;

//import java.io.File;

public class DirectorySize {

    public static long getDirectorySize(File directory) {

        long size = 0;

        File[] files = directory.listFiles();

        if (files != null) {

            for (File file : files) {

                if (file.isFile()) {
                    size += file.length(); // base case
                }

                else if (file.isDirectory()) {
                    size += getDirectorySize(file); // recursive call
                }
            }
        }

        return size;
    }

    public static void main(String[] args) {

        File dir = new File("C:\\project");

        long totalSize = getDirectorySize(dir);

        System.out.println("Total Directory Size: " + totalSize + " bytes");
    }
}