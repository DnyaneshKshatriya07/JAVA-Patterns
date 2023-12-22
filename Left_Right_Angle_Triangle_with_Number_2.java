/*
Pattern 1:-Left_Right_Angle_Triangle_with_Number.
1
2 1
3 2 1
4 3 2 1
5 4 3 2 1

*/

import java.util.Scanner;

class Left_Right_Angle_Triangle_with_Number_2
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:- ");
        int T = sc.nextInt();
        System.out.println("Output is:- ");
        int sp=1;

        for(int i=1; i<=T; i++){
            for(int j=i; j>=1; j--){
                System.out.print(j+" " );
                }
                System.out.println();
            }        
        }
}