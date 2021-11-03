package day04;

public class Car {

    private double fuel;
    private int distance;

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public double getFuel() {
        return fuel;
    }

    public int getDistance() {
        return distance;
    }

    public double fuelConsumption() {
        return fuel / distance * 100.0;
    }



}
