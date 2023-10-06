package _2023_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Reverse {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        StringBuilder reverse = new StringBuilder();
        for (int i = word.length()-1; i >=0; i--) {
            reverse.append(word.charAt(i));
        }
        System.out.println(reverse);
    }
}
