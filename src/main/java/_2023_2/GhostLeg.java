package _2023_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class GhostLeg {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] nums = IntStream.rangeClosed(1, arr[0]).toArray();
        while(in.ready()){
            int swapIndex = Integer.parseInt(in.readLine())-1;
            int temp = nums[swapIndex];
            nums[swapIndex] = nums[swapIndex+1];
            nums[swapIndex+1] = temp;
        }
        for(int i : nums){
            System.out.println(i);
        }
    }
}
