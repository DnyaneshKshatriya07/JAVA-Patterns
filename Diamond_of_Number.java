/*
Pattern 1:-Diamond_of_Number.
    1    
   222   
  33333  
 4444444 
555555555
 4444444 
  33333  
   222   
    1    
*/

import java.util.Scanner;

public class Diamond_of_Number {
    public static void main(String[] args) {
        int i, j, k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:- ");
        int T = sc.nextInt();
        System.out.println("Output is:- ");

        //1st half
        for (i = 1; i <= T; i++) {
            for (j = i; j < T; j++) {
                System.out.print(" ");
            }
            for (k = 1; k < (i * 2); k++) {
                System.out.print(i);
            }
            System.out.println();
        }

        //2nd half
        for (i = T-1; i >= 1; i--) {
            for (j = T; j > i; j--) {
                System.out.print(" ");
            }
            for (k = 1; k < (i * 2); k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
