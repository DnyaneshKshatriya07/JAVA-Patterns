/*
Pattern 1:-Hollow_Rectangle.
*****
*   *
*   *
*****

*/

class Hollow_Rectangle
{
    public static void main (String[] args)
    {
        int m= 4;
        int n= 5; 
        System.out.println("Output is:- ");
        for(int i=1; i<=m; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==m || j==1 || j==n){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}