// Q1.1 : Création de la classe Score
public class Score {
    String name;
    int score;
    String timestamp;

    // Constructeur
    public Score(String name, int score, String timestamp) {
        this.name = name;
        this.score = score;
        this.timestamp = timestamp;
    }

    // Méthode pour vérifier si deux scores appartiennent au même joueur
    public boolean isSamePlayer(Score other) {
        return this.name.equals(other.name);
    }

    // Méthode pour vérifier si un score est plus élevé qu'un autre
    public boolean isHigher(Score other) {
        return this.score > other.score;
    }

    // Méthode toString
    @Override
    public String toString() {
        return "(" + timestamp + ") " + name + " = " + score;
    }
}