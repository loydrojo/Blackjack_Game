public class Player {

    private String name; //the unique name for this player
    private Hand hand;
    private int handValue;

    // Construct player object and assign a new hand
    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    // Return the current value of the players hand
    public int getHandValue() {
        handValue = 0;
        for (Card card: hand) {
            handValue += card.getValue();
        }
        return handValue;
    }

    public Hand getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

}
