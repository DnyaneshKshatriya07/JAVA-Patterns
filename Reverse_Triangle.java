/*
Pattern 1:-Reverse_Triangle.
* * * * *
 * * * *
  * * *
   * *
    *
*/

import java.util.Scanner;

public class Reverse_Triangle {
    public static void main(String[] args) {
        int sp=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:- ");
        int T = sc.nextInt();
        System.out.println("Output is:- ");
        
        sp=1;
        for(int i=T; i>=1; i--){
            for(int spc=sp; spc>=1; spc--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
            sp++;
        }
        
    }
}
