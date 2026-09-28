import java.util.ArrayList;

public class Opg5Library {
    private String libraryName;
    private ArrayList<Opg5Book> books;

    public Opg5Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Opg5Book book) {
        if (book != null) {
            books.add(book);
            System.out.println("Tilføjet bog: " + book.getTitle());
        }
    }

    public ArrayList<Opg5Book> findAvailableBooks() {
        ArrayList<Opg5Book> available = new ArrayList<>();
        for (Opg5Book book : books) {
            if (book.isAvailable()) {
                available.add(book);
            }
        }
        return available;
    }

    public Opg5Book findBookByTitle(String title) {
        for (Opg5Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    public void printAllBooks() {
        System.out.println("\n=== " + libraryName + " ===");
        System.out.println("Alle bøger:");
        for (Opg5Book book : books) {
            System.out.println("- " + book);
        }
    }
}
