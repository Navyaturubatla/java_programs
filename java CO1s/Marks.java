public class Marks {
    public static void main (String[] args){
        Student s1 = new Student();
        s1.marks = 90;

        Student s2 = new Student();
        s2.marks = 80;
    }
}
class Student{
    int marks;
    void display(){
        System.out.println("Student marks  :"+ marks);    
    }
}
