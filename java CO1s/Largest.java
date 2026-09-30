import java.util.Scanner;
public class Largest 
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter no. a :");
        int a =sc.nextInt();
        
        System.out.print("enter no. b :");
        int b =sc.nextInt();
        
        int sum = a + b;
        System.out.println("sum is "+ sum);

        sc.close();
    }   

}
