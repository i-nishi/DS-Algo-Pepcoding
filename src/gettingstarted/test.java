package gettingstarted;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int pow = (int) Math.pow(10, k);
        int a = n / pow;
        System.out.println(a);
    }
}

