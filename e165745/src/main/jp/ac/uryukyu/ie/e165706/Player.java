package jp.ac.uryukyu.ie.e165745;

/*
 * Created by e165745 on 2016/12/04.いえーい、ピースピース
 *
 */
import java.util.List;


class Player {

    private int player_x;      //プレイヤーのx座標の値
    private int player_y;      //プレイヤーのy座標の値
    private int map_x;    //mapの最大値のx座標
    private int map_y;    //mapの最大値のy座標
    private List<String> take;   //Mazeで作ったマップをこの変数に入れる
    private int walk_count = 0;

    Player(String like, String h, List<String> rise){  //ここでは、上のフィールド変数に適切な値を代入する。

        this.take = rise;
        String[] p = like.split("\\s+",0);
        for(int i = 0; i<2; i++){
            if (i == 0){
                String q = p[i];
                this.player_x = Integer.parseInt(q);
            }
            if (i ==1){
                String w = p[i];
                this.player_y = Integer.parseInt(w);
            }
        }

        String[] me = h.split("\\s+",0);
        for (int j = 0; j<2; j++){
            if (j == 0){
                String e  =me[j];
                this.map_x = Integer.parseInt(e);
            }
            if(j == 1){
                String qu = me[j];
                this.map_y = Integer.parseInt(qu);
            }
        }

    }
    void under_go() { //引数にはプレイヤーの現在地をとり、
        String loid = take.get(player_y + 1);
        String roal = loid.substring(player_x + 1, player_x + 2);
        while (!("#".equals(roal))){
            this.player_y += 1;
            this.walk_count += 1;
            loid = take.get(player_y + 1);
            roal = loid.substring(player_x + 1, player_x + 2);
        }
    }
    void right_go() {
        String loid = take.get(player_y);
        String roal = loid.substring(player_x +2 , player_x +3);
        while (!("#".equals(roal))){
            this.player_x += 1;
            this.walk_count += 1;
            roal = loid.substring(player_x +2, player_x +3);
        }
    }
    void left_go() {
        String loid = take.get(player_y );
        String roal = loid.substring(player_x , player_x +1);
        while (!("#".equals(roal))){
            this.player_x -= 1;
            this.walk_count += 1;
            roal = loid.substring(player_x , player_x +1);
        }
    }
    void up_go() {
        String loid = take.get(player_y - 1);
        String roal = loid.substring(player_x +1 , player_x + 2);
        while (!("#".equals(roal))){
            this.player_y -= 1;
            this.walk_count += 1;
            loid = take.get(player_y -1 );
            roal = loid.substring(player_x +1, player_x + 2);
        }
    }

    Boolean player_point() {
        String loid = take.get(player_y);
        String far = loid.substring(player_x + 1, player_x + 2);
        return "G".equals(far);
        /*if("G".equals(far)) {
            return true;
        } else {
            return false;
        }*/
    }
    Boolean judge_leftside (){
        String loid = take.get(player_y);
        String far =loid.substring(player_x + 2, player_x + 3);
        return "#".equals(far);
    }
    Boolean judge_undertside (){
        String loid = take.get(player_y +1);
        String far =loid.substring(player_x + 1, player_x + 2);
        return "#".equals(far);
    }
    Boolean judge_rightside (){
        String loid = take.get(player_y);
        String far =loid.substring(player_x , player_x + 1);
        return "#".equals(far);
    }
    Boolean judge_upside (){
        String loid = take.get(player_y -1);
        String far =loid.substring(player_x + 1, player_x + 2);
        return "#".equals(far);
    }

    int getPlayer_x(){
        return player_x;
    }
    int getPlayer_y() { return player_y; }
    int getMap_x() {return map_x;}
    int getMap_y() {return map_y;}
    int getWalk_count() { return walk_count;}



}