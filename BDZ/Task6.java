package BDZ;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        int max11 = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            if (array[i] % 100 == 11 && array[i] > max11)
                max11 = array[i];
        }
        System.out.println(max11);


    }
}
