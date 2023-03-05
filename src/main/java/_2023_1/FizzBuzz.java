package _2023_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FizzBuzz {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = in.readLine();
        String[]split = s.split(" ");

        int x = Integer.parseInt(split[0]);
        int y = Integer.parseInt(split[1]);
        int n = Integer.parseInt(split[2]);
        String output = "";
        for (int i = 1; i < n + 1; i++) {
            if (i % y == 0 && i % x == 0) output = "FizzBuzz";
            else if (i % y == 0) output = "Buzz";
            else if (i % x == 0) output = "Fizz";
            else {
                output = String.valueOf(i);
            }
            System.out.println(output);
        }

    }
}
