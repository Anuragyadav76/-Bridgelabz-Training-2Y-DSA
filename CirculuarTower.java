class CircularTour {

    static int tour(int[] petrol, int[] dist) {
        int start = 0;
        int balance = 0;
        int deficit = 0;

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
}