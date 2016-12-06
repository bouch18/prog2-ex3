package jp.ac.uryukyu.ie.e165706;

public class Main {

    public static void main(String[] args) throws Exception {
        Maze maze = new Maze();
        Player player = new Player(maze.getStartPlace(), maze.getMapSize(), maze.getmap());
        System.out.println(maze.getmap().get(3).substring(0, 1));
        System.out.println("プレイヤーの初期位置: " + player.getPlayer_x() + "," + player.getPlayer_y());
        while ( !=G)
        if ( =="#"){//left is fall
            if ( =="#"){//under is fall
                player.right_go();
                if (=="#"){//right is fall
                    player.up_go();
                    player.under_go();
                }
            else{//ahter than that
                    player.left_go();
                }
            }
        }
    }
}