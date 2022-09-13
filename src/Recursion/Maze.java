package Recursion;

public class Maze {
    private static int N = 8;
    private static int [][] maze = {
            {0, 0, 0, 0, 0, 0, 0, 1},
            {0, 1, 1, 0, 1, 1, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 1},
            {0, 1, 0, 0, 1, 1, 0, 0},
            {0, 1, 1, 1, 0, 0, 1, 1},
            {0, 1, 0, 0, 0, 1, 0, 1},
            {0, 0, 0, 1, 0, 0, 0, 1},
            {0, 1, 1, 1, 0, 1, 0, 0},
    };

    private static final int PATHWAY_COLOR = 0; // visited 아직 출구로 가는 경로가 될 가능성이 있는 cell
    private static final int WALL_COLOR = 1; // visited 출구까지의 경로상에 있지 않음이 밝혀진 셀
    private static final int BLOCKED_COLOR = 2;
    private static final int PATH_COLOR = 3;


    public static void main(String args[]){



    }

    private static boolean findPath(int x, int y){
        if ()
    }
}
