/*
Pattern 1:-Hourglass Pattern.
*********
 *******
  *****
   ***
    *
   ***
  *****
 *******
*********
*/
import java.util.Scanner;

public class Hourglass_Pattern {
    public static void main(String[] args) {
        System.out.println("Enter the size:- ");
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        System.out.println("Output is:- ");

        int n = T;

        for (int r = 1; r <= T; r++) {
            for (int sp = 1; sp <= r; sp++)
                System.out.print(" ");

            for (int c = 1; c <= n; c++)
                System.out.print("*");

            for (int c = T - r; c >= 1; c--)
                System.out.print("*");

            n--;
            System.out.println();
        }

        for (int r = 2; r <= T; r++) {
            for (int sp = T - r + 1; sp >= 1; sp--)
                System.out.print(" ");

            for (int c = 1; c <= r; c++)
                System.out.print("*");

            for (int c = r - 1; c >= 1; c--)
                System.out.print("*");

            System.out.println();
        }
    }
}
