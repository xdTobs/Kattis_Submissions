package _2023_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Knights {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        int[][] knights = new int[n+1][2];
        for (int i = 0; i < n; i++) {
            int[] knight = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            knights[i] = knight;
        }
        int fightingKnight = 0;
        for (int i = 1; i < n; i++) {
            while(knights[fightingKnight][0]>0&&knights[i][0]>0){
                knights[i][0]-=knights[fightingKnight][1];
                if(knights[i][0]<=0)break;
                knights[fightingKnight][0]-=knights[i][1];
            }
            if(knights[i][0]>0){
                fightingKnight = i;
            }
        }
        System.out.println(fightingKnight+1);

    }
}
