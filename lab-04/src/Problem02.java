import java.util.*;

public class Problem02 {
    public static void main(String[] args) {
        var nums = new ArrayListInt();

        var scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            nums.add(num);
        }

        addZeroBeforeEven(nums);
        System.out.println("After insertions:\n" + nums);

        removeOdd(nums);
        System.out.println("After deletions:\n" + nums);
    }

    private static void addZeroBeforeEven(ArrayListInt nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                nums.add(i++, 0);
            }
        }
    }

    private static void removeOdd(ArrayListInt nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                nums.remove(i--);
            }
        }
    }
}

//