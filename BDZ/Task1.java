package BDZ;

import java.util.Scanner;
public class Task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i=0; i<n; i++)
        {
            if (i*i>=n)
            {
                System.out.print(i-1);
                System.exit(0);
            }

        }


    }
}

