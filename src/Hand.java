import java.util.ArrayList;

public class Hand extends ArrayList<Card> {

    private ArrayList<Card> hand; // Player Hand

    public Hand() {
        this.hand = new ArrayList<>();
    }

    // Return hand
    public ArrayList<Card> gethand() {
        return hand;
    }

}