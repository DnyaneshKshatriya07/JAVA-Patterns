/*
Pattern 1:-Reverse_Left_Right_Angle_Triangle_with_Number.
1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

*/

import java.util.Scanner;

class Reverse_Left_Right_Angle_Triangle_with_Number
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:- ");
        int T = sc.nextInt();
        System.out.println("Output is:- ");

        for(int i=0; i<T; i++){
            for(int j=1; j<=T-i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}