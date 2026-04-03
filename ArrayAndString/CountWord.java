import java.io.*;

public class CountWord {

    public static void main(String[] args) {

        String target = "java";
        int count = 0;

        try {

            BufferedReader br = new BufferedReader(new FileReader("sample.txt"));

            String line;

            while ((line = br.readLine()) != null) {

                String[] words = line.split("\\s+");

                for (String w : words) {

                    if (w.equalsIgnoreCase(target))
                        count++;
                }
            }

            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Word Count: " + count);
    }
}
