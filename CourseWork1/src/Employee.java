public class Employee {

    private String fullName;

    private int department;

    private int salary;

    private int id;

    private static int counter = 0;

    public Employee(String fullName, int department, int salary) {
        checkDepartment(department);

        this.fullName = fullName;
        this.department = department;
        this.salary = salary;

        id = ++counter;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private void checkDepartment(int department) {
        if (department < 1 || department > 5) {
            throw new IllegalArgumentException("Wrong department number! Should be from 1 to 5. Try again.");
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "fullName='" + fullName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
