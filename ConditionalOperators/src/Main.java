public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {
        int age = 21;

        if (age > 18) {
            System.out.println("Совершеннолетний");
        } else {
            System.out.println("Несовершеннолетний");
        }
    }

    public static void task2() {
        int temperature = 10;

        if (temperature < 5) {
            System.out.println("Нужно надеть шапку");
        } else {
            System.out.println("Не нужно надевать шапку");
        }
    }

    public static void task3() {
        int speed = 150;

        if (speed <= 60) {
            System.out.println("Можно ездить спокойно");
        } else {
            System.out.println("Штраф!");
        }
    }

    public static void task4() {
        int age = 5;

        if (age >= 2 && age <= 6) {
            System.out.println("Детский сад!");
        } else if (age > 6 && age <= 18) {
            System.out.println("Школа!");
        } else if (age > 18 && age < 24) {
            System.out.println("Университет!");
        } else if (age >= 24) {
            System.out.println("Работа!");
        }
    }

    public static void task5() {
        int age = 10;
        boolean withAdult = true;

        if (age < 5) {
            System.out.println("не может кататься на аттракционе");
        } else if (age >= 5 && age < 14 && withAdult) {
            System.out.println("может кататься только в сопровождении взрослого");
        } else if (age >= 14) {
            System.out.println("может кататься без сопровождения взрослого");
        } else {
            System.out.println("Кататься нельзя!");
        }
    }

    public static void task6() {
        int capacity = 102;
        int seatPlaces = 60;

        int peopleNumber = 70;
        if (peopleNumber == capacity) {
            System.out.println("Вагон полностью забит");
        } else if (peopleNumber < seatPlaces) {
            System.out.println("Есть сидячее место");
        } else {
            System.out.println("Есть стоячее место");
        }
    }

    public static void task7() {
        int one = 100, two = 20, three = 30;

        if (one > two && one > three) {
            System.out.println(one);
        } else if (two > three) {
            System.out.println(two);
        } else {
            System.out.println(three);
        }
    }
}