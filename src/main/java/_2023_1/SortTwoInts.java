package _2023_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SortTwoInts {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String problems = in.readLine();
        String[] split = problems.split(" ");
        int[] intsplit = new int[]{Integer.parseInt(split[0]), Integer.parseInt(split[1])};
        Arrays.sort(intsplit);
        System.out.println(intsplit[0] +" "+intsplit[1]);
    }
}
