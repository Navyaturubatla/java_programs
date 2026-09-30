public class LoginCheck {
    public static void main(String[] args){
        String user ="admin";
        int pin=2135;

        if (user.equals("admin")){
            if (pin==2135){
                System.out.println("Access granted");
            }
            else{
                System.out.println("wrong pin");
            }

        }
        else{
            System.out.println("unkonwn user");
        }
    }
 
}
