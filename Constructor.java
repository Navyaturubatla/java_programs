class Student {
    String name ;
    int rollno ;
    String branch;

    Student(String name , int rollno ,String branch){
        this.name =  name ;
        this.rollno= rollno;
        this.branch = branch;

    }
    void display (){

        System.out.println("Student name "+ name );
        System.out.println("Rollno. "+ rollno);
        System.out.println("Branch "+branch);


    }
}

public class Constructor{

    public static void main (String[] args){

        Student s1=new Student(
            "RAHUL" ,
            101,
            "ece"
        );

        Student s2 = new Student(
            "yamini",
            122,
            "EEE"
        );

        s1.display();
        System.out.println();
        s2.display();
    }
}