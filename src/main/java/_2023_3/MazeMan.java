package _2023_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class MazeMan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] rowcol = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        char[][] map = new char[rowcol[0]][rowcol[1]];
        for (int i = 0; i < rowcol[0]; i++) {
            char[]tmpRow = br.readLine().toCharArray();
            map[i]=tmpRow;
        }
        ArrayList<Point> entries = new ArrayList<>();
        int totalDots = 0;
        int reachableDots =0;
        HashMap<Point,Boolean> visitedDots = new HashMap<>();
        for (int i = 0; i < rowcol[0]; i++) {
            for (int j = 0; j < rowcol[1]; j++) {
                if (map[i][j]>='A'&&map[i][j]<='W')
                    entries.add(new Point(i,j));
                if(map[i][j]=='.'){
                    totalDots++;
                    if(DFStoEntry(new Point(i,j),visitedDots,map,rowcol[0],rowcol[1]))
                        reachableDots++;

                }

            }
        }
        while(reachableDots>0){

        }


    }

    private static boolean DFStoEntry(Point point, HashMap<Point, Boolean> visitedDots,char[][] map,int rows,int cols) {
        boolean[][] visited = new boolean[rows][cols];
        if(visitedDots.containsKey(point))
            return visitedDots.get(point);
        Stack<Point> dfsStack = new Stack<>();
        dfsStack.add(point);
        while (!dfsStack.isEmpty()){
            Point curr = dfsStack.pop();
            if(map[curr.x][curr.y]>='A'&&map[curr.x][curr.y]<='W')
                return true;
            if(visited[curr.x][curr.y]){
                continue;
            }
            visited[curr.x][curr.y] = true;
            if(!visited[curr.x+1][curr.y]&&map[curr.x+1][curr.y]!='X')
                dfsStack.add(new Point(curr.x+1, curr.y));
            if(!visited[curr.x-1][curr.y]&&map[curr.x-1][curr.y]!='X')
                dfsStack.add(new Point(curr.x-1, curr.y));
            if(!visited[curr.x][curr.y+1]&&map[curr.x][curr.y+1]!='X')
                dfsStack.add(new Point(curr.x, curr.y+1));
            if(!visited[curr.x][curr.y-1]&&map[curr.x][curr.y-1]!='X')
                dfsStack.add(new Point(curr.x, curr.y-1));
        }
        return false;
    }

}
class Point{
    public int x;
    public int y;
    public Point(int x,int y){
        this.x=x;
        this.y=y;
    }

}
