package abstractDemo;

/**
 * we can implement x amount of interfaces, but inherit just from one
 * any declared variables on interfaces are going to be static and final (even if they don't have that explicitly)
 * any method on an interface is assumed to be abstract (even if they don't have that explicitly)
 */
public interface DomesticAnimalStuff {

    public void goForAWalk();

    public void poopTree();

    public void peeTree();

    public void returnBackHome();

    // not all animals plays with toys
    public void playWithToys();
}
