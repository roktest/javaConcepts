package theGreatRobberyExercice;

public class City {

    private Building[] buildings = new Building[4];;

    public City() {

        // set array of items of each building
        Item[] bankItems = new Item[2];
        Item[] mansionItems = new Item[2];
        Item[] supermarketItems = new Item[2];
        Item[] postOfficeItems = new Item[2];

        // set the name and value of the items on each building
        bankItems[0] = new Item("safe deposit box key", 5021006.32F);
        bankItems[1] = new Item("stamp", 50.45F);

        mansionItems[0] = new Item("safe deposit box key", 10000.76F);
        mansionItems[1] = new Item("play station 5", 500.56F);

        supermarketItems[0] = new Item("cash register", 3179.26F);
        supermarketItems[1] = new Item("ice cream", 10.69F);

        postOfficeItems[0] = new Item("letter", 10.39F);
        postOfficeItems[1] = new Item("stamp", 5.78F);

        // set the building index with the building name and the array of items on each building
        buildings[0] = new Building("Bank", bankItems);
        buildings[1] = new Building("Mansion", mansionItems);
        buildings[2] = new Building("Supermarket", supermarketItems);
        buildings[3] = new Building("Post Office", postOfficeItems);

    }

    public Building[] getBuildings() {
        return buildings;
    }
}
