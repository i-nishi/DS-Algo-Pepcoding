package pattern;
import java.util.Scanner;
public class Pattern6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = 1;
        int st = n-n/2;
        for (int i = 1; i <= n; i++) {
            for (int j = st; j >= 1; j--) {
                System.out.print("*\t");
            }
            for (int j = 1; j <= sp; j++) {
                System.out.print("\t");
            }
            for (int j = st; j >= 1; j--) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                st--;
                sp += 2;
            } else {
                st++;
                sp -= 2;
            }
            System.out.println();
        }
    }
}
