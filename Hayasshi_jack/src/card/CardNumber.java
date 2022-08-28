package card;

/**
 * 値オブジェクトを定めるクラス
 * １〜１３までの数字を有効な数字とする
 */
public class CardNumber {
    /**
     * 最小値
     */
    private static final int MIN_NUMBER = 1;
    /**
     * 最大値
     */
    private static final int MAX_NUMBER = 13;
    /**
     * トランプ番号
     */
    private final int number;

    /**
     * コンストラクタ
     * @param value　値
     */
    private CardNumber(int value){
        this.number = value;
    }

    /**
     * 数値の有効範囲を判定するメソッド
     * @param value　値
     * @return ルール内ならtrue、それ以外ならfalse
     */
    public static boolean numberIsValid(int value){
        return MIN_NUMBER <= value && value <= MAX_NUMBER;
    }

    public static CardNumber from(int value){
        if(!numberIsValid(value)){
            throw new IllegalArgumentException("トランプでは扱えない数値です。値：" + value);
        }
        return new CardNumber(value);
    }
}
