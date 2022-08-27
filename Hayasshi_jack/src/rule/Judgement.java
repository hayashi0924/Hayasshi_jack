package rule;

import Card.Card;
import Player.Player;

public class Judgement {
    private static final int UPPER_LIMIT = 21;
    private static String victoryOrLose;

    public static String whosWinner(Player charenger, Player dealar) {
        boolean charengerBiggerDealer = charenger.totalValueOfHand() > dealar.totalValueOfHand();
        if (charengerBiggerDealer) {
            if (handIsValid(charenger)) {
                victoryOrLose = "挑戦者";
            }
        }
        if (!charengerBiggerDealer) {
            if (handIsValid(dealar)) {
                victoryOrLose = "ディーラー";
            }
        }
        victoryOrLose = "引き分け";
        return victoryOrLose;
    }

    private static boolean handIsValid(Player player) {
        return player.totalValueOfHand() <= UPPER_LIMIT;
    }
}
