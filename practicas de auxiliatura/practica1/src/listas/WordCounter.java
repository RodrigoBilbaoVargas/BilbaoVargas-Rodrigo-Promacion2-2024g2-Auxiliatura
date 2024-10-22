package listas;

import java.util.Arrays;
import java.util.List;

public class WordCounter {

    public static int countWordsStartingWith(List<String> words, char letter) {
        int count = 0;
        for (String word : words) {
            if (word.toLowerCase().charAt(0) == Character.toLowerCase(letter)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("Apple", "orange", "Aironman", "purple", "Astrounat");
        char targetLetter = 'a';

        int count = countWordsStartingWith(wordList, targetLetter);
        System.out.println("Number of words starting with '" + targetLetter + "': " + count);
    }
}