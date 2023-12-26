/*
Pattern 1:-Right_Right_Angle_Triangle_with_Number.
        1
      2 1
    3 2 1
  4 3 2 1
5 4 3 2 1

*/

import java.util.Scanner;

class Right_Right_Angle_Triangle_with_Number_2
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:- ");
        int T = sc.nextInt();
        System.out.println("Output is:- ");

        for(int i=1; i<=T; i++){
          for(int j=5; j>=1; j--){
            if(i>=j){
              System.out.print(j+" ");
            }
            else{
              System.out.print("  ");
            }
          }
          System.out.println();
        }
    }
}