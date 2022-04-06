import java.util.*;
public class Main {
    public static void main(String [] args){
        Scanner scn = new Scanner (System.in);

        ArrayList<Integer> list = new ArrayList<Integer>();

        while (scn.hasNextInt()){
            int x = scn.nextInt();
            list.add(x);
        }

        System.out.println("Before reversing:\n" + list);
        //Collections.reverse(list);

        reverse(list);

        System.out.println("After reversing:\n" + list);


    }

    static void reverse(ArrayList<Integer> list) {
        for (int left = 0, right = list.size() - 1; left < right; right--, left++){
            int t = list.get(left);
            list.set(left, list.get(right));
            list.set(right, t);
        }
    }
}
