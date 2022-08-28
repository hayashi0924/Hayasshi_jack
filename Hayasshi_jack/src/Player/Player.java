package Player;

import Card.*;
import rule.Judgement;

import java.util.*;

public class Player {
    /**
     * 手札
     */
    private List<Card> hand = new ArrayList<>();

    private Judgement victoryOrDefeat;


    /**
     * コンストラクタ
     *
     * @param firstCard  　初期手札１枚目
     * @param SecondCard 　初期手札２枚目
     */
    public Player(Card firstCard, Card SecondCard) {
        hand.add(firstCard);
        hand.add(SecondCard);
    }

    public void draw(Card card) {
        System.out.println("引いたカードは" + card  + "です");
        hand.add(card);
    }

    public int totalValueOfHand() {
        int totalValue = 0;
        for (Card card : hand) {
            totalValue += card.giveNumber();
        }
        System.out.printf("合計値は%dです", totalValue);
        return totalValue;
    }

    public void charengerOpenCard() {
        System.out.println("挑戦者の手札を公開します。");
        for (Card card : hand) {
            System.out.println(card);
        }
        System.out.println("挑戦者、ありがとうございます。");
    }
    public void DealerOpenCard(){
        System.out.println("ディーラーの手札を公開します。１枚はご想像にお任せします。");
        for(int i = 1; i < hand.size(); i++){
            System.out.println(hand.get(i));
        }
        System.out.println("ディーラーさん、ありがとうございました。");
    }
}
