class Methods{
    static string assigntier (char size , double weight){
        if(size=='S'&& weight<= 1.0) return "Small";
        if(size=='M'||weight <=50.0) return "Medium";
        return "large";
    }
    static double computeFee(String tier){
        switch(tier){
            case "Medium" : return 35.5;
            case "Large" : return 50.0;
            default : return 20.0;
        }
    }
} 