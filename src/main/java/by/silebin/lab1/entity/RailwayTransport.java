package by.silebin.lab1.entity;

public class RailwayTransport extends Transport {
    public RailwayTransport(String name, int cost){
        super(name, cost);
    }

    public RailwayTransport(){

    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getCost() {
        return this.cost;
    }

    @Override
    public void setCost(int cost) {
        this.cost = cost;
    }
}
