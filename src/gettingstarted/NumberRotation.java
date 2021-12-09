package gettingstarted;

import java.util.Scanner;

public class NumberRotation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int temp = n;
        int k = scn.nextInt();
        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        int pow = (int) Math.pow(10, k);
//        int d = (int) Math.pow(10, (count-k));
        int a = temp / pow;
        int b = temp % pow;
        System.out.println(a);
    }
}
