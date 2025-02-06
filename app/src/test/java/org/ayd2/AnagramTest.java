package org.ayd2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AnagramTest {

    private Anagram anagram;

    @BeforeEach
    public void setUp() {
        anagram = new Anagram();
    }

    @Test
    void canCheckAnagram() {
        // given
        String word1 = "espada";
        String word2 = "pesada";

        // when
        boolean actual = anagram.checkAnagram(word1, word2);

        // then
        assertEquals(actual, true, "Las palabras son anagramas");
    }

    @Test
    void canCheckNonAnagramWords() {
        // given
        String word1 = "hola";
        String word2 = "cola";

        // when
        boolean actual = anagram.checkAnagram(word1, word2);

        // then
        assertEquals(actual, false, "Las palabras no son anagramas");
    }
}
