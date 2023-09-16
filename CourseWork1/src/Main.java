
public class Main {
    public static void main(String[] args) {

        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Шилов Панкратий Алексеевич", 1, 100_000);
        employees[1] = new Employee("Кулаков Агафон Николаевич", 2, 200_000);
        employees[2] = new Employee("Фокин Игнат Иринеевич", 3, 300_000);
        employees[3] = new Employee("Блохин Кассиан Оскарович", 4, 50_000);
        employees[4] = new Employee("Марков Юстин Иванович", 5, 100_000);
        employees[5] = new Employee("Крюков Александр Натанович", 1, 250_000);
        employees[6] = new Employee("Новиков Филипп Адольфович", 2, 30_000);
        employees[7] = new Employee("Орехов Родион Онисимович", 3, 500_000);
        employees[8] = new Employee("Юдин Марк Артемович", 4, 15_000);
        employees[9] = new Employee("Некрасов Панкратий Адольфович", 5, 250_000);

        printEmployees(employees);

        int salarySum = calculateSalarySum(employees);
        System.out.println("Сумма зарплат = " + salarySum);

        Employee employeeWithMinSalary = findEmployeeWithMinSalary(employees);
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeWithMinSalary);

        Employee employeeWithMaxSalary = findEmployeeWithMaxSalary(employees);
        System.out.println("Сотрудник с максимальной зарплатой: " + employeeWithMaxSalary);

        double averageSalary = calculateAverageSalary(employees);
        System.out.println("Средняя зарплата = " + averageSalary);

        printFullNames(employees);
    }

    private static void printEmployees(Employee[] employees) {
        System.out.println("Список сотрудников: ");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static int calculateSalarySum(Employee[] employees) {
        int totalSalarySum = 0;

        for (Employee employee : employees) {
            totalSalarySum += employee.getSalary();
        }

        return totalSalarySum;
    }

    private static Employee findEmployeeWithMinSalary(Employee[] employees) {
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() < employees[index].getSalary()) {
                index = i;
            }
        }

        return employees[index];
    }

    private static Employee findEmployeeWithMaxSalary(Employee[] employees) {
        int index = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getSalary() > employees[index].getSalary()) {
                index = i;
            }
        }

        return employees[index];
    }

    private static double calculateAverageSalary(Employee[] employees) {
        return (double) calculateSalarySum(employees) / employees.length;
    }

    private static void printFullNames(Employee[] employees) {
        System.out.println("Ф. И. О. всех сотрудников: ");
        for (Employee employee : employees) {
            System.out.println(employee.getFullName());
        }
    }
}