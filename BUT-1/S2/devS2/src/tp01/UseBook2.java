// Q4.1 : Création de la classe UseBook2 pour stocker et afficher une bibliothèque de 5 livres
public class UseBook2 {
    public static void main(String[] args) {
        Book[] library = {
            new Book("J.K. Rowling", "Harry Potter", 1997),
            new Book("J.R.R. Tolkien", "Le Seigneur des Anneaux", 1954),
            new Book("George Orwell", "1984", 1949),
            new Book("F. Scott Fitzgerald", "Gatsby le Magnifique", 1925),
            new Book("Harper Lee", "Ne tirez pas sur l'oiseau moqueur", 1960)
        };
        
        // Affichage des livres
        for (Book book : library) {
            System.out.println(book);
        }
        
        // Recherche du livre le plus ancien
        Book oldest = library[0];
        for (int i = 1; i < library.length; i++) {
            if (library[i].isOldest(oldest)) {
                oldest = library[i];
            }
        }
        
        // Affichage du livre le plus ancien
        System.out.println("Le livre le plus ancien est : " + oldest);
    }
}
