package org.example.homeworks.module_2.homework_3;

import org.example.homeworks.module_2.homework_3.ex1.ReviewRunner;

public class Runner {
    public static void main(String[] args) {
        //Задание №1: сортировка отзывов
        //Создать класс отзыв с полями: id отзыва, текст отзыва, количество лайков,
        // дата + время отзыва (LocalDateTime)
        //Создать коллекцию, которая хранит отсортированные отзывы по лайкам и дата + время отзыва.
        //Уникальность определяется на основе сортировки.
        //Создать comparator через лямбда выражение, для сортировки отзывов:
        //сначала у кого больше лайков, если лайки совпадают, то сначала идут более новые отзывы

        //Пример, отсортированный :
        //          (id, текст, кол-во лайков, дата+время)
        //отзыв №1: 1, отличный товар, 200, 25.01.2024 13:37
        //отзыв №2: 2, так себе товар, 100, 25.01.2024 16:37
        //отзыв №3: 3, плохой товар, 100, 25.01.2024 13:37
        ReviewRunner.run();

        //Задание №2: Сад
        //Создать два фрукта: яблоко, абрикос. (Без полей)
        //Создать функциональный интерфейс сад, который умеет выращивать фрукты.
        //Метод ничего не принимает.
        //Создать с помощью лямбд выражений 2 фермы: яблочная, абрикосовая.
        //Яблочная ферма должна отдавать яблоки(не фрукты!), абрикосовая абрикосы(не фрукты!).

        //Задание №3: Поиск пары с помощью гадания
        //Создать функциональный гадание, который на вход принимает аргумент любого типа,
        //на выход возвращает да/нет.
        //Создать с помощью лямбд выражений:
        //ромашку: принимает имя, возвращает да если в имени четное кол-во букв, нет если нечетное
        //бабку гадалку: принимает Человека(возраст,рост),
        //возвращает да - если возраст + рост больше 210, нет - если меньше или равно

        //Задание №4: Гори ясно!
        //Создать функциональный интерфейс сжигание, ничего не возвращает, принимает аргумент
        //любого типа.
        //Создать с помощью лямбд выражений:
        //атомный реактор: принимает в себя уран, печатает на экран: зеленый свет вокруг!
        //костер: принимает в себя дерево, печатает на экран: желто-красный свет вокруг!

        //Задание №5: универсальная линейка
        //Создать функциональный интерфейс линейка: принимает в себя любой тип, возвращает Integer
        //Создать с помощью лямбд выражений:
        //Измеритель лодок: на вход лодка(длина), возвращает длину лодки
        //Измеритель животных: на вход животное(длина тела, длина хвоста),
        //возвращает сумму длин тела и хвоста
    }
}
