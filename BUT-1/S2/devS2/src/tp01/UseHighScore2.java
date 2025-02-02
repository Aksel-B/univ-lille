// Q3.3 : Création de la classe UseHighScore2
public class UseHighScore2 {
    public static void main(String[] args) {
        int size = 10; // Valeur par défaut

        if (args.length > 0) {
            try {
                size = Integer.parseInt(args[0]);
            } catch (NumberFormatException e) {
                System.out.println("Argument invalide, utilisation de la valeur par défaut : " + size);
            }
        } else {
            System.out.println("Aucun argument fourni, utilisation de la valeur par défaut : " + size);
        }

        HighScore hs = new HighScore(size);
        hs.addFirstFreeSlot(new Score("Alice", 300, "29/01"));
        hs.addFirstFreeSlot(new Score("Bob", 800, "29/01"));
        hs.addFirstFreeSlot(new Score("Alice", 42, "30/01"));
        hs.addFirstFreeSlot(new Score("Alice", 650, "31/01"));
        System.out.println(hs);
    }
}
