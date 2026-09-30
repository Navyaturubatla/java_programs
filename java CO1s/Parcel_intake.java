import java.util.Scanner;

public class Parcel_intake {
    public static void main (String[] args){
        Scanner scn = new Scanner(System.in);
        String id = scn.nextLine();
        String recipient = scn.nextLine();
        char size = scn.nextLine().charAt(0);
        double weight = scn.nextDouble();

        // //storage fee = size base + weight surchange(arithetic =casting) 
        int base = (size =='L')? 30 : (size == 'M')? 20 : 10;
        int surchange = (int) Math.ceil(weight) * 2;//rs 2 per rounded - up kg

        int fee = base + surchange;
        System.out.printf("parcel : %s (%s)%n" , id, recipient);
        System.out.printf("Size : %c Weight :%.1fkg%n" , size ,weight );
        System.out.printf("fee : Rs %d%n", fee);

        scn.close();
    }
    
}
