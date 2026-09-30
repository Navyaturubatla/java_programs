import java.util.Scanner;

public class Switch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the day number");
        int day = sc.nextInt();
        String name;
    

        switch (day) {
            case 1 : name = "Monday";
                    break;
            case 2 : name = "Tuesday";
                    break;
            case 3 : name = "Wednesday";
                    break;    
            case 4 : name = "Thursday";
                    break;
            case 5 : name = "Friday";
                    break;
            case 6 : name = "Saturday";
                    break;
            case 7 : name = "sunday weekend";
                    break;

            default : name = "weekend";
                    break;  

        }
        
        System.out.println("the day is  "+name);
        
        sc.close();



    }
}