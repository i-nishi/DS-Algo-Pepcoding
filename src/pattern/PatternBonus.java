package pattern;

import java.util.Scanner;

public class PatternBonus {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = 0;
        int st = n;
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= sp; k++) {
                System.out.print("\t");
            }
            for (int j = st; j >= 1; j--) {
                System.out.print("*\t");
            }
            if (i <= n / 2) {
                st -= 2;
                sp++;
            }else{
                st += 2;
                sp--;
            }
            System.out.println();
        }
    }
}

