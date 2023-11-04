import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1(new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7)));
        task2(new ArrayList<>(List.of(8, 10, 200, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7)));
        task3(new ArrayList<>(List.of("table", "pencil", "head", "head", "table")));
        task4(new ArrayList<>(List.of("один", "два","два", "три", "три", "три")));
    }

    public static void task1(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 > 0) {
                System.out.print(num + " ");
            }
        }

        System.out.println();
    }

    public static void task2(List<Integer> nums) {
        Collections.sort(nums);
        Set<Integer> uniqueNums = new HashSet<>();

        for (Integer num : nums) {
            if (num % 2 == 0 && !uniqueNums.contains(num)) {
                System.out.print(num + " ");
                uniqueNums.add(num);
            }
        }

        System.out.println();
    }

    public static void task3(List<String> strings) {
        Set<String> uniqueStrings = new HashSet<>(strings);
        System.out.println(uniqueStrings);
    }

    public static void task4(List<String> strings) {
        Map<String, Integer> wordsMap = new HashMap<>();
        for (String string : strings) {
            if (wordsMap.containsKey(string)) {
                Integer currentRepeats = wordsMap.get(string);
                wordsMap.put(string, currentRepeats + 1);
            } else {
                wordsMap.put(string, 1);
            }
        }

        System.out.println(wordsMap);
    }
}