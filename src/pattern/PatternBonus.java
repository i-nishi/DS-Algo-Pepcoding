package pattern;

import java.util.Scanner;

public class PatternBonus {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = 0;
        int st = n;
        int rst = -1;
        for (int i = 1; i <= n; i++) {
            if (i <= n / 2) {
                for (int k = 1; k <= sp; k++) {
                    System.out.print("\t");
                }
                for (int j = st; j >= 1; j--) {
                    System.out.print("*\t");
                }
                System.out.println();
                st -= 2;
                sp++;
            } else if (i == n) {
                for (int k = 1; k <= n; k++) {
                    System.out.print("*\t");
                }
            } else {
                for (int k = 1; k <= sp; k++) {
                    System.out.print("\t");
                }
                System.out.print("*\t");
                if (i > (n/2)+1) {
                    for (int m = 1; m <= rst; m++) {
                        System.out.print("\t");
                    }
                    System.out.print("*\t");
                }
                rst+=2;
                st += 2;
                sp--;
                System.out.println();
            }
        }
    }
}
