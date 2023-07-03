import java.util.Scanner;

public class Pattern1 {

    /**
     * The below function takes an integer input and prints a square pattern of
     * asterisks with each row and column having the same length as the input.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}