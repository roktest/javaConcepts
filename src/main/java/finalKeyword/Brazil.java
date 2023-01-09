package finalKeyword;

/**
 * Cannot inherit from final 'finalKeyword.Country'
 * We need to make Country NOT FINAL
 * uncomment Country class definition
 */
public class Brazil extends Country{

    public Brazil(String countryName, int population, String capital) {
        super(countryName, population, capital);
    }

    // populationChange(int indexOfChange) cannot be overriden as it is final on the super class // UNCOMMENT TO TEST
    // public final int populationChange(int indexOfChange){...}
}
