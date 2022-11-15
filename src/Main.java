public class Main {
    public static void main(String[] args) {
        // Задание 1-1
        System.out.println("Задание 1-1");
        int postpone = 15000;
        double total = 0;
        int month = 0;
        while (total < 459_000) {
            total += postpone;
            total += total / 100;
            month++;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total+ " рублей");
        }
        System.out.println(" ");
        // Задание 2-1
        System.out.println("Задание 2-1");
        int in = 0;
        while (in < 10) {
            in++;
            System.out.print(in + " ");
        }
        System.out.println(" ");
        for (;in > 0; in--) System.out.print(in + " ");
        System.out.println(" ");
        // Задание 3-1
        System.out.println("Задание 3-1");
        int years = 2022;
        int population = 12_000_000;
        int fertility = 17;
        int deathRate = 8;
        while (years < 2032) {
            years ++;
            population = population + population / 1000 * fertility - population / 1000 * deathRate;
            System.out.println("Год " + years + " численность населения составляет " + population);
        }
        System.out.println(" ");
        // Задание 1-2
        System.out.println("Задание 1-2");
        double depositVasya = 15000;
        for (int i = 1; depositVasya <= 12_000_000; i++) {
            depositVasya = depositVasya * 1.07;
            System.out.println("Месяц " + i + " Накопления составляют " + depositVasya);
        }
        System.out.println(" ");
        // Задание 2-2
        System.out.println("Задание 2-2");
        depositVasya = 15000;
        for (int i = 1; depositVasya <= 12_000_000; i++) {
            depositVasya = depositVasya * 1.07;
            if (i % 6 == 0) System.out.println("Месяц " + i + " Накопления составляют " + depositVasya);
        }
        System.out.println(" ");
        // Задание 3-2
        System.out.println("Задание 3-2");
        depositVasya = 15000;
        for (int i = 1; i <= 108; i++) {
            depositVasya = depositVasya * 1.07;
            if (i % 6 == 0) System.out.println("Месяц " + i + " Накопления составляют " + depositVasya);
        }
        System.out.println(" ");
        // Задание 4-2
        System.out.println("Задание 4-2");
        int friday = 3;
        for (;friday <= 31; friday += 7) {
            System.out.println("Cегодня пятница, " + friday + "-е число. Необходимо подготовить отчет.");
            }
        System.out.println(" ");
        // Задание 1-3
        System.out.println("Задание 1-3");
        int year = 2022;
        int yearCometPassed = year - 200;
        int yearFinish = year + 100;
        do {
            if (yearCometPassed % 79 == 0) {
                System.out.println(yearCometPassed);
            }
            yearCometPassed ++;
        } while (yearCometPassed < yearFinish);
        System.out.println(" ");
        // Задание 2-3
        System.out.println("Задание 2-3");
        for (int i = 1;i <= 10; i++) {
            System.out.println("2 * "+ i + " = " + 2 * i);
        }
        System.out.println(" ");
        // Задание 1-3
        System.out.println("Задание 1-3");
        // Тренировка
        System.out.println("Тренировка");
        int salary = 65535;
        total = 0;
        int i = 0;
        for (; total < 1_000_000; i++) {
            total += total / 100;
            total += salary;
            if (i % 5 == 0) {
                System.out.println("Месяц " + i + " Итого " + total);
            } else System.out.println(" Итого " + total);
        }
    }
}