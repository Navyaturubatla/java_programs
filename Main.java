class Smart_locker{
    String Stu_name;
    int Stu_id;
    double parcel_weight;
    char parcel_size;
    int parcel_id;

    Smart_locker(String Stu_name,int Stu_id,double parcel_weight,char parcel_size,int parcel_id ){
        this.Stu_name = Stu_name;
        this.Stu_id = Stu_id;
        this.parcel_weight = parcel_weight;
        this.parcel_size = parcel_size;
        this.parcel_id = parcel_id;

    }
    void display(){
        System.out.println("Student name : "+Stu_name);
        System.out.println("Student id :"+Stu_id);
        System.out.println("Parcel weight : "+parcel_weight); 
        System.out.println("Parcel size: "+parcel_size);
        System.out.println("Parcel id : "+parcel_id);

    }
}
public class Main{
    public static void main (String[] args){

        Smart_locker a = new Smart_locker(
            "navya",
            672,
            35.6,
            'L',
            205
        );

        Smart_locker b = new Smart_locker(
            "anshu",
            674,
            22.4,
            'S',
            405
        );

        a.display();
        System.out.println();
        b.display();Note{
            
        }


    }
}