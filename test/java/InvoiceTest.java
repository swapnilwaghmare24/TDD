import org.junit.Assert;
import org.junit.Test;

public class InvoiceTest {
    @Test
    public void givenDistanceAndTime_ReturnTotalFare()
    {
        InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
        double distance=2.0;
        int time=5;
        double fare=invoiceGenerator.calculateFare(distance,time);
        Assert.assertEquals(25,fare,0.0);
    }
    @Test
    public void givenLessDistanceAndTime_ReturnFare()
    {
        InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
        double distance=0.3;
        int time=1;
        double fare=invoiceGenerator.calculateFare(distance,time);
        Assert.assertEquals(5,fare,0.0);
    }
    @Test
    public void givenMultipleRides_ShouldReturnTotalFare()
    {
        InvoiceGenerator invoiceGenerator=new InvoiceGenerator();
        Ride[] rides= {new Ride(2.0, 5),
                new Ride(0.1, 1),
                new Ride(1.0, 5)
        };
        double fare=invoiceGenerator.calculateFare(rides);
        Assert.assertEquals(45,fare,0.0);

    }
}
