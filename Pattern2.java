import java.util.Scanner;

public class Pattern2 {

    /**
     * The below function takes an integer input and prints a pattern of asterisks
     * in the shape of a right triangle.
     */
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
