package inheritanceDemo.car;

public class DodgeChallenger extends Car implements ElectricMode {

    public DodgeChallenger(byte numberOfVehicleOwners, short power, short horsePower, short cubicCapacity, int price, int mileage, boolean isDamaged, String color){
        //it will call the car constructor with the corresponding params
        super("Dodge Challenger", numberOfVehicleOwners, power, horsePower, cubicCapacity, price, mileage, isDamaged, color);
    }

    @Override
    public void startEngine() {
        System.out.println("A Dodge Challenger engine is starting");
    }


    @Override
    public void startElectricEcoEngine() {
        System.out.println("Dodge Challenger started Eco Electric engine - City Mode ON");
    }
}
