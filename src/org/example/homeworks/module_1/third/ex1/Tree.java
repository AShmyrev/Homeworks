package org.example.homeworks.module_1.third.ex1;

public abstract class Tree {
    private int age;

    protected void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static double countAvgAges(Tree[] trees) {
        double treesAvgAge = 0;
        for (Tree tree : trees) {
            treesAvgAge += tree.getAge();
        }
        return treesAvgAge / trees.length;
    }
}
