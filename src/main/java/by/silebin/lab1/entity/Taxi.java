package by.silebin.lab1.entity;

public class Taxi extends RoadTransport {
   private int costPerKilometer;
   private String taxiCompanyName;
   private int kilometers;

    public Taxi(int costPerKilometer, String taxiCompanyName, int passengersCapacity, int kilometers, String name) {
        this.costPerKilometer = costPerKilometer;
        this.taxiCompanyName = taxiCompanyName;
        this.passengersCapacity = passengersCapacity;
        this.cost =  costPerKilometer * kilometers;
        this.name = name;
        this.kilometers = kilometers;
    }

    public Taxi(){

    }

    public int getCostPerKilometer() {
        return costPerKilometer;
    }

    public void setCostPerKilometer(int costPerKilometer) {
        this.costPerKilometer = costPerKilometer;
    }

    public String getTaxiCompanyName() {
        return taxiCompanyName;
    }

    public void setTaxiCompanyName(String taxiCompanyName) {
        this.taxiCompanyName = taxiCompanyName;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }
}
