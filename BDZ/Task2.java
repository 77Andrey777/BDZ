package BDZ;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arrow= new int[n];
        for (int i=0; i<n; i++)
        {
            arrow[i]=in.nextInt();
        }
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        int counter=0;
        double sum=0;
        for (int i=0; i<n; i++)
        {
            if (arrow[i]>max)
                max=arrow[i];
            if (arrow[i]<min)
                min=arrow[i];
            counter+=1;
            sum=sum+arrow[i];
        }

        System.out.println(max);
        System.out.println(min);
        System.out.println(sum/counter );

    }
}
