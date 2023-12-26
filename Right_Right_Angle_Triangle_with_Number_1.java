/*
Pattern 1:-Right_Right_Angle_Triangle_with_Number.
        1
      1 2
    1 2 3
  1 2 3 4 
1 2 3 4 5

*/

import java.util.Scanner;

class Right_Right_Angle_Triangle_with_Number_1
{
    public static void main (String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the size:- ");
      int T = sc.nextInt();
      System.out.println("Output is:- ");
      
      for(int i=1; i<=T; i++){
          for(int j=5; j>=1; j--){
              if(j<=i){
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