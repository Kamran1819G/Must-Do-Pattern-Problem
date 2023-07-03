import java.util.Scanner;

public class Pattern5 {
    /**
     * The below function takes an integer input and prints a pattern of asterisks
     * in descending order.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
