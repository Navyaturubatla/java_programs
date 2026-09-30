import java.util.Scanner;

public class RooftopManagement {
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        int r = 1;
        System.out.println("Enter the no.of readings you want in your daily report");
        int n = scn.nextInt();

        int generated_power = 0;
        int consumption = 0;
        double battery =0.0;
        String conclusion = "0";

        while ( r <= n){
            
            System.out.printf("\n Enter generated_power ");
            generated_power = scn.nextInt();
            System.out.printf("Enter power consumtion  ");
            consumption = scn.nextInt();

            int rest = generated_power - consumption;

            String g = "null";

            if(rest<generated_power){
                g = "Surplus";
            }else if(rest > generated_power){
                g = "deficit";
            }else if(rest == generated_power){
                g = "balanced ";
            }

            String b = "null";
            System.out.printf("Enter the remaining battery  ");
            battery = scn.nextInt();

            if (battery>80.0){
                b= "high battery";
            }else if(battery > 50.0){
                b= "medium battery";
            }else if (battery < 50.0){
                b= "low battery";
            }

            // String result = ("the" +" "+ r  +" reading report is"+ g + "---" + b);

            System.out.println( "\nTHE" +" "+ r  +"  READING REPORT IS  "+ g + "---" + b);

            r++;
            conclusion = g +" power  and  "+b;

        
        }

        // Display complete daily report
        System.out.println("\n========== DAILY REPORT ==========");

        for (int i = 0; i < n; i++) {

            System.out.println("\nReading " + (i+1)+ ":");
            System.out.println("Power Generated: " + generated_power + " W");
            System.out.println("Consumption : " + consumption + " W");
            System.out.println("Battery : " + battery + "%");
            System.out.println("Conclusion: " + conclusion);
        }

        System.out.println("\n==================================");
    
        scn.close()
        ;

        
    }
}
