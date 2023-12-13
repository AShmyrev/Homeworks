package org.example.homework.third.ex5;

import java.util.Arrays;

public final class City {
    private static City city = null;
    private final String name;
    private final House[] citiesHouses;

    private City(String name, House[] houses) {
        this.name = name;
        citiesHouses = new House[houses.length];
        for (int i = 0; i < citiesHouses.length; i++) {
            citiesHouses[i] = new House(houses[i].getStreet(), houses[i].getNumber());
        }
    }

    public static City getOrCreateCity(String name, House[] houses) {
        if (city != null) {
            return city;
        }
        city = new City(name, houses);
        return city;
    }

    @Override
    public String toString() {
        return "City{"
                + "name='" + name + '\''
                + ", houses=" + Arrays.toString(citiesHouses)
                + '}';
    }

    public House getHouse(int houseId) {
        return new House(citiesHouses[houseId].getStreet(), citiesHouses[houseId].getNumber());
    }

}
