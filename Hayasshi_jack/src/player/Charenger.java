package player;

import card.Card;

public class Charenger extends Player {
    private boolean drawContinue = true;

    public Charenger(Card firstCard, Card secondCard) {
        super(firstCard, secondCard);
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
        super.charengerOpenCard();
    }

    public boolean isDrawContinue() {
        System.out.println("挑戦者さん、カードをひきますか？");
            System.out.printf("続けて引く場合には%dを、このまま勝負する場合は%dを入力してください。", 0, 1);
            int select = new java.util.Scanner(System.in).nextInt();
            switch (select) {
                case 0 -> this.drawContinue = true;
                case 1 -> this.drawContinue = false;
                default -> System.out.println("入力値が違ったため、スキップします。");
            }
        return drawContinue;
    }
}
