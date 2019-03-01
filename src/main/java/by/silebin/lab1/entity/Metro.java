package by.silebin.lab1.entity;

public class Metro extends RailwayTransport {
    public Metro(String name, int cost){
        super(name, cost);
    }

    public Metro(){

    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public int getCost() {
        return super.getCost();
    }

    @Override
    public void setCost(int cost) {
        super.setCost(cost);
    }
}
