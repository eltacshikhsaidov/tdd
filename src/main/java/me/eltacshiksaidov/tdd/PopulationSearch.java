package me.eltacshiksaidov.tdd;

import java.util.HashMap;
import java.util.Map;

public class PopulationSearch {

    // Refactoring 1: When empty string is passed, return NullPointerException
    // Refactoring 2: When unknown country is passed, return NullPointerException
    public int getPopulation(String country) {

        Map<String, Integer> populationMap = getPopulationByCountry();

        if (country.isEmpty()) {
            throw new NullPointerException("country should not be empty");
        }

        if (!populationMap.containsKey(country)) {
            throw new NullPointerException("Unknown country");
        } else {
            return populationMap.get(country);
        }

    }

    public Map<String, Integer> getPopulationByCountry() {
        Map<String, Integer> populationByCountry = new HashMap<>();
        populationByCountry.put("Russia", 2_000_000);
        populationByCountry.put("USA", 3_000_000);
        populationByCountry.put("China", 1_000_000);
        return populationByCountry;
    }
}
