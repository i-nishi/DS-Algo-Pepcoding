package gettingstarted;

import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        int num2 = scn.nextInt();
        int lcm1 = num1;
        int lcm2 = num2;
        while (num1 % num2 != 0) {
            int remainder = num1 % num2;
            num1 = num2;
            num2 = remainder;
        }
        int gcd = num2;
        int lcm = (lcm1 * lcm2) / gcd;
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
