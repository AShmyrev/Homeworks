package org.example.homework.four.ex2;

public class Duck implements Flyable {
    private boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    @Override
    public void fly() throws FlyException {
        if (this.isInjured) {
            throw new FlyException("утка ранена");
        }
        System.out.println("утка летит");
    }
}
