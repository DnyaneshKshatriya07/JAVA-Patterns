import java.util.Scanner;

public class Diamond_Pattern {
    public static void main(String[] args) {
        int sp=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size:- ");
        int T = sc.nextInt();
        System.out.println("Output is:- ");
        sp=T-1;
        for(int i=1; i<=T; i++){
            for(int spc=sp; spc>=1; spc--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
            sp--;
        }
        sp=1;
        for(int i=T-1; i>=1; i--){
            for(int spc=sp; spc>=1; spc--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
            sp++;
        }
        
    }
}
