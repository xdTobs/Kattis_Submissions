package _2023_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Grants {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.valueOf(br.readLine());
        String s = br.readLine();
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                max = Math.max(max,maxGrants(i,j,s));
            }
        }
        System.out.println(max);
    }
    public static int maxGrants(int i, int j, String s){
        int[] charCount = new int[26];
        for (int k = i; k <= j; k++) {
            charCount[s.charAt(k)-'a']++;
        }
        int selected = 0;
        int count = 0;
        for (int k = 0; k < charCount.length; k++) {
            if(charCount[k]==0) continue;
            if(selected == 0){
                selected = charCount[k];
                count++;
            }
            else if(charCount[k]!=selected){
                return 0;
            }
            else{
                count++;
            }
        }
        return selected*count;
    }
}
