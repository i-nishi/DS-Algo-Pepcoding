package pattern;

import java.util.Scanner;

public class Pattern17 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = n / 2;

        for (int i = 1; i <= n; i++) {
            if (i <= n/2) {
                for (int j = 1; j <= sp; j++) {
                    System.out.print("\t");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*\t");
                }
            }
            else if (i == (n/2)+1) {
                for (int k = 1; k <= n; k++) {
                    System.out.print("*\t");
                }
            }else{
                for (int j = 1; j <= sp; j++) {
                    System.out.print("\t");
                }
                for (int k = n; k >= i; k--) {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}
