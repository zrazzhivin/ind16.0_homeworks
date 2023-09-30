import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {

        Integer[] value = new Integer[] { 3, 4 };
        System.out.println("Initial value before calling method: " + Arrays.toString(value));
        changeValue(value);
        System.out.println("Final value after calling method: " + Arrays.toString(value));

    }

    public static void changeValue(Integer[] value) {
        value = new Integer[] { 1, 2 };
    }
}