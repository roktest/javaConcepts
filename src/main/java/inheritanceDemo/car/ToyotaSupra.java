package inheritanceDemo.car;

public class ToyotaSupra extends Car{

    public ToyotaSupra(byte numberOfVehicleOwners, short power, short horsePower, short cubicCapacity, int price, int mileage, boolean isDamaged, String color){
        //it will call the car constructor with the corresponding params
        super("Toyota Supra", numberOfVehicleOwners, power, horsePower, cubicCapacity, price, mileage, isDamaged, color);
    }

    @Override
    public void startEngine() {
        System.out.println("A Toyota Supra engine is starting");
    }
}
