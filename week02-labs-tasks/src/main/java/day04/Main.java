package day04;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        car.setFuel(13.2);
        car.setDistance(200);

        GasStation gasStation = new GasStation(465.2);

        System.out.println("Fogyasztás: " + car.fuelConsumption() + " l/100km");

        System.out.println("Fizetendő: " + gasStation.refuelingPrice(car, 30) + " Ft");
        car.setDistance(450);

        System.out.println("Fogyasztás: " + car.fuelConsumption() + " l/100km");

    }
}
