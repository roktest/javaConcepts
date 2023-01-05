package classesAndObjects;

public class CarsApp {

    public static void main(String[] args) {

        System.out.println("---------------------------------");
        DodgeChallenger dodgeChallenger = new DodgeChallenger();
        System.out.println("---------------------------------");
        dodgeChallenger.getDescription();
        dodgeChallenger.startEngine();
        // TODO: fix this, as color would be null on the above case

        System.out.println("---------------------------------");
        // we need to cast the arguments
        DodgeChallenger anotherDodgeChallenger = new DodgeChallenger((byte) 1, (short) 392, (short) 492, (short) 6700, 8500000, 0, false, "black");
        System.out.println("---------------------------------");
        anotherDodgeChallenger.getDescription();
        anotherDodgeChallenger.startEngine();

    }

}
