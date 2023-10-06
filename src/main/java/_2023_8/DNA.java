package _2023_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DNA {
    static int[][] cache;
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        String s = br.readLine();
        boolean[] arr = new boolean[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = s.charAt(i) == 'A';
        }
        cache = new int[2][n];
        cache[0] = new int[n];
        cache[1] = new int[n];

        System.out.println(OPT(s.length()-1,arr,true));
    }

    static int OPT(int max, boolean[] arr, boolean goal){
        if(max==0)return arr[0] == goal ? 0 : 1;

        if(arr[max] == goal) return OPT(max-1,arr,goal);

        else{
            return Math.min(
                    OPT(max-1,arr,goal)+1,
                    OPT(max-1,arr,!goal)+1
            );
        }
    }

}
