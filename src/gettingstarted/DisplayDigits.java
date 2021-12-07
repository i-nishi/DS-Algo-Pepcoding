package gettingstarted;

import java.util.Scanner;

public class DisplayDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int p = n;
        int count = 0;
        for (int i = n; i > 0; i=n) {
            n = n / 10;
            count++;
        }
        while (count != 0) {
            int div = (int) (p / Math.pow(10, count-1));
            p %= Math.pow(10, count - 1);
            count--;
            System.out.println(div);
        }
    }
}
