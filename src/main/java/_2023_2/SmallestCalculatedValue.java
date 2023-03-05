package _2023_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.stream.IntStream;

public class SmallestCalculatedValue {
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        arr = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int min = Integer.MAX_VALUE;
        min = Math.min(min, add(0, 0));
        min = Math.min(min, subtract(0, 0));
        min = Math.min(min, divide(0, 0));
        min = Math.min(min, multiply(0, 0));
        System.out.println(min);

    }

    public static int add(int number, int curr) {
        if (number == 2)
            return curr;
        int min = Integer.MAX_VALUE;
        int next = curr + arr[number + 1]>=0 ? curr + arr[number + 1] : Integer.MAX_VALUE;
        min = Math.min(min, add(number + 1, next));
        min = Math.min(min, subtract(number + 1, next));
        min = Math.min(min, divide(number + 1, next));
        min = Math.min(min, multiply(number + 1, next));
        return min;
    }

    public static int subtract(int number, int curr) {
        if (number == 2)
            return curr;
        int min = Integer.MAX_VALUE;
        int next = curr - arr[number + 1]>=0 ? curr - arr[number + 1] : Integer.MAX_VALUE;
        min = Math.min(min, add(number + 1, next));
        min = Math.min(min, subtract(number + 1, next));
        min = Math.min(min, divide(number + 1, next));
        min = Math.min(min, multiply(number + 1, next));
        return min;
    }

    public static int divide(int number, int curr) {
        if (number == 2 || curr == Integer.MAX_VALUE)
            return curr;
        int min = Integer.MAX_VALUE;
        int next = curr % arr[number + 1]!=0||(curr / arr[number + 1]>0) ? curr / arr[number + 1] : Integer.MAX_VALUE ;
        min = Math.min(min, add(number + 1, next));
        min = Math.min(min, subtract(number + 1, next));
        min = Math.min(min, divide(number + 1, next));
        min = Math.min(min, multiply(number + 1, next));
        return min;
    }

    public static int multiply(int number, int curr) {
        if (number == 2)
            return curr;
        int min = Integer.MAX_VALUE;
        int next = curr * arr[number + 1]>0 ? curr * arr[number + 1] : Integer.MAX_VALUE;
        min = Math.min(min, add(number + 1, next));
        min = Math.min(min, subtract(number + 1, next));
        min = Math.min(min, divide(number + 1, next));
        min = Math.min(min, multiply(number + 1, next));
        return min;
    }

}
