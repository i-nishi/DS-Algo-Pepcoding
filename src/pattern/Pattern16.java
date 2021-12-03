package pattern;

import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sp = (2*n)-3;
        int x = n-1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }
            for (int l = sp; l >= 1; l--) {
                System.out.print("*\t");
            }
            sp-=2;
            for (int k = x; k >= 1; k--) {
                if (k <= i)
                System.out.print(k + "\t");
            }
            System.out.println();
        }
    }
}