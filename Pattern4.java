import java.util.Scanner;

public class Pattern4 {
    /**
     * The function takes an integer input and prints a pattern of numbers from 1 to
     * n, where each row contains the number repeated i times.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
