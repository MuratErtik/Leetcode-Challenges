package org.example;
/*
Longest word
- Using the Java language, have the function LongestWord (sen) take the sen parameter being passed and return the largest word in the
string.
- It there are two or more words that are the same length,
return the
first word from the string with that length.
- Ignore punctuation and assume sen will not be empty.
*/
public class LongestWordInString {
    public static String findLongestWord(String input) {

        String[] words = input.split(" ");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;

            }


        }
        return longestWord;

    }
}
