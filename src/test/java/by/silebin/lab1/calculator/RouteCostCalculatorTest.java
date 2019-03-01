package by.silebin.lab1.calculator;

import by.silebin.lab1.entity.Metro;
import by.silebin.lab1.entity.Taxi;
import by.silebin.lab1.route.TransportRoute;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RouteCostCalculatorTest {
    @Test
    public void testCalculateRouteCost(){
        TransportRoute transportRoute = new TransportRoute();
        transportRoute.addTransportToRoute(new Taxi(20, "jfh", 4, 2, "uashf"));
        transportRoute.addTransportToRoute(new Metro("sdhf", 10));
        RouteCostCalculator routeCostCalculator = new RouteCostCalculator();
        Assert.assertEquals(50, routeCostCalculator.calculateRouteCost(transportRoute));
    }
}
