package card;

/**
 * enumクラス：トランプの模様を定めるクラス
 */
public enum Mark {
    HEART("HEART"),
    SPADE("SPADE"),
    DIAMOND("DIAMOND"),
    CLUB("CLUB"),
    ;

    /**
     * 模様*/
    private final String mark;

    /**
     * コンストラクタ
     * トランプの模様を定める
     * @param mark　模様
     */
    private Mark(String mark){
        this.mark = mark;
    }

    @Override
    public String toString(){
        return this.mark;
    }
}
