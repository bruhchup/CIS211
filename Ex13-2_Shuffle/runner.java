public class runner{

    public static void main(){
        Card[] cards = new Card[52];
        Deck deck = new Deck();
        System.out.println(deck);
        System.out.println();
        deck.shuffle();
        System.out.println(deck);
    }
    
}
