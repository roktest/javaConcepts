package finalKeyword;

//public final class Country {
public class Country {

    private final String COUNTRY_NAME;
    private int population;
    private String capital;


    public Country(String countryName, int population, String capital) {
        COUNTRY_NAME = countryName;
        this.population = population;
        this.capital = capital;
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
