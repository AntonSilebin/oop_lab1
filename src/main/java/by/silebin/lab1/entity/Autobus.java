package by.silebin.lab1.entity;

public class Autobus extends RoadTransport {
    public Autobus(String name, int cost){
        super(name, cost);
    }

    public Autobus(){

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

    @Override
    public int getWheelsAmount() {
        return super.getWheelsAmount();
    }

    @Override
    public void setWheelsAmount(int wheelsAmount) {
        super.setWheelsAmount(wheelsAmount);
    }

    @Override
    public int getFuelPerKilometer() {
        return super.getFuelPerKilometer();
    }

    @Override
    public void setFuelPerKilometer(int fuelPerKilometer) {
        super.setFuelPerKilometer(fuelPerKilometer);
    }

    @Override
    public int getPassengersCapacity() {
        return super.getPassengersCapacity();
    }

    @Override
    public void setPassengersCapacity(int passengersCapacity) {
        super.setPassengersCapacity(passengersCapacity);
    }
}
