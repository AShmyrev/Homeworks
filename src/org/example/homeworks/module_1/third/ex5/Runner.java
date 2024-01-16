package org.example.homeworks.module_1.third.ex5;

public class Runner {
    public static void run() {
        House house1 = new House("street1", 1);
        House house2 = new House("street2", 2);
        City city = new City("city", new House[]{house1, house2});
        System.out.println(city);
        house1 = city.getHouse(0);
        house2 = city.getHouse(1);
        house1.setNumber(5);
        house2.setNumber(10);
        house1.setStreet("new street name");
        house2.setStreet("new street name");
        System.out.println(house1.getNumber() + " "
                + house1.getStreet() + " "
                + house2.getNumber() + " "
                + house2.getStreet());
        System.out.println(city);
    }
}
