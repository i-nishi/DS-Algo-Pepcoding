package pattern;

import java.util.Scanner;

public class TestProblem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        float count;
//        if (n % 2 == 0)
//            count = ((n * (n / 2) + (n / 2));
            count = ((n * (n / 2f)) + (n / 2f));
//        else
//            count = (n * ((n / 2) + 1));
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((int) count + "\t");
                count--;
            }
            System.out.println();
        }
    }
}
