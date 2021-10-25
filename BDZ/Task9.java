package BDZ;
import java.util.Scanner;
public class Task9 {
    public static String f(String n) {
        for (int i = 0; i < n.length() / 2; i++) {
            if (n.charAt(i) != n.charAt(n.length() - i - 1)) return "NO";
        }
        return "YES";
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in .nextLine();
        System.out.print(f(n));
    }
}
