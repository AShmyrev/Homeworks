package org.example.homeworks.module_1.third.ex1;

public abstract class ConiferousTree extends Tree {
    private boolean needleType;

    /** true - крупный, false - мелкий */
    public ConiferousTree(boolean needleType) {
        this.needleType = needleType;
    }
}
