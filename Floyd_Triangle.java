/*
Pattern 1:-Floyd's Triangle.
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

*/

import java.util.Scanner;

class Floyd_Triangle
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:- ");
        int T = sc.nextInt();
        System.out.println("Output is:- ");
        int c=1;
        for(int i=0; i<T; i++){
            for(int j=0; j<=i; j++){
                System.out.print(c+" ");
                c++;
                }
                System.out.println();
            }        
        }
}