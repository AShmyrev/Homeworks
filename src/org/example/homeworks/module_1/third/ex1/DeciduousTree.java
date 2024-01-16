package org.example.homeworks.module_1.third.ex1;

public abstract class DeciduousTree extends Tree {
    private boolean isThereAnyLeaves;

    public void fallLeaves() {
        this.isThereAnyLeaves = false;
    }

    public void blossomLeaves() {
        this.isThereAnyLeaves = true;
    }
}
