package inheritanceDemo.car;

public class ToyotaSupra extends Car implements ElectricMode {

    public ToyotaSupra(byte numberOfVehicleOwners, short power, short horsePower, short cubicCapacity, int price, int mileage, boolean isDamaged, String color){
        //it will call the car constructor with the corresponding params
        super("Toyota Supra", numberOfVehicleOwners, power, horsePower, cubicCapacity, price, mileage, isDamaged, color);
    }

    // if we delete the overriding method we would have an error because we need to override the abstract method startEngine() from abstract class Car
    // same will happen with DodgeChallenger class
    @Override
    public void startEngine() {
        System.out.println("A Toyota Supra engine is starting");
    }

    @Override
    public void startElectricEcoEngine(){
        System.out.println("Toyota Supra started Eco Electric engine - City Mode ON");
    }
}
