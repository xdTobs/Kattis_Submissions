package _2023_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzzHiring {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String length = in.readLine();
        int len = Integer.parseInt(length.split(" ")[1]);
        int x = 3;
        int y = 5;
        String[] eV = new String[len];
        String output ="";
        for (int i = 1; i < len + 1; i++) {
            if (i % y == 0 && i % x == 0) output = "fizzbuzz";
            else if (i % y == 0) output = "buzz";
            else if (i % x == 0) output = "fizz";
            else {
                output = String.valueOf(i);
            }
            eV[i-1] = output;
        }

        List<Integer> candidateCorrect = new ArrayList<>();
        while(in.ready()){
            String input = in.readLine();
            String[] values = input.split(" ");
            int correctVals =0;
            for (int i = 0; i < values.length; i++) {
                if(values[i].equals(eV[i])) correctVals++;
            }
            candidateCorrect.add(correctVals);
        }
        int maxIndex =0;
        for (int i = 0; i < candidateCorrect.size(); i++) {
            if(candidateCorrect.get(i)> candidateCorrect.get(maxIndex))
                maxIndex = i;
        }
        System.out.println(maxIndex+1);

    }
}
