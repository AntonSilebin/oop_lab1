package by.silebin.lab1.entity;

import by.silebin.lab1.route.TransportRoute;

public abstract class Transport extends TransportRoute {
    public String name;
    protected int cost;

    public Transport(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }

    public Transport(){

    }

    public abstract String getName();

    public abstract void setName(String name);

    public abstract int getCost();

    public abstract void setCost(int cost);
}
