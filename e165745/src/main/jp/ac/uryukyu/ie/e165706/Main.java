package jp.ac.uryukyu.ie.e165706;

public class Main {

    public static void main(String[] args) throws Exception {

        Maze maze = new Maze();
        Player player = new Player(maze.getStartPlace(), maze.getMapSize(), maze.getmap());

        System.out.println("きゅあっぷらぱぱ！");
        System.out.println(maze.getmap().get(3).substring(0,1));
        System.out.println(player.getPlayer_x());

    }

}

