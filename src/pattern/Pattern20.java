package pattern;

import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i && j <= (n/2)+1) {
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            for (int k = n; k >= i; k--) {
//                if (k == 1) {
                    System.out.print("0\t");
//                }else{
//                    System.out.print("\t");
//                }
            }
            System.out.println();
        }
    }
}
