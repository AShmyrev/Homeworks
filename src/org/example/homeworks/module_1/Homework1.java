package org.example.homeworks.module_1;

import java.math.BigDecimal;

public class Homework1 {
    public static void main(String[] args) {
//        ex1();
//        ex2();
//        ex3();
        ex4();
    }

    public static void ex1() {
        //Дана строка
        String name = "     ПЕтРов Олег Иванович     ";
        //Необходимо
        //1. убрать лишние пробелы,
        name = name.trim();
        //2. перевести текст в верхний регистр
        name = name.toUpperCase();
        System.out.println(name);
        //3. Если содержит "ова " то печатаем на экран: Уважаемая {name}
        // Если содержит "ов " то печатаем на экран: Уважаемый {name}
        // В иных случаях печатаем на экран: Неизвестное лицо {name}
        if (name.contains("ОВА ")) {
            System.out.println("Уважаемая, " + name);
        } else if (name.contains("ОВ ")) {
            System.out.println("Уважаемый, " + name);
        } else {
            System.out.println("Неизвестное лицо, " + name);
        }
    }

    public static void ex2() {
        //У нас есть машина. В данной машине есть есть перечень проверок, перед запуском
        //Количество топлива
        double fuel = 10;
        //Проверка двигателя
        boolean isEngineWork = true;
        //Проверка отсутствия ошибок (false - ошибок нет)
        boolean hasErrors = false;
        //Датчики давления шин
        boolean isWheelWork1 = true;
        boolean isWheelWork2 = true;
        boolean isWheelWork3 = true;
        boolean isWheelWork4 = true;

        //Поменять(убрать, поставить) логические операторы так, чтобы машина запускалась:
        // когда топлива не меньше 10 литров, двигатель работает, колеса все работают, нет ошибок
        //В ином случае, машина не должна запускаться
        if (fuel >= 10
                && (isWheelWork1 && isWheelWork2 && isWheelWork3 && isWheelWork4)
                && !hasErrors
                && isEngineWork
        ) {
            System.out.println("Машина работает");
        } else {
            System.out.println("Машина не работает");
        }
    }

    public static void ex3() {
        //Работа на самостоятельное изучение методов.
        //Заменить в строке все 'this is' на 'those are'
        String simply = "this is simply. This is my favorite song.";
        simply = simply.replace("this is", "those are");
        simply = simply.replace("This is", "Those are");

        // получить индекс (число) второй буквы 'o' в строке
        int index = simply.indexOf('o');
        index = simply.indexOf('o', index + 1);

        //Распечатать полученный индекс
        System.out.println(index);
    }

    public static void ex4() {
        //Компания Рога и Копыта производит мясные продукты.
        //Перечень производимых товаров :
        //Колбаса - стоимость 800 руб,

        //себестоимость при производстве меньше 1000 кг - 412руб,
        //себестоимость при производстве от 1000 до 2000 (не включая) - 408 руб
        //себестоимость при производстве от 2000кг - 404 руб

        //Ветчина - стоимость 350 руб
        //себестоимость при производстве - 275 руб

        //Шейка - стоимость 500 руб
        //себестоимость при производстве меньше 500кг - 311 руб
        //себестоимость при производстве больше или равно 500кг - 299 руб

        //Финансовые показатели
        //Доход компании считается как умножение стоимости на количество проданных кг
        //Расход компании считается как умножение себестоимости на количество проданных кг + миллион рублей
        //Прибыль до налогов считается как: доход - расход
        //Налоги считаются так:
        // прибыль до налогов больше 2_000_000, облагается ставкой 13%
        // прибыль до налогов больше 1_000_000 от 2_000_000, облагается ставкой 10%
        // прибыль до налогов меньше 1_000_000, облагается ставкой 8%
        //пример расчета налогов для прибыли до налогов 2_500_000:
        //1_000_000 - налог 80_000 - по ставке 8%
        //1_000_000 - налог 100_000 - по ставке 10%
        //500_000 - 65_000 - по ставке 13%
        //Итоговый налог: 80_000 + 100_000 + 65_000 = 245_000
        //Прибыль после налогов: прибыль до налогов - налог.

        //Необходимо создать универсальную систему расчетов прибыли после налогов,
        //Т.е на вход подаются данные по количеству произведенных продуктов
        // и печатается прибыль после налогов компании
        //Узнать прибыль после налогов, при продаже:
        //Колбасы 2000кг
        //Ветчины 8511кг
        //Шейки 6988кг

        int sausageCost = 800;
        int hamCost = 350;
        int neckCost = 500;
        System.out.println("===Cost=== sausage = " + sausageCost
                + " ham = " + hamCost
                + " neck = " + neckCost);

        int sausageWeight = 2000;
        int hamWeight = 8511;
        int neckWeight = 6988;
//        Scanner console = new Scanner(System.in);
//        System.out.println("enter sausage weight:");
//        int sausageWeight = console.nextInt();
//        System.out.println("enter ham weight:");
//        int hamWeight = console.nextInt();
//        System.out.println("enter neck weight:");
//        int neckWeight = console.nextInt();
        System.out.println("===Weight=== sausage = " + sausageWeight
                + " ham = " + hamWeight
                + " neck = " + neckWeight);

        int sausageIncome = income(sausageCost, sausageWeight);
        int hamIncome = income(hamCost, hamWeight);
        int neckIncome = income(neckCost, neckWeight);
        int totalIncome = sausageIncome + hamIncome + neckIncome;
        System.out.println("===Income=== total = " + totalIncome + " sausage = " + sausageIncome
                + " ham = " + hamIncome
                + " neck = " + neckIncome);

        int sausageExpense = expense(0, sausageWeight);
        int hamExpense = expense(1, hamWeight);
        int neckExpense = expense(2, neckWeight);
        int totalExpense = sausageExpense + hamExpense + neckExpense + 1_000_000;
        System.out.println("===Expense=== total = " + totalExpense
                + " sausage  = " + sausageExpense
                + " ham = " + hamExpense
                + " neck = " + neckExpense);

        int totalIncomeBeforeTaxes = incomeBeforeTaxes(totalIncome, totalExpense)/*2_500_000*/;
        System.out.println("===Income before taxes=== " + totalIncomeBeforeTaxes);

        BigDecimal totalTax = tax(totalIncomeBeforeTaxes);
        System.out.println("===Taxes=== " + totalTax);

        BigDecimal totalIncomeAfterTaxes = incomeAfterTaxes(totalIncomeBeforeTaxes, totalTax);
        System.out.println("===Income after taxes=== " + totalIncomeAfterTaxes);
    }

