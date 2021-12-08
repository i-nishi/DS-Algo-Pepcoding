package functions;

public class Pattern2_2 {
    public static void main(String[] args) {
        pattern(5);
    }
    public static void pattern(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                if (i >= j)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
