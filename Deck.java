import java.util.ArrayList;
public class Deck {
    private ArrayList<Card> cards;
    public Deck() {
        cards = new ArrayList<>();
        // Initialize the deck with 52 cards
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                Card card = new Card(suit, rank);
                cards.add(card);
                // Add the card to the deck (not shown in this snippet)
            }
        }
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Card card : cards) {
            sb.append(card.getRank()).append(" of ").append(card.getSuit()).append("\n");
        }
        return sb.toString();
    }
}

