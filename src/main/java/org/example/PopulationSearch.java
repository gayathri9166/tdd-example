package org.example;

import java.util.HashMap;
import java.util.Map;

public class PopulationSearch {

    public int getPopulation(String city) {
        if (city == null || city.isEmpty()) {
            return 0; // Return 0 for empty or null input city
        }

        Map<String, Integer> populationMap = getPopulationStatistic();
        Integer populationCount = populationMap.get(city);
        if (populationCount == null) {
            return 0; // Return 0 for cities not found in the population map
        }
        return populationCount;
    }

    private Map<String, Integer> getPopulationStatistic() {
        Map<String, Integer> populationMap = new HashMap<>();
        populationMap.put("Bangalore", 200000);
        populationMap.put("Hyderabad", 500000);
        populationMap.put("Pune", 300000);
        populationMap.put("Mumbai", 400000);
        return populationMap;
    }
}
