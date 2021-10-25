package BDZ;
import java.util.Scanner;
public class Task8 {
    public static void find(int n)
    {
        int div = 2;
        while (div <= n) {
            if ((n % div) == 0) {
                if (div != n) {
                    System.out.print(div + "*");
                    find(n / div);
                } else {
                    System.out.print(div);
                }
                return;
            }
            div++;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        find(n);
    }
}
