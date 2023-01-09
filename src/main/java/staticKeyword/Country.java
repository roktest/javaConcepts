package staticKeyword;

public class Country {

    private static int numberOfCountries;
    private final String COUNTRY_NAME;
    private int population;
    private String capital;

    static {
        numberOfCountries = 0;
    }

    public Country(String countryName, int population, String capital) {
        COUNTRY_NAME = countryName;
        this.population = population;
        this.capital = capital;
        numberOfCountries++;
    }

    public void getDetails(){
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Country name: " + COUNTRY_NAME + ", population: " + population + ", capital: " + capital);
    }

    public static int getNumberOfCountries(){
        return numberOfCountries;
    }

    public final int populationChange(int indexOfChange){
        population = population + indexOfChange;
        return population;
    }

    /**
     * after generating automatically getters and setters note that setCOUNTRY_NAME
     * was not generated due to the final keyword on variable declaration
     * private final String COUNTRY_NAME;
     */

    public String getCOUNTRY_NAME() {
        return COUNTRY_NAME;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }
}
