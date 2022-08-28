package card;

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

    protected static Card makeCard(Mark mark, int number){
        if(!CardNumber.numberIsValid(number)){
            ;
        }
        return new Card(mark, number);
    }

    public int giveNumber(){
        return this.number;
    }

    @Override
    public String toString(){
        return String.format("模様：%s\n番号：%d", this.mark, this.number );
    }
}
