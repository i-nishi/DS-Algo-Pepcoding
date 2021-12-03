package pattern;

import java.util.Scanner;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = 0;
        int st = n;
        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                for (int j = st; j >= 1; j--) {
                    System.out.print("*\t");
                }
                st -= 2;
                sp++;
            }
            else if (i <= n/2) {
                for (int k = 1; k <= sp; k++) {
                    System.out.print("\t");
                }
                System.out.print("*\t");
                for (int j = (st-1); j > 1; j--) {
                    System.out.print("\t");
                }
                System.out.print("*\t");
                st -= 2;
                sp++;
            }else{
                for (int k = 1; k <= sp; k++) {
                    System.out.print("\t");
                }
                for (int j = st; j >= 1; j--) {
                    System.out.print("*\t");
                }
                st += 2;
                sp--;
            }
            System.out.println();
        }
    }
}

