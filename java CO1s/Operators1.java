import java.util.Scanner;

public class Operators1{
    public static void main(String[] args){
        Scanner scn =new Scanner(System.in);

        System.out.print("enter the first number :");
        int x = scn.nextInt();
        System.out.print("enter the second number :");
        int y = scn.nextInt();

        System.out.println("Addition: " + (x + y));
        System.out.println("Subraction:"+ (x-y));
        System.out.println("Multiplication:"+(x*y));
        System.out.println("Division :"+(x/y));
        System.out.println("Remainder is :"+(x%y));

        scn.close();
    }
    
}