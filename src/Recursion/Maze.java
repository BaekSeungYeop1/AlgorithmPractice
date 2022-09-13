package Recursion;

import java.util.Arrays;

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
    private static final int WALL_COLOR = 1; // 벽
    private static final int BLOCKED_COLOR = 2; // visited 출구까지의 경로상에 있지 않음이 밝혀진 cell
    private static final int PATH_COLOR = 3; // 미로 경로


    public static void main(String args[]){

        findPath(0,0);
        printMaze(maze);


    }

    private static void printMaze(int[][] maze) {

        for (int i = 0;  i<N; i++){

            for (int j=0; j<N; j++){
                System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }

    private static boolean findPath(int x, int y){
        if (x<0 || y<0 || x>=N || y>=N){
            return false;
        }
        else if (maze[x][y] != PATHWAY_COLOR){
            return false;
        }
        else if (x==N-1 && y==N-1){
            maze[x][y] = PATH_COLOR;
            return true;
        }
        else {
            maze[x][y] = PATH_COLOR;
            if (findPath(x-1,y) || findPath(x,y+1) || findPath(x+1,y) || findPath(x,y-1)){
                return true;
            }
            maze[x][y] = BLOCKED_COLOR;
            return false;
        }
    }

}
