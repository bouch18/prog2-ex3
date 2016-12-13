package jp.ac.uryukyu.ie.e165706;

public class Main {

    public static void main(String[] args) throws Exception {
        Maze maze = new Maze();
        Player player = new Player(maze.getStartPlace(), maze.getMapSize(), maze.getmap());
        System.out.println(maze.getmap().get(3).substring(0, 1));
        System.out.println("プレイヤーの初期位置: " + player.getPlayer_x() + "," + player.getPlayer_y());
        for (int i=0; i<=0; i++){
            while (Player.player_point() == true) {
            if ( =="#"){//left is fall.
                if ( =="#"){//under is fall
                    Player.right_go();
                }
                if (=="#"){//right is fall
                    Player.up_go();
                }
                Player.under_go();
            }
            else{//ahter than that
            player.left_go();
        }
    }
}