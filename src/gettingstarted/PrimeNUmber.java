package gettingstarted;

import java.util.Scanner;

public class PrimeNUmber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
            int count = 0;
            for (int j = 2; j < n; j++) {
                if (n % j == 0) {
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }
        }
    }
}