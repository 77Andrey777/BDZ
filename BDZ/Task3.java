package BDZ;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arrow = new int[n+1];
        for (int i = 0; i < n+1; i++) {
            arrow[i] = in.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arrow[i];
        }
        for (int i = 0; i < sum; i++) {
            if (i * i >= sum) {
                System.out.println(i - 1);
                System.exit(0);
            }
        }

    }

}
