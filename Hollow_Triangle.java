/*
Pattern :-Hollow Triangle.
    *
   * *
  *   *
 *     *
*********
*/

import java.util.Scanner;

public class Hollow_Triangle {
    public static void main(String[] args) {
        System.out.println("Enter the size:- ");
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        System.out.println("Output is:- ");

        for (int i = 1; i <= T; i++) {
            for (int j = 1; j <= T - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                if (j == 1 || j == 2 * i - 1 || i == T) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
}
