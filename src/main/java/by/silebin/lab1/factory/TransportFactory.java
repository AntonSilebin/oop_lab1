package by.silebin.lab1.factory;

import by.silebin.lab1.entity.*;
import by.silebin.lab1.exception.TransportNotFoundException;

public class TransportFactory {
    public Transport getInstance(Transports transportName){
        switch (transportName) {
            case AUTOBUS:
                return new Autobus();
            case TAXI:
                return new Taxi();
            case METRO:
                return new Metro();
            default:
                throw new TransportNotFoundException();
            }
    }
}
