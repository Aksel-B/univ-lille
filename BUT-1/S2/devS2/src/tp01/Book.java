//Q2.1 : Création de la classe Book
public class Book {
    String author;
    String title;
    int year;

    // Constructeur
    public Book(String author, String title, int year) {
        this.author = author;
        this.title = title;
        this.year = year;
    }

    // Méthode toString au format CSV
    @Override
    public String toString() {
        return author + ";" + title + ";" + year;
    }

    // Q4.4 : Méthode isOldest pour comparer l'année de publication
    public boolean isOldest(Book other) {
        return this.year < other.year;
    }
}

