/*
Pattern 1:-Triangle_Of_0_And_1.
1
0 1
1 0 1
0 1 0 1
1 0 1 0 1

*/

import java.util.Scanner;

class Triangle
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:- ");
        int T = sc.nextInt();
        System.out.println("Output is:- ");
        for(int i=1; i<=T; i++){
            for(int j=1; j<=i; j++){
                if((i+j)%2==0){
                    System.out.print("1 ");
                }
                else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}