/*
Pattern 1:-Solid_Rectangle.
*****
*****
*****
***** 

*/

class Solid_Rectangle
{
    public static void main (String[] args)
    {
        int m= 4;
        int n= 5; 
        System.out.println("Output is:- ");
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}