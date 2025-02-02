// Q2.1 : Création de la classe HighScore
public class HighScore {
    private Score[] top;

    // Constructeur par défaut (100 scores max)
    public HighScore() {
        this(100);
    }

    // Constructeur avec taille spécifique
    public HighScore(int size) {
        top = new Score[size];
    }

    // Q2.2 : Méthode pour obtenir le nombre de slots libres
    public int getNbFreeSlot() {
        int count = 0;
        for (Score s : top) {
            if (s == null) count++;
        }
        return count;
    }
    
    // Q2.3 : Méthode toString pour afficher les scores
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("TOP SCORE:\n");
        int freeSlots = getNbFreeSlot();
        for (Score s : top) {
            if (s != null) sb.append(s).append("\n");
        }
        sb.append("**").append(freeSlots).append(" free slots**");
        return sb.toString();
    }

    // Q3.1 : Ajout d'un score à la première place disponible
    public boolean addFirstFreeSlot(Score newScore) {
        for (int i = 0; i < top.length; i++) {
            if (top[i] == null) {
                top[i] = newScore;
                return true;
            }
        }
        return false;
    }

    // Q4.1 : Décalage des scores à partir d'un index donné
    public void shifting(int idx) {
        for (int i = top.length - 1; i > idx; i--) {
            top[i] = top[i - 1];
        }
    }

    // Q4.2 : Ajout trié d'un score
    public boolean addHighestFirst(Score newScore) {
        for (int i = 0; i < top.length; i++) {
            if (top[i] == null || newScore.score > top[i].score) {
                shifting(i);
                top[i] = newScore;
                return true;
            }
        }
        return false;
    }

    public boolean addOneSlotPerPlayer(Score newScore) {
        for (int i = 0; i < top.length; i++) {
            if (top[i] != null && top[i].isSamePlayer(newScore)) {
                if (newScore.isHigher(top[i])) {
                    top[i] = newScore;
                    return true;
                }
                return false;
            }
        }
        for (int i = 0; i < top.length; i++) {
            if (top[i] == null) {
                top[i] = newScore;
                return true;
            }
        }
        return false;
    }
    
}