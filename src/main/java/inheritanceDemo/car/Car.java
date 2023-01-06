package inheritanceDemo.car;

import java.util.Random;

public abstract class Car {

    //to stop other classes to overwrite use private
    private byte numberOfSeats = 5;
    private byte numberOfDoors = 3;
    private byte numberOfVehicleOwners = 1;
    private byte emissionSticker = 4;

    private short power = 362;
    private short horsePower = 492;
    private short co2Emission = 333;
    private short cubicCapacity = 6417;

    private int price = 4500000;
    private int mileage = 150000;

    private long registrationNumber = 6528461382356028L;

    private float fuelConsumptionCombined = 15.5F;
    private float fuelConsumptionUrban = 21.4F;
    private float fuelConsumptionExtraUrban = 13.6F;

    private double fuelConsumptionPreciseAverage = 153.187526812681E-1;

    private boolean isDamaged = true;
    private char energyEfficiencyCategory = 'G';

    private String color;
    private String carName;

    public Car(String carName, byte numberOfVehicleOwners, short power, short horsePower, short cubicCapacity, int price, int mileage, boolean isDamaged, String color){
        Random randomLongNumber = new Random();
        this.numberOfVehicleOwners = numberOfVehicleOwners;
        this.power = power;
        this.horsePower = horsePower;
        this.cubicCapacity = cubicCapacity;
        this.price = price;
        this.mileage = mileage;
        this.registrationNumber = randomLongNumber.nextLong(Long.MAX_VALUE) + 1; // https://stackoverflow.com/questions/5827023/java-random-giving-negative-numbers
        this.isDamaged = isDamaged;
        this.color = color;
        this.carName = carName;
        System.out.println("Created a " + color + " " + carName);
    }

    // as this is abstract method should not have body
    //public void startEngine(){System.out.println("engine started");}
    public abstract void startEngine();

    public void getDescription(){
        System.out.println("A " + color + " " + carName);
        System.out.println("Price USD$" + price + "-");
        System.out.println("Mileage " + mileage + "km");
        System.out.println("Is the car damaged? " + isDamaged);
        System.out.println("Registration number " + registrationNumber);
        System.out.println("Cubic capacity " + cubicCapacity + "cc");
        System.out.println("Power " + power + "KW("+ horsePower +"hp)");
        System.out.println("CO2 Emission " + co2Emission + "g/km");
        System.out.println("Emission sticker " + emissionSticker + "(Energy efficiency " + energyEfficiencyCategory + ")");
        System.out.println("Combined fuel consumption " + fuelConsumptionCombined + "l/100k");
        System.out.println("Urban fuel consumption " + fuelConsumptionUrban + "l/100k");
        System.out.println("Extra Urban fuel consumption " + fuelConsumptionExtraUrban + "l/100k");
        System.out.println("Precise Combined fuel consumption " + fuelConsumptionPreciseAverage + "l/100k");
        System.out.println("Number of previous owners " + numberOfVehicleOwners);
        System.out.println("Number of seats " + numberOfSeats);
        System.out.println("Number of doors " + numberOfDoors);
        //System.out.println("" ++ "");
    }

    public String getCarName() {
        return carName;
    }

    public int getPrice() {
        return price;
    }

    public int getMileage() {
        return mileage;
    }

    public void setPrice(int price) {
        this.price = Math.abs(price);
    }

    public void drive(int mileage){
        this.mileage = this.mileage + Math.abs(mileage);
    }
}
