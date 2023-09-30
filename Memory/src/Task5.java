public class Task5 {
    public static void main(String[] args) {

        int value = 33;
        System.out.println("Initial value before calling method: " + value);
        changeValue(value);
        System.out.println("Final value after calling method: " + value);

    }

    public static void changeValue(int value) {
        value = 22;
    }
}