package _2021_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String problems = in.readLine();
        String[]split = problems.split(";");
        int counter = 0;
        for(String s : split){
            if(!s.contains("-")){
                counter++;
                continue;
            }
            String[] beginEnd = s.split("-");
            counter +=Integer.parseInt(beginEnd[1])-Integer.parseInt(beginEnd[0])+1;
        }
        System.out.println(counter);
    }

}
