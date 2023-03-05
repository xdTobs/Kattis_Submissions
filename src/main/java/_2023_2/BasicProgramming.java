package _2023_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class BasicProgramming {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String input = in.readLine();
        int type = Integer.parseInt(input.split(" ")[1]);
        int[] arr = Arrays.stream(in.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        boolean caseFulfilled = false;
        switch(type){
            case(1):
                HashSet<Integer> duplicateSet = new HashSet<>();
                for (int i = 0; i <arr.length ; i++) {
                    if(duplicateSet.contains(-arr[i]+7777)){
                        System.out.println("Yes");
                        caseFulfilled = true;
                    }
                    duplicateSet.add(arr[i]);
                }
                if(!caseFulfilled)
                    System.out.println("No");
                break;
            case(2):
                HashSet<Integer> set = new HashSet<>();
                for (int i = 0; i < arr.length; i++) {
                    if(set.contains(arr[i]))
                        caseFulfilled = true;
                    set.add(arr[i]);
                }
                if(!caseFulfilled)
                    System.out.println("Unique");
                else
                    System.out.println("Contains duplicate");
                break;
            case(3):
                HashMap<Integer,Integer> map = new HashMap<>();
                for (int i = 0; i < arr.length; i++) {
                    map.put(arr[i],map.getOrDefault(arr[i],0)+1);
                }
                int maxKey= 0;
                int max = 0;
                for(int i : map.keySet()){
                    if(map.get(i)>max) {
                        maxKey = i;
                        max = map.get(i);
                    }
                }
                if(max>=(float)arr.length/2)
                    System.out.println(maxKey);
                else
                    System.out.println(-1);
                break;
            case(4):
                Arrays.sort(arr);
                if(arr.length%2==0)
                    System.out.println(arr[arr.length/2-1]+" "+arr[arr.length/2]);
                else
                    System.out.println(arr[arr.length/2]);
                break;
            case(5):
                Arrays.sort(arr);
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < arr.length; i++) {
                    if(arr[i]>=100 && arr[i]<=999){
                        sb.append(arr[i]).append(" ");
                    }

                }
                if(sb.length()>0)
                    sb.deleteCharAt(sb.length()-1);
                System.out.println(sb);
                break;
        }

    }
}
