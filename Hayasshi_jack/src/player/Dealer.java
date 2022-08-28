package player;

import card.Card;

public class Dealer extends Player{
    boolean drawContinue = true;
    public Dealer(Card firstCard, Card SecondCard) {
        super(firstCard, SecondCard);
    }

    @Override
    public void draw(Card card) {
        super.draw(card);
    }

    @Override
    public int totalValueOfHand() {
        return super.totalValueOfHand();
    }

    public void OpenCard() {
        super.DealerOpenCard();
    }

    public boolean isDrawContinue(){
        System.out.println("ディーラーさん。カードをひきますか？");
        System.out.printf("続けて引く場合には%dを、このまま勝負する場合は%dを入力してください。",0, 1);
        int select = new java.util.Scanner(System.in).nextInt();
        switch(select){
            case 0 -> this.drawContinue = true;
            case 1 -> this.drawContinue = false;
            default -> System.out.println("入力値が違ったため、スキップします。");
        }
        return drawContinue;
    }
}
