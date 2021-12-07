package functions;

public class Pattern1 {
    public static void main(String[] args) {
        pattern(3);
        pattern(5);
    }
    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}
