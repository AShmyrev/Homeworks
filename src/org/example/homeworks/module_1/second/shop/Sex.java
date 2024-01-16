package org.example.homeworks.module_1.second.shop;

public enum Sex {
    MALE('М'), FEMALE('Ж');
    private char sex;

    Sex(char userSex) {
        if ('М' == userSex) {
            this.sex = userSex;
        } else if ('Ж' == userSex) {
            this.sex = userSex;
        }
    }
}
