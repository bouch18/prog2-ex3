package jp.ac.uryukyu.ie.e165706;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by e165706 on 2016/11/22.
 *///
public class ExMain {

    public static void main(String[] args) {
        String filename = "./src/main/jp/ac/uryukyu/ie/e165706/map.txt";
        List<String> strings = new ArrayList<>();
        Scanner scanner;

        /* 想定している例外が起きる箇所では、予め例外に対応した処理を記述する。
            try{ 例外が起きる箇所 }
            catch(想定してる例外){例外処理}
            finally{例外の有無にかかわらず、最終的に実行させたい処理}
         */
       /* try {
            scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                strings.add(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(1); //終了ステータス。ここでは取り敢えず0(=正常)以外にした。
        }

        //String first_place = strings.get(1);
        //System.out.println(first_place);
        //map.txtを読み込んだ迷路インスタンスを生成。
        String filename = "./src/main/jp/ac/uryukyu/ie/e165706/map.txt";
        List<String> strings = new ArrayList<>();
        Scanner scanner;

        try {
            scanner = new Scanner(new File(filename));
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                strings.add(line);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
            System.exit(1);
        }
        //map.txtの初期位置にプレイヤーインスタンスを生成。
        String first_place = String.get();
        List<int> luke = new ArrayList<>();
        for(int i=0; i<2; i++){
            int k = Integer.parseInt(first_place(i));
            luke.add(k);
        }
        //ply_first_place();
        //迷路＋プレイヤー現在位置を表示。
        System.out.printf(luke);
        //プレイヤーインスタンスを左に移動。

        //迷路＋プレイヤー現在位置を表示。
        //プレイヤーインスタンスを下に移動。
        //迷路＋プレイヤー現在位置を表示。
        //プレイヤーインスタンスを右に移動しようとしてその場に留まる。（壁で移動できない）
        //迷路＋プレイヤー現在位置を表示。（前回と同じ場所であることを目視確認）
    */
    }

}
