import java.util.Scanner;

public class Library_System {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String[] books = new String [50];
        boolean[] available = new boolean[50];

        int book_count = 0;
        int choice;

        while (true){
            System.out.println("=====COMMUNITY LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Book");
            System.out.println("2. Update Book");
            System.out.println("3. Delete Book");
            System.out.println("4. Register Member");
            System.out.println("5. Issue Book");
            System.out.println("6. Return Book");
            System.out.println("7. Search Book");
            System.out.println("8. Display All Books");
            System.out.println("9. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    if (bookCount < 50) {
                        System.out.print("Enter book title: ");
                        books[bookCount] = sc.nextLine();

                        available[bookCount] = true;
                        bookCount++;

                        System.out.println("Book added successfully.");
                    } else {
                        System.out.println("Library is full.");
                    }
                    break;
                
                case 2:
                    System.out.print("Enter book number to update: ");
                    int update = sc.nextInt();
                    sc.nextLine();

                    if (update > 0 && update <= bookCount) {
                        System.out.print("Enter new book title: ");
                        books[update - 1] = sc.nextLine();

                        System.out.println("Book updated successfully.");
                    } else {
                        System.out.println("Invalid book number.");
                    }
                    break;
            




                    
        }




    }
    
}
