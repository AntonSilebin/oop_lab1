package by.silebin.lab1.route;

import by.silebin.lab1.entity.Transport;

import java.util.ArrayList;
import java.util.List;

public class TransportRoute {

    private List<Transport> transportList;

    public TransportRoute() {
        transportList = new ArrayList<>();
    }

    public void addTransportToRoute(Transport transport){
        transportList.add(transport);
    }

    public void deleteTransportFromRoute(Transport transport){
        transportList.remove(transport);
    }

    public List<Transport> getTransportList(){
        return transportList;
    }
}
