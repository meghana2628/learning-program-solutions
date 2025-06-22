public class FinancialForecast {

    // Recursive method to compute future value
    public static double futureValue(double presentValue, double rate, int years) {
        // Base case
        if (years == 0) {
            return presentValue;
        }

        // Recursive case
        return futureValue(presentValue, rate, years - 1) * (1 + rate);
    }

    public static void main(String[] args) {
        double pv = 50000; // Present Value (₹50,000)
        double rate = 0.05; // Annual growth rate (5%)
        int years = 10; // Forecast for 10 years

        double result = futureValue(pv, rate, years);

        System.out.printf("Future Value after %d years: ₹%.2f%n", years, result);
    }
}
