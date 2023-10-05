package Library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Catalog c1 = new Catalog(50);

        // Code to add books.
        c1.addBook(new Book("It Starts with Us", "Colleen Hoover", "R1957320947", true), 0);
        c1.addBook(new Book("It Ends with Us", "Colleen Hoover", "R2890483903", false), 1);
        c1.addBook(new Book("Verity", "Colleen Hoover", "R890285092", true), 2);
        c1.addBook(new Book("The Silent Patient", "Alex Michaelides", "R773490214", true), 3);
        c1.addBook(new Book("Where the Crawdads Sing", "Delia Owens", "R981245903", true), 4);
        c1.addBook(new Book("Educated: A Memoir", "Tara Westover", "R729381001", false), 5);
        c1.addBook(new Book("Becoming", "Michelle Obama", "R347920183", true), 6);
        c1.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", "R398710239", true), 7);
        c1.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "R123456789", true), 8);
        c1.addBook(new Book("1984", "George Orwell", "R987654321", false), 9);
        c1.addBook(new Book("The Catcher in the Rye", "J.D. Salinger", "R456789012", true), 10);
        c1.addBook(new Book("The Da Vinci Code", "Dan Brown", "R456123789", true), 11);
        c1.addBook(new Book("The Alchemist", "Paulo Coelho", "R987123654", false), 12);
        c1.addBook(new Book("The Harry Potter series", "J.K. Rowling", "R123987456", true), 13);
        c1.addBook(new Book("The Hobbit", "J.R.R. Tolkien", "R654987123", true), 14);
        c1.addBook(new Book("The Lord of the Rings", "J.R.R. Tolkien", "R123789654", false), 15);
        c1.addBook(new Book("Pride and Prejudice", "Jane Austen", "R123123123", true), 16);
        c1.addBook(new Book("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", "R999888777", true), 17);
        c1.addBook(new Book("Brave New World", "Aldous Huxley", "R444555333", false), 18);
        c1.addBook(new Book("The Shining", "Stephen King", "R777999555", true), 19);
        c1.addBook(new Book("The Hunger Games", "Suzanne Collins", "R111222333", true), 20);

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        // Menu options while loop
        while (isRunning) {
            System.out.println("==============================================");
            System.out.println("Welcome to the Online Library!");
            System.out.println("Please select from the following menu options:\n 1. Search for a book \n 2. Checkout a book \n 3. Return a book \n 4. Add a Book \n 5. Exit");
            System.out.println("==============================================");
            System.out.println("Type your selected option here: ");
            int menuOption = scanner.nextInt();
            scanner.nextLine();

            switch(menuOption){
                // Search for book
                case 1:
                    System.out.println("Search Results: " + c1.searchBooks());
                    break;
                    // Checkout book
                case 2:
                    System.out.println("Which book would you like to checkout?");
                    String bookToCheckout = scanner.nextLine();
                    c1.checkoutBook(bookToCheckout);
                    break;
                    // Return a book
                case 3:
                    System.out.println("Which book are you returning?");
                    String bookToReturn = scanner.nextLine();
                    c1.returnBook(bookToReturn);
                    break;
                case 4:
                    c1.addBookFromUserInput();
                    break;
                    // Exit the program
                case 5:
                    System.out.println("Exiting the program");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Please choose one of the options listed...");
                    break;
            }
        }
        scanner.close();
    }
}
