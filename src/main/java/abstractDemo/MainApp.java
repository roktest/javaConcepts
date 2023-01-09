package abstractDemo;

public class MainApp {


    public static void main(String[] args) {
        /**
         * Animal dog1 = new Dog();
         * dog1 won't be able to implement interface as Dog class is the one implementing AnimalStuff
         * that's why we need to instantiate dog as a new Dog type Dog
         */

        Dog dog = new Dog();

        dog.name = "Arnold Katz Deluca";
        dog.age = 5;
        dog.setBreed("Mini Schnauzer");

        dog.printDogData(dog.getBreed());
        dog.wakeUp();
        dog.makeNoise();
        dog.brunch();
        dog.drinkWater();
        dog.goForAWalk();
        dog.peeTree();
        dog.poopTree();
        dog.returnBackHome();
        dog.rest();
        dog.playWithToys();
        dog.dinner();
        dog.sleep();


    }

}
