package src;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        System.out.println( getSmallestAndLargest("welcometojava",3));
    }

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        ArrayList<String> subStrings = new ArrayList<>();

        for(int i = 0; i <= s.length()-k; i++){
           String currentString = s.substring(i,k+i);
           subStrings.add(currentString);
        }

        List<String> orderedSubstrings = subStrings.stream().sorted().collect(Collectors.toList());
        smallest = orderedSubstrings.get(0);
        largest = orderedSubstrings.get(orderedSubstrings.size()-1);
        return smallest + "\n" + largest;
    }
}