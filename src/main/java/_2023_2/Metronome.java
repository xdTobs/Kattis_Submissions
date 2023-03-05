package _2023_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Metronome {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        float input = (float)Integer.parseInt(in.readLine());
        System.out.println(input/4);

    }
}
