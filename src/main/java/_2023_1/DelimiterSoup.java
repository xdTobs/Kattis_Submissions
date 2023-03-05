package _2023_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class DelimiterSoup {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String useless = in.readLine();
        String s = in.readLine();
        String oldS = s;
        HashMap<Character, Character> openClose = new HashMap<>();
        openClose.put(')', '(');
        openClose.put(']', '[');
        openClose.put('}', '{');
        Stack<Character> parenthesis = new Stack<>();
        int i = 0;
        boolean valid = true;
        while (i < s.length()) {

            char c = s.charAt(i);
            if(c==' '){
                i++;
                continue;
            }
            if (parenthesis.isEmpty()) {
                if (!openClose.containsValue(c)) {
                    valid = false;
                    break;
                }
                parenthesis.push(c);
                i++;
                continue;
            }
            if (openClose.containsValue(c)) parenthesis.push(c);
            else {
                if (openClose.get(c) == parenthesis.peek()) parenthesis.pop();
                else {
                    valid = false;
                    break;
                }
            }
            i++;
        }
        if (valid) System.out.println("ok so far");
        else System.out.println(s.charAt(i) + " " + (i));

    }
}
