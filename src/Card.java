import java.util.Random;

public class Card { 
    
    private String[] suits = {"CLUBS", "DIAMONDS", "HEARTS", "SPADES"};
    private String[] ranks = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10","KING", "QUEEN","JACK"};
    private String suit;
    private String rank;
    private int value;

    public Card() {
        Random rand = new Random();
        this.suit = suits[rand.nextInt(suits.length)];
        this.rank = ranks[rand.nextInt(ranks.length)];

        if (rank == "KING" || rank == "QUEEN" || rank == "JACK") {
            value = 10;
        } else {
            value = Integer.parseInt(rank);
        }
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }
    

    public int getValue() {
        return value;
    }

    public String toString() {
        return rank + " of " + suit;
    }














    
}
