/*
Pattern :-Number_Pyramid.
    1    
   2 2   
  3 3 3  
 4 4 4 4 
5 5 5 5 5
    
*/
import java.util.Scanner;

public class Number_Pyramid {
    public static void main(String[] args) {
        System.out.println("Enter the size:- ");
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        System.out.println("Output is:- ");

        for (int i = 1; i <= T; i++) {
            for (int j = 1; j <= T - i; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }

            System.out.println();
        }
    }
}
