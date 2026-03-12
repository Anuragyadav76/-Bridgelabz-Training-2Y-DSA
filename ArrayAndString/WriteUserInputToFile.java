import java.io.*;

public class WriteUserInputToFile {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        FileWriter fw = new FileWriter("output.txt");

        System.out.println("Enter text (type exit to stop):");

        while (true) {

            String input = br.readLine();

            if (input.equalsIgnoreCase("exit"))
                break;

            fw.write(input + "\n");
        }

        fw.close();

        System.out.println("Data written to file.");
    }
}
