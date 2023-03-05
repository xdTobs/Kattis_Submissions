package _2021_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Ninety_Nine {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int num = 1;
        System.out.println(num);
        Thread.sleep(20);
        while (num < 99) {
            num = Integer.parseInt(in.readLine());
            if (num % 3 == 1) num += 2;
            else if (num % 3 == 2) num += 1;
            else {
                num += (Math.random() <= 0.5) ? 1 : 2;
            }
            System.out.println(num);
            Thread.sleep(20);
        }

    }
}
