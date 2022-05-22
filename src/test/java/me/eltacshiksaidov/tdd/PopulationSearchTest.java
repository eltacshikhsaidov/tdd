package me.eltacshiksaidov.tdd;

import org.junit.Assert;
import org.junit.Test;

// Unit test for PopulationSearch.java
public class PopulationSearchTest {
    
    @Test
    public void findPopulation() {
        String country = "Russia";
        int expectedPopulation = 2_000_000;
        PopulationSearch populationSearch = new PopulationSearch();
        int population = populationSearch.getPopulation(country);
        Assert.assertEquals(expectedPopulation, population);
    }

    @Test(expected = NullPointerException.class)
    public void findPopulationWithEmptyCountry() {
        String country = "";
        int expectedPopulation = 0;
        PopulationSearch populationSearch = new PopulationSearch();
        int population = populationSearch.getPopulation(country);
        Assert.assertEquals(expectedPopulation, population);
    }

    @Test(expected = NullPointerException.class)
    public void findPopulationWithUnknownCountry() {
        String country = "Mexico";
        int expectedPopulation = 0;
        PopulationSearch populationSearch = new PopulationSearch();
        int population = populationSearch.getPopulation(country);
        Assert.assertEquals(expectedPopulation, population);
    }
}
