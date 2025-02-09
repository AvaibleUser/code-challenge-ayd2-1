package org.ayd2;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public boolean checkAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        Map<Integer, Integer> counter = new HashMap<>();

        word1.chars().forEach(c -> counter.merge(c, 1, Integer::sum));
        word2.chars().forEach(c -> counter.merge(c, -1, Integer::sum));

        return counter.values().stream().allMatch(v -> v == 0);
    }

    public static void main(String[] args) {
        System.out.println("");
    }
}
