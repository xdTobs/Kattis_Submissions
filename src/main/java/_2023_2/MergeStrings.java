package _2023_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MergeStrings {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String name1 = in.readLine();
        int count1 =0;
        String name2 = in.readLine();
        int count2 = 0;
        StringBuilder res = new StringBuilder();
        while(count1<name1.length()&&count2<name2.length()){
            if(name1.charAt(count1)<name2.charAt(count2)){
                res.append(name1.charAt(count1));
                count1++;
            }
            else {
                res.append(name2.charAt(count2));
                count2++;
            }
        }
        while(count1<name1.length()){
            res.append(name1.charAt(count1));
            count1++;
        }
        while(count2<name2.length()){
            res.append(name2.charAt(count2 ));
            count2++;
        }
        System.out.println(res.toString());
    }
}
