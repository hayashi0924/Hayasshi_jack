package rule;

import player.*;

public class Judgement {
    private static final int UPPER_LIMIT = 21;
    private static String winner;

    public static String whosWinner(Player charenger, Player dealar) {
        boolean charengerBiggerDealerHand = charenger.totalValueOfHand() > dealar.totalValueOfHand();
        if (charengerBiggerDealerHand) {
            if (handIsValid(charenger)) {
                winner = "挑戦者";
            } else if (handIsValid(dealar)) {
                winner = "ディーラー";
            } else {
                winner = "引き分け";
            }
        }
        if(!charengerBiggerDealerHand){
            if(handIsValid(dealar)){
                winner = "ディーラー";
            }else if(handIsValid(charenger)){
                winner = "挑戦者";
            }else{
                winner = "引き分け";
            }
        }
        return winner;
    }

    private static boolean handIsValid(Player player) {
        return player.totalValueOfHand() <= UPPER_LIMIT;
    }

    public static boolean isDealerHandMustContinueDraw(Dealer dealer){
        final int MIN_TOTAL_VALUE = 14;
        return dealer.totalValueOfHand() < MIN_TOTAL_VALUE;
    }
}
