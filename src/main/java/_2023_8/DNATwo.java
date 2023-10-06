package _2023_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DNATwo {
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

        OPT(s.length()-1,arr,true);
        System.out.println(cache[1][n-1]-1);
    }

    static int OPT(int max, boolean[] arr, boolean goal){
        if(cache[goal ? 1 : 0][max] != 0) return cache[goal ? 1 : 0][max];

        if(max==0){
            cache[goal ? 1 : 0][max] = arr[0] == goal ? 1 : 2;
            return cache[goal ? 1 : 0][max];
        }

        if(arr[max] == goal){
            cache[goal ? 1 : 0][max] = OPT(max-1,arr,goal);
        }
        else{

            cache[goal ? 1 : 0][max] =Math.min(
                    OPT(max-1,arr,goal)+1,
                    OPT(max-1,arr,!goal)+1
            ) ;

        }
        return cache[goal ? 1 : 0][max];
    }

}
