package theGreatRobberyExercice;

import java.util.Random;

public class Gang {

    private Criminal[] gang = new Criminal[2];
    private Random randomNumberGenerator = new Random();
    private float sumRobbedValue;

    public Gang() {
        Item[] rodrigoItems = new Item[2];
        rodrigoItems[0] = new Item("Iron bar", 20.5F);
        rodrigoItems[1] = new Item("Getaway Car", 35000.0F);
        Criminal rodrigo = new Criminal("Rodrigo", "El Foka", 1988, "Computer Walrus", rodrigoItems);
        gang[0] = rodrigo;

        Item[] arnoldItems = new Item[2];
        arnoldItems[0] = new Item("Metos", 900000.5F);
        arnoldItems[1] = new Item("Amor", 9000000.0F);
        Criminal arnold = new Criminal("Arnold", "Tuto", 2018, "Stealing Hearts", arnoldItems);
        gang[1] = arnold;

    }

    public float getSumRobbedValue() {
        return sumRobbedValue;
    }

    public void printGangInfo(){
        for(Criminal gangMember: gang){
            System.out.println("-----------------------");
            gangMember.printBioData();
            System.out.println();
        }
    }

    private boolean isSuccessfulRobbery(){
        int randomNumber = randomNumberGenerator.nextInt(101);
        int summarizedSuccessChance = gang.length * Criminal.SUCCESS_PERCENTAGE;
        if(randomNumber >= summarizedSuccessChance){
            return false;
        }
        return true;
    }

    public void letsRob(Building[] buildings){
        int randomBuildingIndex = randomNumberGenerator.nextInt(buildings.length + 1);
        System.out.println("-----------------------");
        if(isSuccessfulRobbery()){
            System.out.println("The gang managed to robb the following items from the " + buildings[randomBuildingIndex].getName());
            for(Item item: buildings[randomBuildingIndex].getItems()){
                sumRobbedValue = sumRobbedValue + item.getValue();
                System.out.println("- " + item.getName());
            }
        } else {
            System.out.println("The gang tried to rob the " + buildings[randomBuildingIndex].getName() + " but they failed");
        }
    }

}
