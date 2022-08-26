package Card;

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
    private static List<Card> deck = new ArrayList<>();

    /**
     * 山札を作成するメソッド
     */
    public static void makeDeck(){
        for(int i = 1; CardNumber.numberIsValid(i); i++){
            deck.add(Card.makeCard(Mark.HEART, i));
            deck.add(Card.makeCard(Mark.DIAMOND, i));
            deck.add(Card.makeCard(Mark.CLUB, i));
            deck.add(Card.makeCard(Mark.SPADE, i));
        }
    }

    /**
     * 山札からカードをひき、そのカードを削除するメソッド
     * @return Card 引いたカード
     */
    public Card isTopCard(){
        Card card = deck.get(new java.util.Random().nextInt(deck.size()));
        deck.remove(card);
        return card;
    }
}
