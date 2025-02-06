package org.ayd2;

import java.util.List;

public class Anagram {

    public boolean checkAnagram(String word1, String word2) {
        List<Character> letters1 = word1.chars()
                .sorted()
                .mapToObj(c -> (char) c)
                .toList();

        List<Character> letters2 = word2.chars()
                .sorted()
                .mapToObj(c -> (char) c)
                .toList();

        return letters1.equals(letters2);
    }

    public static void main(String[] args) {
    }
}
