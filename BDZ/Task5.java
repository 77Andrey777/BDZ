package BDZ;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = in.nextInt();
        }
        int[] array1 = new int[n];
        for (int i = 0; i < n; i++) {
            do {

                int flag=array[i]%10;
                array1[i]=flag;
                array[i]/=10;
            }
            while (array[i]>0);

        }
        for (int i = 0; i < n; i++) {
            System.out.print(array1[i]);
        }


    }
}
