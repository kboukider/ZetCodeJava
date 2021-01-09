package JavaComparableAndComparator;

import java.util.Arrays;
import java.util.Comparator;

class Card implements Comparable<Card> {

	@Override
	public int compareTo(Card o) {
		return Comparator.comparing(Card::getRank)
				.thenComparing(Card::getSuit)
				.compare(this, o);
	}
	public enum Suit {
        CLUBS,
        DIAMONDS,
        HEARTS,
        SPADES
    }

    public enum Rank {
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING,
        ACE,
    }

    private Suit suit;
    private Rank rank;

    public Card(Rank rank, Suit suit) {

        this.rank = rank;
        this.suit = suit;
    }

    public Rank getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    public void showCard() {

        rank = getRank();
        suit = getSuit();

        System.out.println(rank + " of " + suit);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Card{");
        sb.append("suit=").append(suit);
        sb.append(", rank=").append(rank);
        sb.append('}');
        return sb.toString();
    }
}	

public class JavaComparableEx {

	public static void main(String[] args) {
		Card[] cards = {
                new Card(Card.Rank.KING, Card.Suit.DIAMONDS),
                new Card(Card.Rank.FIVE, Card.Suit.HEARTS),
                new Card(Card.Rank.ACE, Card.Suit.CLUBS),
                new Card(Card.Rank.NINE, Card.Suit.SPADES),
                new Card(Card.Rank.JACK, Card.Suit.SPADES),
                new Card(Card.Rank.JACK, Card.Suit.DIAMONDS)};
		
		Arrays.sort(cards);
		
		for(Card card: cards) {
			System.out.println(card);
		}
	}

}
