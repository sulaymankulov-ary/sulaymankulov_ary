import java.util.*;

public class URI2866 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numOfCases = input.nextInt();
        for (int i = 0; i < numOfCases; i++) {
            String str = input.next();
            StringBuilder strBuilder = new StringBuilder();
            int count = 0;
            count = str.length() - 1;
            char [] charsArray = str.toCharArray();
            for (int j = count; j >= 0; j--) {
                if(Character.isLowerCase(charsArray[j])){
                    strBuilder.append(charsArray[j]);
                }
            }
            System.out.println(strBuilder);
        }
    }
}