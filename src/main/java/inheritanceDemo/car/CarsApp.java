package inheritanceDemo.car;

public class CarsApp {

    public static void main(String[] args) {

        System.out.println("----------------------------------------------");
        DodgeChallenger whiteDodgeChallenger = new DodgeChallenger((byte) 3, (short) 290, (short) 390, (short) 3700, 2150000, 8329, true, "white");
        System.out.println("----------------------------------------------");
        // whiteDodgeChallenger.mileage = 0; // won't be allowed once the variables of the class are private
        System.out.println(whiteDodgeChallenger.getCarName() + "'s price is USD$" + whiteDodgeChallenger.getPrice() + "-");
        whiteDodgeChallenger.getDescription();
        whiteDodgeChallenger.startEngine();
        whiteDodgeChallenger.startElectricEcoEngine();
        System.out.println("----------------------------------------------");




        System.out.println("----------------------------------------------");
        // we need to cast the arguments
        DodgeChallenger blackDodgeChallenger = new DodgeChallenger((byte) 1, (short) 492, (short) 592, (short) 5700, 8500000, 0, false, "black");
        System.out.println("----------------------------------------------");
        System.out.println(blackDodgeChallenger.getCarName() + "'s price is USD$" + blackDodgeChallenger.getPrice() + "-");
        blackDodgeChallenger.getDescription();
        blackDodgeChallenger.startEngine();
        blackDodgeChallenger.startElectricEcoEngine();
        System.out.println("----------------------------------------------");




        System.out.println("----------------------------------------------");
        // we need to cast the arguments
        ToyotaSupra blackToyotaSupra = new ToyotaSupra((byte) 1, (short) 500, (short) 650, (short) 7200, 200000, 0, false, "black");
        System.out.println("----------------------------------------------");
        System.out.println( blackToyotaSupra.getMileage()+ "km " + blackToyotaSupra.getCarName() + "'s price is USD$" + blackToyotaSupra.getPrice() + "-");
        blackToyotaSupra.startElectricEcoEngine();
        blackToyotaSupra.startEngine();
        blackToyotaSupra.drive(1000.624); // overloading method drive
        blackToyotaSupra.setPrice(150000);
        System.out.println( blackToyotaSupra.getMileage()+ "km " + blackToyotaSupra.getCarName() + "'s price is USD$" + blackToyotaSupra.getPrice() + "-");
        blackToyotaSupra.getDescription();
        System.out.println("----------------------------------------------");


        // the following line wont work as car class was turned into abstract // UNCOMMENT TO TEST
        // Car newCar = new Car("RodrigoAuto" ,(byte) 1, (short) 500, (short) 650, (short) 7200, 200000, 0, false, "black");


    }

}
