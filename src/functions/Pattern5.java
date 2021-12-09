package functions;

public class Pattern5 {
    public static void main(String[] args) {
        pattern(5);
    }

    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i + j >= (n/2)+2)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
