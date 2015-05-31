package ds;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Deck
{
    private final Deque<Card> cards = new LinkedList<>();

    public Deck()
    {
        for(Rank rank : Rank.values())
        {
            for (Suit suit : Suit.values())
            {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public boolean contains(Card pCard)
    {
        return cards.contains(pCard);
    }

    public Card play()
    {
        return cards.pop();
    }

    public int size()
    {
        return cards.size();
    }

    public void combineShuffle()
    {

    }
}
