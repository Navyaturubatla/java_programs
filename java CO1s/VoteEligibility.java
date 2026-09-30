import java.util.Scanner;

public class VoteEligibility  {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        //System.out.print("enter the age of the voter ");
        int age =sc.nextInt();

        if (age>=18) {
            System.out.println("eligibile to vote ");
        
        }
        else{
            System.out.println("not eligibile to vote ");

        }
        sc.close();
        
    }
}

