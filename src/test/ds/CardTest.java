package ds;

import ds.Card;
import ds.Rank;
import ds.Suit;
import org.junit.Assert;
import org.junit.Test;

public class CardTest
{
    @Test
    public void testCard()
    {
        Card card = new Card(Rank.KING, Suit.DIAMOND);
        Assert.assertTrue(card.getRank() == Rank.KING);
        Assert.assertTrue(card.getSuit() == Suit.DIAMOND);
    }
}