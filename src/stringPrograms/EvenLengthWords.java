package stringPrograms;

import java.util.Arrays;

public class EvenLengthWords {
    public static void main(String[] args) {
        String str = "She sells seashells by the seashore";

        // Splitting the string into an array of words
        String[] words = str.split(" ");

        System.out.println(Arrays.toString(words));

        // Iterating through the words and printing even length words
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (word.length() % 2 == 0) {
                System.out.println(word);
            }
        }
    }
}
