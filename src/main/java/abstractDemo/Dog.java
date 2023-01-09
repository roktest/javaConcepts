package abstractDemo;

public class Dog extends Animal implements DomesticAnimalStuff{

    private String breed;

    // implemented from abstract class Animal
    @Override
    public void wakeUp() {
        System.out.println("Wake up after a busy day");
    }

    @Override
    public void makeNoise() {
        System.out.println("Bark as loud as I can");
    }

    @Override
    public void rest() {
        System.out.println("I do rest some more time... It never hurts");
    }

    @Override
    public void brunch() {
        System.out.println("Brunch like crazy fast");
    }

    @Override
    public void drinkWater() {
        System.out.println("Drink a lot of water, fast");
    }

    @Override
    public void goForAnAdventure() {
        System.out.println("Go for an adventure");
    }

    @Override
    public void dinner() {
        System.out.println("Dinner like crazy at night");
    }

    @Override
    public void sleep() {
        System.out.println("zzzzzzz ");
    }

    // implemented from interface DomesticAnimalStuff
    @Override
    public void goForAWalk() {
        System.out.println("Go for a walk");
    }

    @Override
    public void poopTree() {
        System.out.println("Poop on a tree");
    }

    @Override
    public void peeTree() {
        System.out.println("Pee on a tree");
    }

    @Override
    public void returnBackHome() {
        System.out.println("Return from the walk");
    }

    @Override
    public void playWithToys() {
        System.out.println("Play with a bone toy");
    }

    // getters and setters
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
