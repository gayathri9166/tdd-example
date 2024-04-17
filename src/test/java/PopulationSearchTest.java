import org.example.PopulationSearch;
import org.junit.Assert;
import org.junit.Test;

public class PopulationSearchTest {

    @Test
    public void findPopulation() {
        String city = "Bangalore";
        PopulationSearch ps = new PopulationSearch();
        int count = ps.getPopulation(city);
        int expectedPopulationCount = 200000;
        Assert.assertEquals(expectedPopulationCount, count);
    }

    @Test
    public void findPopulationWithEmptyInput() {
        String city = "";
        int expectedPopulationCount = 0;
        PopulationSearch ps = new PopulationSearch();
        int count = ps.getPopulation(city);
        Assert.assertEquals(expectedPopulationCount, count);
    }

    @Test
    public void findPopulationWithInvalidInput() {
        String city = "XYZ";
        int expectedPopulationCount = 0;
        PopulationSearch ps = new PopulationSearch();
        int count = ps.getPopulation(city);
        Assert.assertEquals(expectedPopulationCount, count);
    }
}
