// Q3.2 : Création de la classe UseHighScore
public class UseHighScore {
    public static void main(String[] args) {
        HighScore hs = new HighScore();
        hs.addFirstFreeSlot(new Score("Alice", 300, "29/01"));
        hs.addFirstFreeSlot(new Score("Bob", 800, "29/01"));
        System.out.println(hs);
    }
}