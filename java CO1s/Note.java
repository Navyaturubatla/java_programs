public class Note{
    public static void main(String[] args){
        Student s1 = new Student ();
        s1.name = "Radha";
        s1.display();

        Student s2 = new Student();
        s2.name ="krishna";
        s2.display();

    }
}

    class Student {
       String name ;
        void 
        display(){
            System.out.println("Name :"+ name);
        }

    }