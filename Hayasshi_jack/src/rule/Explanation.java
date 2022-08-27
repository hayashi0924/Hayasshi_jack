package rule;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * ルールメソッドを定めるクラス
 * フィールドは存在しない
 */
public class Explanation {
    public static void main() {
            /**
             * ファイルの読み込み先：初期値＝null
             */
            FileReader fr = null;

            /**
             * BufferedReaderの代入先：初期値＝null
             */
            String line = null;
            try {
                fr = new FileReader("rule.txt");
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    System.out.println(line);
                }
                br.close();
            } catch (FileNotFoundException e) {
                System.out.println("ファイルがありません");
            } catch (IOException e) {
                System.out.println("出力処理が何らかの原因で失敗しました");
            } finally {
                if (fr != null) {
                    try {
                        fr.close();
                    } catch (IOException e) {
                        ;
                }
            }
        }
    }
}
