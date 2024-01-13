/*
Pattern :-Hollow_Diamond.
    *
   * *
  *   *
 *     *
*       *
 *     *
  *   *
   * *
    *
*/

import java.util.Scanner;

public class Hollow_Diamond {
    public static void main(String[] args) {
        int i, j;
        System.out.println("Enter the size:- ");
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        System.out.println("Output is:- ");

        for (i = 1; i <= T; i++) {
            for (j = T; j > i; j--) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (j = 1; j < (i - 1) * 2; j++) {
                System.out.print(" ");
            }

            if (i == 1) {
                System.out.println();
            } else {
                System.out.println("*");
            }
        }

        for (i = T-1; i >= 1; i--) {
            for (j = T; j > i; j--) {
                System.out.print(" ");
            }

            System.out.print("*");

            for (j = 1; j < (i - 1) * 2; j++) {
                System.out.print(" ");
            }

            if (i == 1) {
                System.out.println();
            } else {
                System.out.println("*");
            }
        }
    }
}
