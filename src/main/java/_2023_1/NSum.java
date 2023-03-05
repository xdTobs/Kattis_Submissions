package _2023_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NSum {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String useless = in.readLine();
        String problems = in.readLine();
        String[] split = problems.split(" ");
        int sum =0;
        for (String s : split) sum+= Integer.parseInt(s);
        System.out.println(sum);


    }
}
