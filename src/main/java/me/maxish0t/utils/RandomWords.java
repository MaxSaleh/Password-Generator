package me.maxish0t.utils;

import java.util.Random;

public class RandomWords
{

    /**
     * Generates a random letter word.
     */
    public static String generateRandomWord(int wordLength)
    {
        Random r = new Random(); // Intialize a Random Number Generator with SysTime as the seed
        StringBuilder sb = new StringBuilder(wordLength);
        for(int i = 0; i < wordLength; i++) // For each letter in the word
        {
            char tmp = (char) ('a' + r.nextInt('z' - 'a')); // Generate a letter between a and z
            sb.append(tmp); // Add it to the String
        }
        return sb.toString();
    }

    /**
     * Generates random letters and numbers.
     */
    public static String generateRandomWordNumbers(int wordLength)
    {
        Random r = new Random(); // Intialize a Random Number Generator with SysTime as the seed
        StringBuilder sb = new StringBuilder(wordLength);
        for(int i = 0; i < wordLength; i++) // For each letter in the word
        {
            char tmp = (char) ('a' + r.nextInt('z' - 'a')); // Generate a letter between a and z
            char tmp2 = (char) ('1' + r.nextInt('9' - '1')); // Generate a number between 1 and 9
            sb.append(tmp); // Add it to the String
            sb.append(tmp2);
        }
        return sb.toString();
    }

}
