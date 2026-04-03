public class SearchSentence {

    public static void main(String[] args) {

        String[] sentences = {
                "Java is powerful",
                "Python is easy",
                "I love programming"
        };

        String word = "Python";

        for (String s : sentences) {

            if (s.contains(word)) {
                System.out.println("Found: " + s);
                return;
            }
        }

        System.out.println("Not Found");
    }
}