public class AverageTemperatureA {

    public static double calculateAverage(int[] temperature, int n) {
        int total = 0;

        for (int i = 0; i < n; i++) {
            total = total + temperature[i];
        }

        double average = (double) total / n;
        return average;
    }

    public static void main(String[] args) {
        int[] temperatures = {20, 25, 22, 24, 21};
        int n = temperatures.length;

        double result = calculateAverage(temperatures, n);
        System.out.println("Average Temperature = " + result);
    }
}