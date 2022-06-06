public class InvoiceSummary {
    private final int rides;
    private final double fare;
    private final double average;

    public InvoiceSummary(int rides, double fare) {
        this.rides=rides;
        this.fare=fare;
        this.average=this.fare/this.rides;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InvoiceSummary that = (InvoiceSummary) o;
        return rides == that.rides && Double.compare(that.fare, fare) == 0 && Double.compare(that.average, average) == 0;
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
