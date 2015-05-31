import ds.Card;
import ds.Deck;
import ds.Rank;
import ds.Suit;
import org.junit.Assert;
import org.junit.Test;

public class DeckTest
{
    @Test
    public void testDeckContainsAllCards()
    {
        Deck deck = new Deck();
        Assert.assertTrue(deck.contains(new Card(Rank.ONE, Suit.SPADE)));
        Assert.assertTrue(deck.contains(new Card(Rank.TWO, Suit.SPADE)));
        Assert.assertTrue(deck.contains(new Card(Rank.THREE, Suit.SPADE)));
        Assert.assertTrue(deck.contains(new Card(Rank.FOUR, Suit.SPADE)));
        Assert.assertTrue(deck.contains(new Card(Rank.FIVE, Suit.SPADE)));
        Assert.assertTrue(deck.contains(new Card(Rank.SIX, Suit.SPADE)));
        Assert.assertTrue(deck.contains(new Card(Rank.SEVEN, Suit.SPADE)));
        Assert.assertTrue(deck.contains(new Card(Rank.EIGHT, Suit.SPADE)));
        Assert.assertTrue(deck.contains(new Card(Rank.NINE, Suit.SPADE)));
        Assert.assertTrue(deck.contains(new Card(Rank.TEN, Suit.SPADE)));
        Assert.assertTrue(deck.contains(new Card(Rank.JACK, Suit.SPADE)));
        Assert.assertTrue(deck.contains(new Card(Rank.QUEEN, Suit.SPADE)));
        Assert.assertTrue(deck.contains(new Card(Rank.KING, Suit.SPADE)));

        Assert.assertTrue(deck.contains(new Card(Rank.ONE, Suit.HEART)));
        Assert.assertTrue(deck.contains(new Card(Rank.TWO, Suit.HEART)));
        Assert.assertTrue(deck.contains(new Card(Rank.THREE, Suit.HEART)));
        Assert.assertTrue(deck.contains(new Card(Rank.FOUR, Suit.HEART)));
        Assert.assertTrue(deck.contains(new Card(Rank.FIVE, Suit.HEART)));
        Assert.assertTrue(deck.contains(new Card(Rank.SIX, Suit.HEART)));
        Assert.assertTrue(deck.contains(new Card(Rank.SEVEN, Suit.HEART)));
        Assert.assertTrue(deck.contains(new Card(Rank.EIGHT, Suit.HEART)));
        Assert.assertTrue(deck.contains(new Card(Rank.NINE, Suit.HEART)));
        Assert.assertTrue(deck.contains(new Card(Rank.TEN, Suit.HEART)));
        Assert.assertTrue(deck.contains(new Card(Rank.JACK, Suit.HEART)));
        Assert.assertTrue(deck.contains(new Card(Rank.QUEEN, Suit.HEART)));
        Assert.assertTrue(deck.contains(new Card(Rank.KING, Suit.HEART)));

        Assert.assertTrue(deck.contains(new Card(Rank.ONE, Suit.DIAMOND)));
        Assert.assertTrue(deck.contains(new Card(Rank.TWO, Suit.DIAMOND)));
        Assert.assertTrue(deck.contains(new Card(Rank.THREE, Suit.DIAMOND)));
        Assert.assertTrue(deck.contains(new Card(Rank.FOUR, Suit.DIAMOND)));
        Assert.assertTrue(deck.contains(new Card(Rank.FIVE, Suit.DIAMOND)));
        Assert.assertTrue(deck.contains(new Card(Rank.SIX, Suit.DIAMOND)));
        Assert.assertTrue(deck.contains(new Card(Rank.SEVEN, Suit.DIAMOND)));
        Assert.assertTrue(deck.contains(new Card(Rank.EIGHT, Suit.DIAMOND)));
        Assert.assertTrue(deck.contains(new Card(Rank.NINE, Suit.DIAMOND)));
        Assert.assertTrue(deck.contains(new Card(Rank.TEN, Suit.DIAMOND)));
        Assert.assertTrue(deck.contains(new Card(Rank.JACK, Suit.DIAMOND)));
        Assert.assertTrue(deck.contains(new Card(Rank.QUEEN, Suit.DIAMOND)));
        Assert.assertTrue(deck.contains(new Card(Rank.KING, Suit.DIAMOND)));

        Assert.assertTrue(deck.contains(new Card(Rank.ONE, Suit.CLUB)));
        Assert.assertTrue(deck.contains(new Card(Rank.TWO, Suit.CLUB)));
        Assert.assertTrue(deck.contains(new Card(Rank.THREE, Suit.CLUB)));
        Assert.assertTrue(deck.contains(new Card(Rank.FOUR, Suit.CLUB)));
        Assert.assertTrue(deck.contains(new Card(Rank.FIVE, Suit.CLUB)));
        Assert.assertTrue(deck.contains(new Card(Rank.SIX, Suit.CLUB)));
        Assert.assertTrue(deck.contains(new Card(Rank.SEVEN, Suit.CLUB)));
        Assert.assertTrue(deck.contains(new Card(Rank.EIGHT, Suit.CLUB)));
        Assert.assertTrue(deck.contains(new Card(Rank.NINE, Suit.CLUB)));
        Assert.assertTrue(deck.contains(new Card(Rank.TEN, Suit.CLUB)));
        Assert.assertTrue(deck.contains(new Card(Rank.JACK, Suit.CLUB)));
        Assert.assertTrue(deck.contains(new Card(Rank.QUEEN, Suit.CLUB)));
        Assert.assertTrue(deck.contains(new Card(Rank.KING, Suit.CLUB)));

        /*contains all cards
        *
        * size
        *
        * can shuffle the order*/
    }

    @Test
    public void testPop()
    {
        Deck deck = new Deck();
        int originalSize = deck.size();
        Assert.assertEquals(new Card(Rank.ONE, Suit.SPADE), deck.play());
        Assert.assertEquals(originalSize - 1, deck.size());
    }

    @Test
    public void testShuffle()
    {

    }

    @Test
    public void testCombineShuffle()
    {
        Deck deck = new Deck();
        Card playedCard = deck.play();
        deck.combineShuffle();
        deck.contains(playedCard);
    }
}