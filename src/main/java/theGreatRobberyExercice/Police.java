package theGreatRobberyExercice;

import java.util.Random;

public class Police {

    private Detective maria;

    public Police() {
        Item[] mariaItems = new Item[2];
        mariaItems[0] = new Item("Pipe", 10.0F);
        mariaItems[1] = new Item("Magnifying Glass", 15.0F);
        maria = new Detective("Maria", "La Poli", 1989, "Criminalistica", mariaItems);
    }

    public boolean catchCriminals(Gang gang){
        if(areCriminalsCaught()){
            System.out.println(maria.getName() + " managed to catch the gang");
            if (gang.getSumRobbedValue() > 0) {
                System.out.println("The stolen items are recovered");
                System.out.println("Their overall value is estimated to $" + gang.getSumRobbedValue());
            } else {
                System.out.println("The gang could not steal anything");
            }
            return true;
        } else {
            System.out.println(maria.getName() + " could not catch the criminals ");
            System.out.println("They managed to steal items valued in $" + gang.getSumRobbedValue());
            return false;
        }
    }

    private boolean areCriminalsCaught(){
        Random randomNumberGenerator = new Random();
        if(randomNumberGenerator.nextInt(101) >= Detective.SUCCESS_PERCENTAGE) {
            return false;
        }
        return true;
    }

}
