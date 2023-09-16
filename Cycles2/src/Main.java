import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // task 1
        System.out.println("Task 1");
        int balance = 0;
        int month = 0;
        while (balance <= 2_459_000) {
            balance += 15000;
            ++month;
        }
        System.out.println("Месяц " + month + ", сумма накоплений равна " + balance + " рублей");
        System.out.println();

        // task 2
        System.out.println("Task 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            ++i;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        // task 3
        System.out.println("Task 3");
        int population = 12_000_000;
        int fertility = 17;
        int mortality = 8;

        for (int j = 1; j <= 10; j++) {
            population += population / 1000 * (fertility - mortality);
            System.out.println("Год " + j + ", численность населения составляет " + population);
        };
        System.out.println();

        // task 4
        System.out.println("Task 4");
        balance = 0;
        month = 0;
        while (balance <= 12_000_000) {
            balance += 15000;
            balance *= 1.07;
            ++month;

            System.out.println("Месяц " + month + ", сумма накоплений равна " + balance + " рублей");
        }
        System.out.println();

        // task 5
        System.out.println("Task 5");
        balance = 0;
        month = 0;
        while (balance <= 12_000_000) {
            balance += 15000;
            balance *= 1.07;
            ++month;

            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + balance + " рублей");
            }
        }
        System.out.println();

        // task 6
        System.out.println("Task 6");
        balance = 0;
        month = 1;
        while (month <= 9 * 12) {
            balance += 15000;
            balance *= 1.07;

            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + balance + " рублей");
            }

            ++month;
        }
        System.out.println();

        // task 7
        System.out.println("Task 7");
        int friday = 3;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число. Необходимо подготовить отчет");
            friday += 7;
        }
        System.out.println();

        // task 8
        System.out.println("Task 8");
        int currentYear = LocalDate.now().getYear();
        int startYear = currentYear - 200;
        int endYear = currentYear + 100;

        while (startYear <= endYear) {
            if (startYear % 79 == 0) {
                System.out.println(startYear);
            }

            ++startYear;
        }
        System.out.println();
    }
}