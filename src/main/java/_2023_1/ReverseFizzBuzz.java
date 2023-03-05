package _2023_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ReverseFizzBuzz {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String num = in.readLine();
        String input = in.readLine();
        String[] split = input.split(" ");
        int[] minmax = new int[]{Integer.parseInt(num.split(" ")[0]), Integer.parseInt(num.split(" ")[1])};
        List<Integer> fizz = new ArrayList<>();
        List<Integer> buzz = new ArrayList<>();

        for (int i = 0; i < minmax[1] - minmax[0] + 1; i++) {
                if(split[i].equals("FizzBuzz")){
                    fizz.add(i + minmax[0]);
                    buzz.add(i + minmax[0]);
                }
                else if(split[i].equals("Fizz"))
                    fizz.add(i + minmax[0]);
                else if(split[i].equals("Buzz"))
                    buzz.add(i + minmax[0]);

        }

        int fizzFactor =110000;
        int buzzFactor =110000;
        while (true) {
            fizzFactor--;
            boolean validfizz = true;
            for(int i : fizz){
                if (!(i % fizzFactor == 0)) {
                    validfizz = false;
                    break;
                }
            }
            if(validfizz) break;
            else if(fizzFactor<0)break;
        }
        while (true) {
            buzzFactor--;
            boolean validbuzz = true;
            for(int i : buzz){
                if (!(i % buzzFactor == 0)) {
                    validbuzz = false;
                    break;
                }
            }
            if(validbuzz) break;
            else if(buzzFactor<0)break;
        }
        System.out.println(fizzFactor + " " + buzzFactor);
    }
}
