public class CircularTour {

    static int tour(int petrol[], int dist[]) {

        int start = 0, balance = 0, deficit = 0;

        for (int i = 0; i < petrol.length; i++) {

            balance += petrol[i] - dist[i];

            if (balance < 0) {
                start = i + 1;
                deficit += balance;
                balance = 0;
            }
        }

        return (balance + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {

        int petrol[] = {6, 3, 7};
        int dist[] = {4, 6, 3};

        System.out.println("Start index: " + tour(petrol, dist));
    }
}
