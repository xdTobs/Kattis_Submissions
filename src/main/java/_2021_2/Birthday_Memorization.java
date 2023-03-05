package _2021_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Birthday_Memorization {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int useless = Integer.parseInt(in.readLine());
        HashMap<String, List<String>> birthdays = new HashMap<>();
        while (in.ready()) {
            String input = in.readLine();
            String[] split = input.split(" ");
            List<String> combined = List.of(new String[]{split[1], split[0]});
            if (!birthdays.containsKey(split[2])) {
                birthdays.put(split[0], combined);
                continue;
            }
            if (Integer.parseInt(birthdays.get(split[0]).get(0)) > Integer.parseInt(combined.get(0))) {
                birthdays.put(split[0], combined);
            }
        }
        List<String> output = new ArrayList<>();
        System.out.println(birthdays.size());
        for (Map.Entry<String, List<String>> set :
                birthdays.entrySet()) {
            output.add(set.getValue().get(1));
        }
        Collections.sort(output);
        for (String s : output) System.out.println(s);
    }
}
