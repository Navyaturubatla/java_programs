import java.util.Scanner;

public class Reationaloperator{
    public static void main(String[] args){
        Scanner scn=new Scanner(System.in);

        System.out.println("enter the first number :");
        int a = scn.nextInt();

        System.out.println("enter the second number :");
        int b = scn.nextInt();

        System.out.println("\n Relational Operators");
        System.out.println(a+"=="+b+" : "+(a==b));
        System.out.println(a+"!="+b+" : "+(a!=b));
        System.out.println(a+">"+b+" : "+(a>b));
        System.out.println(a+"<"+b+" : "+(a<b));
        System.out.println(a+">="+b+" : "+(a>=b));
        System.out.println(a+"<="+b+" : "+(a<=b));
        scn.close();
        
    }

}