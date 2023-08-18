import java.util.ArrayList;
import java.util.Scanner;

public class BlackJack {

    private final String name; //the title of the game
    private ArrayList<Player> players; // the players of the game

    public BlackJack(String name) {
        this.name = name;
        players = new ArrayList<Player>();
    }

    public String getName() {
        return name;
    }

    // Add players to the game
    public void AddPlayer(Player player) {
        players.add(player);
    }
    
    // Return player list
    public ArrayList<Player> getPlayers() { 
        return players;
    }
    
    // Run a new game of BlackJack
    public void play() {  
         
        System.out.print("Enter Player Name: ");
        Scanner scanner = new Scanner(System.in);
        int answers = 1;

        String name = scanner.nextLine();
        Player p1 = new Player(name);
        Player p2 = new Player("AI");

        // Assign both players a starting hand of 2 cards
        for (int i=0; i < 2; i++) {
            p1.getHand().add(new Card());
            p2.getHand().add(new Card());
        }

        // Prompt user to hit or stay
        while (p1.getHand().size() < 5 && answers == 1) {
            System.out.println(p1.getName() + "'s Current Hand " + p1.getHand());
            System.out.print("Press 1 to hit, press 2 to stay: ");
            answers = scanner.nextInt();

            if (answers == 1) {
                p1.getHand().add(new Card());
            }
        }
        scanner.close();

        System.out.print("=============================");

        System.out.println("\nPlayer 1 Hand: " + p1.getHand() 
        + "\nP1 Hand Value: " + p1.getHandValue() + "\n");

        System.out.println("Player 2 Hand: " + p2.getHand() 
        + "\nP2 Hand Value: " + p2.getHandValue());

        declareWinner(p1, p2); // Checking Winner

        }

    // Check if the player has won or lost the game
    public void declareWinner(Player p1, Player p2) {

        System.out.println("=============================");

        if (p1.getHandValue() > 21) {
            System.out.println("P1 Lose: Over 21");          
            
        } else if (p1.getHandValue() > p2.getHandValue()) {
            System.out.println("P1 Win!: Greater Hand Than House"); 

        } else if (p1.getHandValue() < p2.getHandValue()) {
            System.out.println("P1 Lose: Lower Hand Than House"); 

        } else if (p1.getHandValue() == p2.getHandValue()) {
            System.out.println("P1 Lose: Draw"); 
        }
    }
}
