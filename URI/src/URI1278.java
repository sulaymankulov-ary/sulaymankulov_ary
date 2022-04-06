import java.util.Scanner;

public class URI1278 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numOfCases = input.nextInt();
        int t = 0;
        while (numOfCases != 0) {
            String[] sss = new String[numOfCases];
            int max = 0;
            if (input.hasNextInt()) {
                numOfCases = input.nextInt();
                continue;
            }
            if (t == 1)   {
                System.out.println();
            }

            input.nextLine();
            for (int i = 0; i < numOfCases; i++) {
                String s = input.nextLine();
                s = s.toUpperCase();
                s = s.trim().replaceAll(" +", " ");
                if (s.length() > max)
                    max = s.length();
                sss[i] = s;
            }
            for (String value : sss) {
                int spaces = Math.abs(max - value.length());
                System.out.print(" ".repeat(spaces));
                System.out.println(value);
            }
            t = 1;
        }
    }
}