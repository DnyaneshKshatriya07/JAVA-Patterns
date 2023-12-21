/*
Pattern 1:-Equilateral_Triangle_with_Dots.
    *
   * *
  * * *
 * * * *
* * * * *

*/

import java.util.Scanner;

class Equilateral_Triangle_with_Dots
{
    public static void main (String[] args)
    {
        int sp=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:- ");
        int T = sc.nextInt();
        System.out.println("Output is:- ");
        sp=T-1;
        for(int i=1; i<=T; i++){
            for(int spc=sp; spc>=1; spc--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
            sp--;
        }
    }
}