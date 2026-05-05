
import java.util.Scanner;

public class LibraryManagementSystem {
    public static void main(String[] args){
        System.out.println("Library BRANCH 1 VERSION");
        // Create a scanner object for user input.
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n====== Library BRANCH 1 VERSION======");
        System.out.println("1. Add Book");
       System.out.println("2. Delete Book");
       System.out.println("3. Search Book");
       System.out.println("4. Display All Books");
       System.out.println("5. Borrow Book");
       System.out.println("6. Return Book");
       System.out.println("7. Update Book");
       System.out.println("8. Exit");
       System.out.print("Choose option: ");


        
        // Create a Library object to manage the collection of the books. 
        Library library = new Library();

        // Add some books to the Library's collection.
        library.addBook(new Book("Verity", "Colleen Hoover"));
        library.addBook(new Book("The Secret", "Rhonda Byrne"));
        library.addBook(new Book("Grit", "Angela Duckworth"));

        // Infinite loop to keep the system running until the user chooses to exit.
        while(true) {
            // Display the available books in the Library.
            System.out.println("\nAvailable Books: ");
            library.displayAvailableBooks();

            // Prompt the user for an action: borrow, return, or exit.
            System.out.println("\nDo you want to borrow or return a book?");
            System.out.println("Type 'borrow' to borrow a book, 'return' to return a book, or 'exit' to quit.");
            String action = scanner.nextLine().toLowerCase(); // Read the userinput and convert it into lower case.

            // Check if the user wants to borrow a book.
            if(action.equalsIgnoreCase("Borrow")){
                // Get the title and author of the book to be borrowed.
                System.out.print("Enter the title of the book you want to borrow: ");
                String borrowTitle = scanner.nextLine();
                System.out.print("Enter the author of the book you want to borrow: ");
                String borrowAuthor = scanner.nextLine();
                // Borrow the specified book from the Library.
                library.borrowBook(borrowTitle, borrowAuthor);
               
            } // Check if the user wants to return a book.
            else if(action.equalsIgnoreCase("Return")){
                // Get the title and author of the book to return.
                System.out.print("Enter the title of the book you want to return: ");
                String returnTitle = scanner.nextLine();
                System.out.print("Enter the author of the book you want to return: ");
                String returnAuthor = scanner.nextLine();
                // Return the specified bookt o the Library.
                library.returnBook(returnTitle, returnAuthor);

            } // Check if the user wants to exit the system.
             else if (action.equalsIgnoreCase("exit")) {
                    // Exit condition
                    System.out.println("Exiting the system. Goodbye!");
                    break;
            } 
            else if(action.equalsIgnoreCase("add")){
                System.out.print("Enter book title: ");
                String title = scanner.nextLine();

               System.out.print("Enter author: ");
               String author = scanner.nextLine();

              library.addBook(new Book(title, author));
              System.out.println("Book added successfully!");
}
                 
            // Handle inavlid input from the user. 
             else {
                System.out.println("Type 'add', 'borrow', 'return', or 'exit'.");
        }

    } // Close the scanner to prevent resource leaks.
    scanner.close();
 
  }
  
}

       

           
 
 
