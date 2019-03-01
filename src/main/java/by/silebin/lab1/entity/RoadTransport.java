package by.silebin.lab1.entity;

public class RoadTransport extends Transport {
    protected int wheelsAmount;
    protected int fuelPerKilometer;
    protected int passengersCapacity;

    public RoadTransport(String name, int cost){
        super(name, cost);
    }

    public RoadTransport(){

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

    public int getWheelsAmount() {
        return wheelsAmount;
    }

    public void setWheelsAmount(int wheelsAmount) {
        this.wheelsAmount = wheelsAmount;
    }

    public int getFuelPerKilometer() {
        return fuelPerKilometer;
    }

    public void setFuelPerKilometer(int fuelPerKilometer) {
        this.fuelPerKilometer = fuelPerKilometer;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public void setPassengersCapacity(int passengersCapacity) {
        this.passengersCapacity = passengersCapacity;
    }
}
