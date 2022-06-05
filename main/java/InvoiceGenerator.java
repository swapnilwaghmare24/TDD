public class InvoiceGenerator {
    private static final double PRICE_PER_KM = 10;
    private static final int PRICE_PER_MINUTE = 1;
    private static final double MINIMUM_FARE = 5;

    public double calculateFare(double distance, int time) {
        //return distance * PRICE_PER_KM + time * PRICE_PER_MINUTE;
        double totalFare = distance * PRICE_PER_KM + time * PRICE_PER_MINUTE;
        if (totalFare < 5)
            return MINIMUM_FARE;
        return totalFare;
    }

    public double calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride : rides) {
            totalFare += this.calculateFare(ride.distance, ride.time);
        }
        return totalFare;
    }
}
