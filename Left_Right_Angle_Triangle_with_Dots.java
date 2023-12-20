/*
Pattern 1:-Left_Right_Angle_Triangle_with_Dots.
*
* *
* * *
* * * *
* * * * *

*/

import java.util.Scanner;

class Left_Right_Angle_Triangle_with_Dots
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:- ");
        int T = sc.nextInt();
        System.out.println("Output is:- ");
        for(int i=1; i<=T; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}