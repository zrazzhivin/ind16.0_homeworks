public class Task6 {
    public static void main(String[] args) {

        Integer value = 33;
        System.out.println("Initial value before calling method: " + value);
        changeValue(value);
        System.out.println("Final value after calling method: " + value);

    }

    public static void changeValue(Integer value) {
        System.out.println(value);
        value = 22;
        System.out.println(value);
    }
}