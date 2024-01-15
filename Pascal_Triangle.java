/*
Pattern 1:- Pascal Triangle.
     1 
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1  
*/

import java.util.Scanner;

public class Pascal_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the size:- ");
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        System.out.println("Output is:- ");
        int x, y, a, z, s;
        s = T;

        for (x = 0; x <= T; x++) {
            a = 1;
            for (z = s; z >= 0; z--)
                System.out.print(" ");

            s--;

            for (y = 0; y <= x; y++) {
                System.out.print(a + " ");
                a = (a * (x - y) / (y + 1));
            }
            System.out.println();
        }
    }
}
