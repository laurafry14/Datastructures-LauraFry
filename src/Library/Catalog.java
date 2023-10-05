package Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Catalog {
    private Book[] books;

    public Catalog(int maxCatalogSize){
        books = new Book[maxCatalogSize];
    }

    public void addBook(Book book, int index){
        if (index >= 0 && index < books.length) {
            books[index] = book;
        } else {
            System.out.println("Invalid index for adding a book.");
        }
    }

    public int getNumberOfBooks() {
        int count = 0;
        for (Book book : books) {
            if (book != null) {
                count++;
            }
        }
        return count;
    }

    public List<Book> searchBooks(){
        Scanner scanner = new Scanner(System.in);
        List<Book> searchResults = new ArrayList<>();
        String searchOption;
        do {
            // Display the search options
            System.out.println("Would you like to search by title, author, or ISBN?");
            searchOption = scanner.nextLine().toLowerCase(); // Convert input to lowercase for case insensitivity

            // Check if the input is valid
            if (searchOption.equalsIgnoreCase("title") || searchOption.equalsIgnoreCase("author") || searchOption.equalsIgnoreCase("isbn")) {
                break; // Valid input, exit the loop
            } else {
                System.out.println("Invalid input.");
            }
        } while (true);

        System.out.println("Enter search criteria: ");
        String valueToSearch = scanner.nextLine();
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (searchOption.equalsIgnoreCase("title")){
                if (book != null && book.getTitle().toLowerCase().contains(valueToSearch.toLowerCase())) {
                    searchResults.add(book);
                }
            } else if (searchOption.equalsIgnoreCase("author")) {
                if (book != null && book.getAuthor().toLowerCase().contains(valueToSearch.toLowerCase())) {
                    searchResults.add(book);
                }
            } else if (searchOption.equalsIgnoreCase("ISBN")) {
                if (book != null && book.getISBN().toLowerCase().contains(valueToSearch.toLowerCase())){
                    searchResults.add(book);
                }
            }
        }
        return searchResults;
    }

    public void checkoutBook (String bookToCheckout) {
        boolean bookFound = false;
        for (int i = 0; i < books.length; i++) {
            Book book = books[i];
            if (book != null && book.getTitle().equalsIgnoreCase(bookToCheckout)) {
                if (book.isAvailable() == false) {
                    System.out.println("Sorry this book is already checked out.");
                } else if (book.isAvailable() == true) {
                    book.available = false;
                    System.out.println("You have successfully checked out the book.");
                }
                bookFound = true;
                break;
            }
        }

        if (!bookFound) {
            System.out.println("This book is not in stock.");
        }
    }

    public void returnBook (String bookToReturn){
        boolean bookFound = false;
        for (int i = 0; i <books.length; i++){
            Book book = books[i];
            if (book != null && book.getTitle().equalsIgnoreCase(bookToReturn)) {
                if (book.isAvailable() == true) {
                    System.out.println("This book was not checked out.");
                } else if (book.isAvailable() == false) {
                    book.available = true;
                    System.out.println("You have successfully returned your book.");
                }
                bookFound = true;
                break;
            }
        }
        if (!bookFound) {
            System.out.println("This book is not in stock.");
        }
    }

    public void addBookFromUserInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter book details: ");
        System.out.print("Title: ");
        String title = scanner.nextLine();
        System.out.print("Author: ");
        String author = scanner.nextLine();
        System.out.print("ISBN: ");
        String ISBN = scanner.nextLine();
        boolean isAvailable = true;

        int index = findAvailableSlot();
        if (index != -1) {
            books[index] = new Book(title, author, ISBN, isAvailable);
            System.out.println("Book added to the catalog.");
        } else {
            System.out.println("Catalog is full. Cannot add more books.");
        }
    }

    private int findAvailableSlot() {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                return i; // Found an available slot
            }
        }
        return -1; // No available slot found
    }
}
