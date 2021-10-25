package BDZ;

import java.util.Scanner;

public class Task10 {
    public static int f(int x, int y) {

        while (y != 0) {
            int carry = (x & y);
            x = x ^ y;
            y = carry << 1;
        }
        return x;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.print(f(x,y));
    }
}
