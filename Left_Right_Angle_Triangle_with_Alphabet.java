/*
Pattern 1:-Left_Right_Angle_Triangle_with_Alphabet.
A
B C
D E F
H I J K

*/

import java.util.Scanner;

class Left_Right_Angle_Triangle_with_Alphabet
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:- ");
        int T = sc.nextInt();
        System.out.println("Output is:- ");
        char c='A';
        for(int i=0; i<T; i++){
            for(int j=0; j<=i; j++){
                System.out.print(c+" ");
                c++;
                }
                System.out.println();
            }        
        }
}