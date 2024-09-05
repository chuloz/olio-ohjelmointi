package Task1;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Libarary Catalog: ");
        Kirjastokirjat book1 = new Kirjastokirjat("Introduction to Java Programming", "John Smith", 2020);
        Kirjastokirjat book2 = new Kirjastokirjat("Data Structures and Algorithms", "Jane Doe", 2018);
        Kirjastokirjat book3 = new Kirjastokirjat("The Art of Fiction", "Alice Johnson", 2019);


        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.displaybooks();
        String findbooksbyauthor = "Jane Doe";
        System.out.println("Books by Author " + findbooksbyauthor + " ");
        library.findbooksbyauthor(findbooksbyauthor);

        library.borrowbook("Introduction to Java Programming");

        String bookToCheck = "Introduction to Java Programming";
        boolean isAvailable = library.isBookAvailable(bookToCheck);

        if (isAvailable) {
            System.out.println("The book " + bookToCheck + " is available ");
        } else {
            System.out.println("The book " + bookToCheck + " is not available ");
        }

        book3.setRating(4.5);
        System.out.println(book3.getRating() + " Hyvä kirja");

        Kirjastokirjat mostReviewedBook = library.getMostReviewedBook();
        System.out.println("Most Reviewed Book: " + mostReviewedBook.getBooksTitle());;
    }


}


class Kirjastokirjat {


    private String booksTitle;
    private String author;
    private int publication_year;
    private double rating;
    private ArrayList<String> reviews;

    public Kirjastokirjat(String booksTitle, String author, int publication_year) {
        this.booksTitle = booksTitle;
        this.author = author;
        this.publication_year = publication_year;
        this.rating = 0.0;
        this.reviews = new ArrayList<>();
    }

    public String getBooksTitle() {
        return booksTitle;
    }
    public String getAuthor()
    {
        return author;
    }
    public int getPublication_year() {

        return publication_year;
    }
    public void setRating(double rating) {
        if (rating >= 0.0 && rating <= 5.0) {
            this.rating = rating;
        } else {
            System.out.println("Rating must be between 0.0 and 5.0.");
        }

    }
    public double getRating() {
        return rating;
    }

    public void addReview(String review) {
        reviews.add(review);
    }
    public int getReviewCount() {
        return reviews.size();
    }
}

class Library {
    private ArrayList<Kirjastokirjat> books = new ArrayList<>();

    public void borrowbook(String booksTitle){
        boolean found = false;
        for (Kirjastokirjat book : books){
            if (book.getBooksTitle().equalsIgnoreCase(booksTitle)){
                found = true;
                books.remove(book);
                System.out.println(" Book " + booksTitle + " has been borrowed");
                break;}

            if (!found) {
                System.out.println("Book " + booksTitle + " not found. ");
            }
        }
    }
    public boolean isBookAvailable(String title) {
        for (Kirjastokirjat book : books) {
            if (book.getBooksTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    public void returnBook(Kirjastokirjat returnedBook) {
        books.add(returnedBook);
        System.out.println("Book " + returnedBook.getBooksTitle() + " has been returned.");
    }


    public void addBook(Kirjastokirjat book) {
        books.add(book);
    }

    public void displaybooks() {
        int index = 1;
        for (Kirjastokirjat book : books) {
            System.out.println(index + " " + "Title: " + book.getBooksTitle() + ", Author: " + book.getAuthor() +
                    " Year: " + book.getPublication_year());
            index ++;
        }
    }

    public void findbooksbyauthor(String findingauthor) {
        boolean found = false;
        for (Kirjastokirjat book : books) {
            if (book.getAuthor().equals(findingauthor)) {
                System.out.println("Title: " + book.getBooksTitle() + ", Year: " + book.getPublication_year());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No books found by Author " + findingauthor + " ");
        }
    }
    public double getAverageBookRating() {
        if (books.isEmpty()) {
            return 0.0;
        }
        double totalRating = 0.0;
        for (Kirjastokirjat book : books) {
            totalRating += book.getRating();
        }
        return totalRating / books.size();
    }
    public Kirjastokirjat getMostReviewedBook() {
        if (books.isEmpty()) {
            return null;
        }

        Kirjastokirjat mostReviewedBook = books.get(0);
        int maxReviews = 0;

        for (Kirjastokirjat book : books) {
            int currentReviews = book.getReviewCount();
            if (currentReviews > maxReviews) {
                mostReviewedBook = book;
                maxReviews = currentReviews;
            }
        }
        return mostReviewedBook;
    }
}
