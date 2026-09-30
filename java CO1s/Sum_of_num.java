import java.util.Scanner;
public class Sum_of_num{
    public static int sum(int n){
        if(n==0){
        return 0;
        }
    
    return n+sum(n-1);
    
    }
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);

        System.out.print("enter n : ");
        int n = scn.nextInt();

        System.out.println("sum : "+ sum(n));
    }
}