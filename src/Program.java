public class Program
{

    public static void main(String[] args) {

        Deck deck =  new Deck();

        System.out.println(   deck.deckArrList.size()   );

        Deck.printDeckArrayList( deck  );

        Deck.shuffleDeckArrList( deck );

        Deck.shuffleDeckArrList( deck );

        System.out.println(   deck.deckArrList.size()   );

        Deck.printDeckArrayList( deck  );

        /*
        Hand hand = new Hand(5, deck.deckArrList);

        hand.printHand();

        System.out.println(  deck.deckArrList.size()  );

        Deck.printDeckArrayList( deck );

        Deck.printMasterDeck( deck );
        */
    }

}
