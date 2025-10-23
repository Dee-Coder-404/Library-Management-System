package Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);

        // Add some sample books and users
        
        library.addBook(new Book("Java Basics", "John Doe"));
        library.addBook(new Book("OOP Concepts", "Jane Smith"));
        library.addBook(new Book("Data Structures", "Alan Turing"));

        library.addUser(new User("Alice", 1));
        library.addUser(new User("Bob", 2));

        int choice;
        do {
            System.out.println("\n===== Library Menu =====");
            System.out.println("1. Show all books");
            System.out.println("2. Issue a book");
            System.out.println("3. Return a book");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    library.showAllBooks();
                    break;
                case 2:
                    System.out.print("Enter book title to issue: ");
                    String titleToIssue = sc.nextLine();
                    System.out.print("Enter user ID: ");
                    int userId = sc.nextInt();
                    library.issueBook(titleToIssue, userId);
                    break;
                case 3:
                    System.out.print("Enter book title to return: ");
                    String titleToReturn = sc.nextLine();
                    library.returnBook(titleToReturn);
                    break;
                case 4:
                    System.out.println("Exiting system... Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}

