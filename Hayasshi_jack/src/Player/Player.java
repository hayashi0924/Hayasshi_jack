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
     * @param firstCard　初期手札１枚目
     * @param SecondCard　初期手札２枚目
     */
    public Player(Card firstCard, Card SecondCard){
        hand.add(firstCard);
        hand.add(SecondCard);
    }

    public void draw(Card card){
        hand.add(card);
    }

    public int totalValueOfHand(){
        int totalValue = 0;
        for(Card card : hand){
            totalValue += card.giveNumber();
        }
        System.out.printf("合計値は%dです", totalValue);
        return totalValue;
    }

    public void openCard(){
        for(Card card : hand){
            System.out.println(card);
        }
    }
}
