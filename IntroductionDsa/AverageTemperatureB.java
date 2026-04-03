public class AverageTemperatureB {

    public static double calculateAverage(int[] temperature, int n) {

        double sum = temperature[0];

        for (int i = 1; i < n; i++) {
            sum = sum + temperature[i];
        }

        for (int i = 0; i < n; i++) {
            sum = sum / n;   // logical error
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] temperatures = {20, 25, 22, 24, 21};
        int n = temperatures.length;

        double result = calculateAverage(temperatures, n);
        System.out.println("Average Temperature = " + result);
    }
}