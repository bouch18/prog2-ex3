package jp.ac.uryukyu.ie.e165706;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Mize {

    public static void mize(String[] args) {
        String filename = "./src/main/jp/ac/uryukyu/ie/e165706/map.txt";
        List<String> strings = new ArrayList<>();
        Scanner scanner;

        /* 想定している例外が起きる箇所では、予め例外に対応した処理を記述する。
            try{ 例外が起きる箇所 }
            catch(想定してる例外){例外処理}
            finally{例外の有無にかかわらず、最終的に実行させたい処理}
         */
        try {
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

        // リストをそのまま出力してみる
        System.out.println("リストをそのまま出力してみる");
        System.out.println(strings);

        // 要素毎に出力してみる
        System.out.println("\n\n要素毎に出力してみる");
        for(String str: strings){
            System.out.println(str);
        }

        // 行番号付けてみる
        System.out.println("\n\n行番号付けてみる");
        for(int i=0; i<strings.size(); i++) {
            System.out.printf("%d行目: %s\n", i, strings.get(i));
        }

    }


}