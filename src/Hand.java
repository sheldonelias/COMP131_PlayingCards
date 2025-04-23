import java.util.ArrayList;
import java.util.Random;

public class Hand
{
    ArrayList<Card> hand;
    Hand(int cardCount, ArrayList<Card> deckArrList)
    {
        Random rand = new Random();

        hand = new ArrayList<>(cardCount);

        for(int i = 0; i < cardCount ;  i++)
        {
            System.out.println(deckArrList.size());

            int cardIndex = rand.nextInt(deckArrList.size());

            hand.add(  deckArrList.get(cardIndex)   );

            deckArrList.remove(cardIndex);
        }

    }


    void printHand()
    {
        System.out.println("--- Hand ---");

        for(int i = 0; i < hand.size(); i++)
        {
            System.out.println(hand.get(i).suit + hand.get(i).rank);
        }
    }

}