    private static int income(int cost, int weight) {
        return cost * weight;
    }

    /** productOption (0 - sausage, 1 - ham, 2 - neck) */
    private static int expense(int productOption, int productWeight) {
        int result = 0;
        if (0 == productOption) {
            if (productWeight < 1000) {
                result = productWeight * 412;
            } else if (/*productWeight >= 1000 && */productWeight < 2000) {
                result = productWeight * 408;
            } else /*if (productWeight >= 2000)*/ {
                result = productWeight * 404;
            }
        } else if (1 == productOption) {
            result = productWeight * 275;
        } else if (2 == productOption) {
            if (productWeight < 500) {
                result = productWeight * 311;
            } else {
                result = productWeight * 299;
            }
        }
        return result;
    }

    private static int incomeBeforeTaxes(int income, int expense) {
        return income - expense;
    }

    private static BigDecimal tax(int incomeBeforeTaxes) {
        if (incomeBeforeTaxes <= 1_000_000) {
            return smallTax(incomeBeforeTaxes);
        } else if (incomeBeforeTaxes <= 2_000_000) {
            return middleTax(incomeBeforeTaxes);
        } else {
            return highTax(incomeBeforeTaxes);
        }
    }

    /** incomeBeforeTaxes <= 1_000_000 */
    private static BigDecimal smallTax(int incomeBeforeTaxes) {
        return new BigDecimal(incomeBeforeTaxes)
                .multiply(new BigDecimal("0.08"));
    }

    /** incomeBeforeTaxes <= 2_000_000 */
    private static BigDecimal middleTax(int incomeBeforeTaxes) {
        if (1_000_000 == incomeBeforeTaxes) {
            return new BigDecimal(incomeBeforeTaxes)
                    .multiply(new BigDecimal("0.1"));
        }
        incomeBeforeTaxes -= 1_000_000;
        return smallTax(1_000_000)
                .add(new BigDecimal(incomeBeforeTaxes)
                        .multiply(new BigDecimal("0.1"))
                );
    }

    /** incomeBeforeTaxes > 2_000_000 */
    private static BigDecimal highTax(int incomeBeforeTaxes) {
        incomeBeforeTaxes -= 2_000_000;
        return smallTax(1_000_000)
                .add(middleTax(1_000_000))
                .add(new BigDecimal(incomeBeforeTaxes)
                        .multiply(new BigDecimal("0.13"))
                );
    }

    private static BigDecimal incomeAfterTaxes(int incomeBeforeTaxes, BigDecimal tax) {
        return new BigDecimal(incomeBeforeTaxes).subtract(tax);
    }
}
