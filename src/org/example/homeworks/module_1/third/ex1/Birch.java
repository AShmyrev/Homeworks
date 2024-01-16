package org.example.homeworks.module_1.third.ex1;

public class Birch extends DeciduousTree {

    public Birch(int age) {
        this.setAge(age);
    }
    
    @Override
    public void blossomLeaves() {
        super.blossomLeaves();
        System.out.println("Береза источает аллергены");
    }
}
