package jp.ac.uryukyu.ie.e165706;

import java.io.File; // ファイルやディレクトリの抽象表現
import java.io.FileNotFoundException; // 例外
import java.util.ArrayList; // Listの実装
import java.util.List; // いわゆる「リスト構造」のインターフェース（実装のないクラス。教科書19章）
import java.util.Scanner; // 標準入力読み込みの際に利用したクラス


public class Maze {

    public void maze() {
        System.out.println("ファイル名を入力してください: ");
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

    /* ファイルのパスは、プロジェクトのトップディレクトリを基準とした相対パスで記述。
    .javaファイルを置いてるディレクトリ基準ではないことに注意。 */
        String filename = "./src/main/jp/ac/uryukyu/ie/e165706/" + str;
        List<String> strings = new ArrayList<>(); // ファイルから読み込んだ文字列を保存するためのリスト。
        Scanner scanner;


        //map.txtの初期位置にプレイヤーインスタンスを生成。
        String first_place = strings.get(1);
        List<Integer> luke = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            int k = Integer.parseInt(first_place);
            luke.add(k);
        }

    }
}