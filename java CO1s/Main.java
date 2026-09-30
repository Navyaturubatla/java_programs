public class Main {
    public static void main(String[] args){
        book b = new book();
        System.out.println(b.title);
    }
}
class book{
    String title;
    book(){
        title = "untitled";
    }
}