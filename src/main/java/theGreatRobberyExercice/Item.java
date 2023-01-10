package theGreatRobberyExercice;

public class Item {

    private String name;
    private float value;

    public Item(String name, float value) {
        this.name = name;
        this.value = value;
    }

    public String getName(){
        return name;
    }

    public float getValue(){
        return value;
    }
}
