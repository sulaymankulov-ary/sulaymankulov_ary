import java.util.*;

public class URI2694 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numOfCases = input.nextInt();
        for (int i = 0; i < numOfCases; i++) {
            String str = input.next().replaceAll("[^0-9]+", " ").trim();
            String[] strArray = str.split(" ");
            int count = 0;
            for (int j = 0; j < strArray.length; j++) {
                int num = Integer.parseInt(strArray[j]);
                count += num;
            }
            System.out.println(count);
        }
    }
}