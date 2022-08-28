package card;

import java.util.ArrayList;
import java.util.*;

/**
 * Cardクラスを集め、山札としたクラス
 * @see Card
 */
public class Deck {
    /**
     * 山札
     * 外部から操作されることを防ぐため、privateとした
     */
    private List<Card> deck = new ArrayList<>();
    private Deck(List<Card> deck){
        this.deck = deck;
    }

    /**
     * 山札を作成するメソッド
     */
    public static Deck makeDeck(){
        List<Card> cards = new ArrayList<>();
        for(int i = 1; CardNumber.numberIsValid(i); i++){
            cards.add(Card.makeCard(Mark.HEART, i));
            cards.add(Card.makeCard(Mark.DIAMOND, i));
            cards.add(Card.makeCard(Mark.CLUB, i));
            cards.add(Card.makeCard(Mark.SPADE, i));
        }
        return new Deck(cards);
    }

    /**
     * 山札からカードをひき、そのカードを削除するメソッド
     * @return Card 引いたカード
     */
    public Card pulledToTheTop(){
        Card card = deck.get(new java.util.Random().nextInt(deck.size()));
        deck.remove(card);
        return card;
    }
}
