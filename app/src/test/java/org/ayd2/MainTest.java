package org.ayd2;

import static org.assertj.core.api.BDDAssertions.then;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Nested
    @DisplayName("Pruebas del metodo que comprueba si dos palabras son anagramas")
    class CheckAnagram {

        private Main anagram;

        @BeforeEach
        public void setUp() {
            anagram = new Main();
        }

        @Test
        @DisplayName("Las palabras son anagramas")
        void withAnagramWords() {
            // given
            String word1 = "espada";
            String word2 = "pesada";

            // when
            boolean actual = anagram.checkAnagram(word1, word2);

            // then
            then(actual)
                    .as("<%s> y <%s> son anagramas", word1, word2)
                    .isTrue();
        }

        @Test
        @DisplayName("Las palabras no son anagramas")
        void withNonAnagramWords() {
            // given
            String word1 = "hola";
            String word2 = "cola";

            // when
            boolean actual = anagram.checkAnagram(word1, word2);

            // then
            then(actual)
                    .as("<%s> y <%s> no son anagramas", word1, word2)
                    .isFalse();
        }

        @Test
        @DisplayName("Las palabras estan vacias")
        void withEmptyWords() {
            // given
            String word1 = "";
            String word2 = "";

            // when
            boolean actual = anagram.checkAnagram(word1, word2);

            // then
            then(actual)
                    .as("<%s> y <%s> son anagramas", word1, word2)
                    .isTrue();
        }

        @Test
        @DisplayName("Una palabra esta vacia")
        void withOneEmptyWord() {
            // given
            String word1 = "anagrama";
            String word2 = "";

            // when
            boolean actual = anagram.checkAnagram(word1, word2);

            // then
            then(actual)
                    .as("<%s> y <%s> no son anagramas", word1, word2)
                    .isFalse();
        }

        @Test
        @DisplayName("Las palabras tienen diferente longitud")
        void withDifferentLengthWords() {
            // given
            String word1 = "hola";
            String word2 = "mundo";

            // when
            boolean actual = anagram.checkAnagram(word1, word2);

            // then
            then(actual)
                    .as("<%s> y <%s> no son anagramas", word1, word2)
                    .isFalse();
        }
    }
}
