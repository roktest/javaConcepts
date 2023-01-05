package classesAndObjects;

import java.util.Random;

public class DodgeChallenger {

    byte numberOfSeats = 5;
    byte numberOfDoors = 3;
    byte numberOfVehicleOwners = 1;
    byte emissionSticker = 4;

    short power = 362;
    short horsePower = 492;
    short co2Emission = 333;
    short cubicCapacity = 6417;

    int price = 4500000;
    int mileage = 150000;

    long registrationNumber = 6528461382356028L;

    float fuelConsumptionCombined = 15.5F;
    float fuelConsumptionUrban = 21.4F;
    float fuelConsumptionExtraUrban = 13.6F;

    double fuelConsumptionPreciseAverage = 153.187526812681E-1;

    boolean isDamaged = true;
    char energyEfficiencyCategory = 'G';

    String color;

    DodgeChallenger(byte numberOfVehicleOwners, short power, short horsePower, short cubicCapacity, int price, int mileage, boolean isDamaged, String color){
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
        System.out.println("A " + color + " Dodge Challenger created");
    }

    public void startEngine(){
        System.out.println("engine started");
    }

    public void getDescription(){
        System.out.println("2018 Dodge Challenger SRT 392");
        System.out.println("Price $Arg" + price + "-");
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
        System.out.println("Color " + color);
        //System.out.println("" ++ "");
    }
}
