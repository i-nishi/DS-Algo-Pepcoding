package gettingstarted;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 2; i <= n; ) {
            if (n % i == 0) {
                n = n / i;
                System.out.print(i + " ");
            } else {
                i++;
            }
        }
    }
}
