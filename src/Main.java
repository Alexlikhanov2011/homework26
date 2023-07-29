import java.util.*;

    public class Main {
        private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        private static final List<String> strings = new ArrayList<>(List.of("один", "два", "три", "три", "три"));

        public static void main(String[] args) {
            task1();
            System.out.println();
            task2();
            System.out.println();
            task3();
            System.out.println();
            task4();
        }

        public static void task1() {
            for (int num : nums) {
                if (num % 2 != 0)
                    System.out.println(num);
            }
        }

        public static void task2() {
            Collections.sort(nums);
            int num1 = Integer.MIN_VALUE;
            for (int num : nums) {
                if (num % 2 == 0 && num != num1) {
                    System.out.println(num);
                    num1 = num;
                }
            }
        }

        public static void task3() {
            Set<String> uniqueWord = new HashSet<>(strings);
            System.out.println(uniqueWord);
        }

        public static void task4() {
            Set<String> uniqueWord = new HashSet<>(strings);
            System.out.println(strings.size()-uniqueWord.size());
        }
    }
