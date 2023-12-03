package org.example.homework.second.shop;

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
