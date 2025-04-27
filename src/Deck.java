import java.util.ArrayList;
import java.util.Random;

public class Deck
{

    static Card[] deckArr;
    static ArrayList<Card> deckArrList;

    //Reference Arrays
    static String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};

    static String[] ranks = {"_A", "_2", "_3","_4","_5","_6","_7","_8","_9","_10","_J","_Q","_K",};

    Deck()
    {
        deckArr =  new Card[suits.length * ranks.length];

        deckArrList = new ArrayList<Card>(suits.length * ranks.length);

        this.deckArr = createMasterDeckArr();
        this.deckArrList = createMasterDeckArrList();
    }


    static ArrayList<Card> shuffleDeckArrList(Deck deck)
    {
        ArrayList<Card> shuffledPlayableDeck = new ArrayList<Card>(suits.length * ranks.length);

        Random rand = new Random();

        for(int i = 0; i < suits.length * ranks.length; i++)
        {
            int randNum = rand.nextInt(  deck.deckArrList.size()  );

            shuffledPlayableDeck.add(  deck.deckArrList.get(randNum)  );

            deck.deckArrList.remove(randNum);
        }

        deck.deckArrList = shuffledPlayableDeck;

        return shuffledPlayableDeck;
    }


    static Card[] createMasterDeckArr()
    {

        for(int i = 0; i < suits.length ;  i++ )
        {
            for(int j = 0;  j < ranks.length  ;  j++ )
            {
                deckArr[ ranks.length * i + j  ] = new Card(suits[i], ranks[j]);
            }
        }
        return deckArr;
    }


    static ArrayList<Card> createMasterDeckArrList()
    {
        ArrayList<Card> deckArrList = new ArrayList<Card>(52);

        for(int i = 0; i < suits.length    ;  i++ )
        {
            for(int j = 0;  j < ranks.length  ;  j++ )
            {
                deckArrList.add(new Card(suits[i], ranks[j]));
            }
        }
        return deckArrList;
    }

    static void printMasterDeck(Deck deck)
    {
        System.out.println("--- Master Deck Array ---");

        for(Card card: deck.deckArr)
        {
            System.out.println(  card.suit + card.rank   );
        }
    }

    static void printDeckArrayList(Deck deck)
    {
        System.out.println("--- Deck ArrayList ---");

        for(Card card: deck.deckArrList)
        {
            System.out.println(  card.suit + card.rank   );
        }
    }


}
