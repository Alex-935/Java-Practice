

public class _aggregation {
    
    public static void main(String[] args) {

        /*
          Aggregation = Represents a "has-a" relationship between objects.
                        One object contains another object as part of its structure,
                        but the contained object/s can exits independently.
        */

        Book book1 = new Book("The Fellowship of the Ring", 423);
        Book book2 = new Book("The Two Towers", 352);
        Book book3 = new Book("The Return of the King", 416);

        Book[] books = {book1, book2, book3};

        for (Book book : books) {
            System.out.println(book.displayInfo());
        }

        Library library = new Library("NYC Public Library", 1897, books);

        library.displayInfo();
    }

    public static class Book {

        String title;
        int pages;

        Book(String title, int pages) {
            this.title = title;
            this.pages = pages;
        }

        String displayInfo() {
            return this.title + " (" + this.pages + " pages)";
        }
    }

    public static class Library {
        
        String name;
        int year;
        Book[] books;

        Library(String name, int year, Book[] books) {

            this.name = name;
            this.year = year;
            this.books = books;

        }

        void displayInfo() {
            System.out.printf("The %d %s\n", this.year, this.name);
            System.out.println("Books available: ");
            for (Book book : this.books) {
                System.out.println(book.displayInfo());
            }
        }
        
    }
}