package gettingstarted;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 0;
        for (int i = n; i > 0 ; i=n) {
            n = n / 10;
            count++;
        }
        System.out.println(count);
    }
}
