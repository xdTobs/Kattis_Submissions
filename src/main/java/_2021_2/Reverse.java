package _2021_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String[]nums = new String[Integer.parseInt(in.readLine())];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = in.readLine();
        }
        for (int i = nums.length-1; i >=0 ; i--) {
            System.out.println(nums[i]);
        }
    }

}
