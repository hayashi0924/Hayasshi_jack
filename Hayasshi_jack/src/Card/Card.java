package Card;

/**
 * カードを作るクラス
 * @see CardNumber
 * @see Mark
 */
public class Card {
    private Mark mark;
    private int number;

    private Card(Mark mark, int number){
        this.mark = mark;
        this.number = number;
    }

    public static Card makeCard(Mark mark, int number){
        if(!CardNumber.numberIsValid(number)){
            ;
        }
        return new Card(mark, number);
    }
}
