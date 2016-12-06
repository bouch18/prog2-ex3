package jp.ac.uryukyu.ie.e165706;

public class Main {

    public static void main(String[] args) throws Exception {

        Maze maze = new Maze();
        Player player = new Player(maze.getStartPlace(), maze.getMapSize(), maze.getmap());

    }

}

