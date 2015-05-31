package ds;

public class Card
{
    private final Rank rank;
    private final Suit suit;

    public Card(Rank pRank, Suit pSuit)
    {
        rank = pRank;
        suit = pSuit;
    }

    public Rank getRank()
    {
        return rank;
    }

    public Suit getSuit()
    {
        return suit;
    }

    @Override
    public boolean equals(Object o)
    {
        if (o != null)
        {
            Card card = (Card) o;
            return getRank().equals(card.getRank())
                    && getSuit().equals(card.getSuit());
        }
        else
        {
            return false;
        }
    }

    @Override
    public String toString()
    {
        return String.format("%s OF %sS", getRank(), getSuit());
    }
}