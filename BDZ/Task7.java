package BDZ;
import java.util.Scanner;
public class Task7 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] matr= new int[n+1][m+1];



        for (int j=1; j<=m; j++)
        {
            for (int i=1; i<=n; i++)
            {

                matr[i][j] = i * j;
            }
        }
        for (int j=1; j<=m; j++)
        {
            for (int i=1; i<=n; i++)
            {
                System.out.format("%3d", matr[i][j]);

            }
            System.out.println();
        }

    }
}






