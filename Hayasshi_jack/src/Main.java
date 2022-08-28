import Card.Deck;
import Player.Charenger;
import Player.Dealer;

public class Main {
    public static void main(String[] args) {
        rule.Explanation.main();
        Deck deck = Card.Deck.makeDeck();

        Charenger charenger = new Charenger(deck.pulledToTheTop(), deck.pulledToTheTop());
        Dealer dealer = new Dealer(deck.pulledToTheTop(), deck.pulledToTheTop());

        charenger.OpenCard();
        dealer.OpenCard();
        while(rule.Judgement.isDealerHandMustContinueDraw(dealer)){
            System.out.println("ディーラーの手札合計値が１４に満たないため、続けて配布します。");
            dealer.draw(deck.pulledToTheTop());
        }


        boolean isThinkingTime = true;
        while(isThinkingTime){
            boolean charengerWantToDraw = charenger.isDrawContinue();
            boolean dealerWantToDraw = dealer.isDrawContinue();

            if(charengerWantToDraw){
                charenger.draw(deck.pulledToTheTop());
            }
            if(dealerWantToDraw){
                dealer.draw(deck.pulledToTheTop());
            }

            isThinkingTime = charengerWantToDraw || dealerWantToDraw;
        }
        System.out.printf("勝者は%sです。", rule.Judgement.whosWinner(charenger, dealer));
    }
}
