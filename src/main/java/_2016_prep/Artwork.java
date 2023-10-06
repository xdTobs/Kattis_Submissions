package _2016_prep;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Artwork {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[] nmq = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        List<List<Integer>> strokes = new ArrayList<>();
        while(in.ready()){
            List<Integer>stroke = Arrays.stream(in.readLine().split(" ")).map(Integer::parseInt).toList();
            stroke = stroke.stream().map(i -> i-1).toList();
            strokes.add(stroke);
        }
        boolean[][] map = new boolean[nmq[0]][nmq[1]];
        for(boolean[]line : map)
            Arrays.fill(line, false);

        for(List<Integer>stroke : strokes){
            addStroke(stroke,map);
            count(copyMap(map));
        }



    }

    private static void addStroke(List<Integer> stroke, boolean[][] map) {
        if (stroke.get(0).equals(stroke.get(2))) {
            if(stroke.get(1)<stroke.get(3)){
                for (int i = stroke.get(1); i <= stroke.get(3); i++) {
                    map[stroke.get(0)][i] = true;
                }
            }
            else{
                for (int i = stroke.get(3); i <= stroke.get(1); i++) {
                    map[stroke.get(0)][i] = true;
                }
            }
        }else{
            if(stroke.get(0)<stroke.get(2)){
                for (int i = stroke.get(0); i <= stroke.get(2); i++) {
                    map[i][stroke.get(1)] = true;
                }
            }
            else {
                for (int i = stroke.get(2); i <= stroke.get(0); i++) {
                    map[i][stroke.get(1)] = true;
                }
            }
        }
    }

    static boolean[][] copyMap(boolean[][] map){
        boolean[][] newMap = new boolean[map.length][map[0].length];
        for (int i = 0; i < map.length; i++) {
            newMap[i] = Arrays.copyOf(map[i],map[i].length);
        }
        return newMap;
    }

    static void count(boolean[][]map){
        int count = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[0].length; j++) {
                if(dfs(i,j,map))count++;
            }
        }
        System.out.println(count);
    }

    static boolean dfs(int i,int j,boolean[][]map ){
        if(map[i][j])return false;

        map[i][j] = true;

        if(i>0) dfs(i-1,j,map);
        if(i<map.length-1) dfs(i+1,j,map);
        if(j>0) dfs(i,j-1,map);
        if(j<map[0].length-1) dfs(i,j+1,map);
        return true;
    }
}
