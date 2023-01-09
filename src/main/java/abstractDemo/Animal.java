package abstractDemo;

public abstract class Animal {

    /**
     * can't create objects of an abstract class
     * the abstract class enforces and organize what all the sub-classes must implement
     */

    int age;
    String name;

    public abstract void wakeUp();

    public abstract void brunch();

    public abstract void drinkWater();

    public abstract void goForAnAdventure();

    public abstract void makeNoise();

    public abstract void rest();

    public abstract void dinner();

    public abstract void sleep();

    // Abstract classes can have non-abstract methods
    public void printDogData(String breed){
        System.out.println("I am " + name + ", a wild " + breed + " born in the jungle(?), and have "+ age + " years of dogging");
    }

}
