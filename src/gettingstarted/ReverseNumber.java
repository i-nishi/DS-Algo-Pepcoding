package gettingstarted;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = n; i > 0; i=n) {
            int remainder = n % 10;
            n = n/10;
            System.out.println(remainder);
        }
    }
}
