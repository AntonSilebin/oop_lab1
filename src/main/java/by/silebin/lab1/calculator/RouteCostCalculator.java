package by.silebin.lab1.calculator;

import by.silebin.lab1.entity.Transport;
import by.silebin.lab1.route.TransportRoute;

public class RouteCostCalculator {
    public int calculateRouteCost(TransportRoute route){
        return route.getTransportList()
                .stream()
                .mapToInt(Transport::getCost)
                .sum();
    }

}
