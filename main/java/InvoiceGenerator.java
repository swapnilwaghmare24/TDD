public class InvoiceGenerator {
    private static final double PRICE_PER_KM = 10;
    private static final int PRICE_PER_MINUTE = 1;
    private static final double MINIMUM_FARE = 5;

    public double calculateFare(double distance, int time) {
        return distance * PRICE_PER_KM + time * PRICE_PER_MINUTE;
    }
}
