import java.util.Scanner;

public class MShape_Pattern_with_Number {
    public static void main(String[] args) {
        System.out.println("Enter the size:- ");
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        System.out.println("Output is:- ");
        //Upper half
        for(int i=1; i<=T; i++){//strating
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            int sp=(2*(T-i));
            for(int j=1; j<=sp; j++){//spaces
                System.out.print(" ");
            }
            for(int j=T; j>=1; j--){
                if(i>=j){
                  System.out.print(j);
                }
            }
            System.out.println();
        }
    }
}
