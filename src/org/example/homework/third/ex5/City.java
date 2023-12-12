package org.example.homework.third.ex5;

import java.lang.reflect.Array;
import java.util.Arrays;

public final class City {
    private final String name;
    private final House[] houses;

    public City(String name, House[] houses) {
        this.name = name;
        this.houses = houses;
    }

    @Override
    public String toString() {
        return "City{"
                + "name='" + name + '\''
                + ", houses=" + Arrays.toString(houses)
                + '}';
    }

    public House getHouse(int houseId) {
        return houses[houseId];
    }
}
