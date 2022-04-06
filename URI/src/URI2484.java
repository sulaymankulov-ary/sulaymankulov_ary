import java.util.*;

public class URI2484 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (input.hasNextLine()) {
            String str = input.next(); //DIS
            StringBuilder strBuilder = new StringBuilder();
            char[] chars = str.toCharArray(); // 0 index 'D' 1 index 'I' 2nd index 'S'
            for (int i = 0; i < str.length(); i++) {
                strBuilder.append(chars[i]);
                if (i < str.length() - 1) {
                    strBuilder.append(' ');
                }
            }
            System.out.println(strBuilder);

            for (int i = 0; i < str.length() - 1; i++) {
                strBuilder.insert(0," ");
                strBuilder.delete(strBuilder.length() - 2 , strBuilder.length());
                System.out.println(strBuilder);
            }
            System.out.println();
        }
    }
}