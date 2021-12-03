package pattern;

import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int x = n-1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }
            for (int k = x; k >= 1; k--) {
                if (k < i)
                    System.out.print(k + "\t");
            }
            System.out.println();
        }
    }
}
