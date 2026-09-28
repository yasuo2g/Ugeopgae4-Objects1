import java.util.ArrayList;

public class Opg5MainLibrarySystemMedAccessModifiers {
    public static void main(String[] args) {
        Opg5Library library = new Opg5Library("Københavns Bibliotek");

        // Tilføj bøger
        library.addBook(new Opg5Book("1984", "George Orwell"));
        library.addBook(new Opg5Book("Harry Potter", "J.K. Rowling"));
        library.addBook(new Opg5Book("Ringenes Herre", "J.R.R. Tolkien"));
        library.addBook(new Opg5Book("To Kill a Mockingbird", "Harper Lee"));
        library.addBook(new Opg5Book("Pride and Prejudice", "Jane Austen"));

        // Lån nogle bøger
        System.out.println("\n--- Lån bøger ---");
        Opg5Book book1 = library.findBookByTitle("1984");
        if (book1 != null) {
            book1.borrow();
        }

        Opg5Book book2 = library.findBookByTitle("Harry Potter");
        if (book2 != null) {
            book2.borrow();
        }

        // Find tilgængelige bøger
        System.out.println("\n--- Tilgængelige bøger ---");
        ArrayList<Opg5Book> available = library.findAvailableBooks();
        for (Opg5Book book : available) {
            System.out.println("- " + book);
        }

        // Return bog
        System.out.println("\n--- Return bog ---");
        if (book1 != null) {
            book1.returnBook();
        }

        // Print alle bøger
        library.printAllBooks();

        // Test at private fields ikke kan tilgås
        // book1.available = true;  // FEJL! available er private
        // System.out.println(book1.title);  // FEJL! title er private
    }
}
