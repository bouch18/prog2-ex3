package jp.ac.uryukyu.ie.e165706;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by e165706 on 2016/11/22.
 */
public class ExMain {

    public static void main(String[] args) {

        player();
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
    }

}
