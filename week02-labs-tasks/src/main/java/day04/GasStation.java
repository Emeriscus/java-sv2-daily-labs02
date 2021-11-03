package day04;

public class GasStation {

    private double price;

    public GasStation(double price) {
        this.price = price;
    }

    public double refuelingPrice(Car car, double fuel) {

        car.setFuel(fuel);// emiatt meg fog változni az átadott (már példányosított) car fuel attribútumának értéke!
        return fuel * price;

    }
}

