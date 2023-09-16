public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        int clientOS = 3;

        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Неверное значение");
        }
    }

    public static void task2() {
        int clientOS = 1;
        int deviceYear = 2010;

        if (clientOS == 0) {
            if (deviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (deviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void task3() {
        int year = 2020;

        boolean isYearLeap = (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;

        System.out.println(
                isYearLeap ? "Год является високосным!" : "Год не является високосным!"
        );
    }

    public static void task4() {
        int distance = 500;
        int time = -1;

        if (distance <= 20) {
            time = 1;
        } else if (distance > 20 && distance <= 60) {
            time = 2;
        } else if (distance > 60 && distance <= 100) {
            time = 3;
        }

        System.out.println(time);
    }

    public static void task5() {
        int month = 10;

        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Неверный месяц");
        }

        boolean isWinter = month == 1 || month == 2 || month == 12;
        boolean isSpring = month == 3 || month == 4 || month == 5;
        boolean isSummer = month == 6 || month == 7 || month == 8;
        boolean isAutumn = month == 9 || month == 10 || month == 11;

        if (isWinter) {
            System.out.println("Зима");
        } else if (isSpring) {
            System.out.println("Весна");
        } else if (isSummer) {
            System.out.println("Лето");
        } else if (isAutumn) {
            System.out.println("Осень");
        } else {
            System.out.println("Неверный месяц");
        }
    }
}