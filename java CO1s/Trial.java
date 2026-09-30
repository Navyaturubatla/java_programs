import java.util.Scanner;

public class Trial{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("enter your age:");
        int age = sc.nextInt();

        System.out.print("enter your percentage:");
        double percentage = sc.nextDouble();

        boolean scholarship = (age>=18 && percentage>=75.0);
        boolean admission =(age >=18 || percentage >=75.0);
        boolean notEligible =!(age>=18);

        System.out.println("Scholarship eligibility: " + scholarship);
        System.out.println("Admission eligibility: " + admission);  
        System.out.println("Not eligible: " + notEligible);

        sc.close();
        
    }
}