package classesAndObjectsCars;

public class CarsApp {

    public static void main(String[] args) {

        System.out.println("-----------------------------------");
        DodgeChallenger whiteDodgeChallenger = new DodgeChallenger((byte) 3, (short) 290, (short) 390, (short) 3700, 2150000, 8329, true, "white");
        System.out.println("-----------------------------------");
        // whiteDodgeChallenger.mileage = 0; // won't be allowed once the variables of the class are private
        whiteDodgeChallenger.getDescription();
        whiteDodgeChallenger.startEngine();
        System.out.println("-----------------------------------");
        System.out.println("///////////////////////////////////");
        System.out.println("-----------------------------------");
        // we need to cast the arguments
        DodgeChallenger blackDodgeChallenger = new DodgeChallenger((byte) 1, (short) 492, (short) 592, (short) 5700, 8500000, 0, false, "black");
        System.out.println("-----------------------------------");
        blackDodgeChallenger.getDescription();
        blackDodgeChallenger.startEngine();
        System.out.println("-----------------------------------");
    }

}
