mport java.util.*;

public class Problem01 {
    public static void main(String[] args) {
        var nums = new ArrayListInt();

        var scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            nums.add(num);
        }
        System.out.println("Before reversing:\n" + nums);
        reverse(nums);
        System.out.println("After reversing:\n" + nums);
    }

    private static void reverse(ArrayListInt nums) {
        for (int i = 0, j = nums.size() - 1; i < j; ++i, --j) {
            int temp = nums.get(i);
            nums.set(i, nums.get(i));
            nums.set(j, temp);
        }
    }
}