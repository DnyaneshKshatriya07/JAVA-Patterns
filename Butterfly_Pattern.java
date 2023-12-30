/*
Pattern 1:-Butterfly_Pattern.
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *

*/

import java.util.Scanner;

class Butterfly_Pattern
{
    public static void main (String[] args)
    {
        System.out.println("Enter the size:- ");
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        System.out.println("Output is:- ");
        //Upper half
        for(int i=1; i<=T; i++){//strating
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            int sp=(2*(T-i));
            for(int j=1; j<=sp; j++){//spaces
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){//ending
                System.out.print("*");
            }
            System.out.println();
        }
        //Lower half
        for(int i=T-1; i>=1; i--){//for(int i=T; i>=1; i--)
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            int sp=(2*(T-i));
            for(int j=1; j<=sp; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}