package _2023_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sum {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String problems = in.readLine();
        String[] split = problems.split(" ");
        System.out.println(Integer.parseInt(split[0]) + Integer.parseInt(split[1]));


    }
}
