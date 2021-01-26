package algorithm;

import java.util.ArrayList;
import java.util.HashMap;

public class CheckPalindrome {

    public static boolean checkPalindrome(String s){

        HashMap<Character, Integer> map = new HashMap<> ();
        for (int i = 0; i < s.length(); i++) {

            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        int count = 0;
        for (char key: map.keySet()) {
            count += map.get(key) % 2;
        }

        return count <= 1;
    }
     public static void main(String[] args) {
        System.out.print("Hello World!");

    }
}