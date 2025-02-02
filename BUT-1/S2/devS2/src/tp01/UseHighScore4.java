public class UseHighScore4 {
    public static void main(String[] args) {
        HighScore hs = new HighScore(3);
        hs.addOneSlotPerPlayer(new Score("Alice", 300, "29/01"));
        hs.addOneSlotPerPlayer(new Score("Bob", 800, "29/01"));
        hs.addOneSlotPerPlayer(new Score("Alice", 650, "31/01"));
        hs.addOneSlotPerPlayer(new Score("Carl", 750, "30/01"));
        hs.addOneSlotPerPlayer(new Score("Bob", 430, "31/01"));
        System.out.println(hs);
    }
}
