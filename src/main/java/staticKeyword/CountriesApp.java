package staticKeyword;

public class CountriesApp{

    public static void main(String[] args) {

        System.out.println("Number Of Countries " + Country.getNumberOfCountries());
        System.out.println();

        Country argentina = new Country("Argentina", 45000000, "Buenos Aires");
        Country brazil = new Country("Brazil", 210000000, "Brasilia");
        Country germany = new Country("Germany", 83000000, "Berlin");
        Country japan = new Country("Japan", 125000000, "Tokyo");

        argentina.getDetails();
        brazil.getDetails();
        germany.getDetails();
        japan.getDetails();

        System.out.println();
        System.out.println("Number Of Countries " + Country.getNumberOfCountries());

    }

}
