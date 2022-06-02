/**
 * file:  Driver_lab1.java
 * author:  Michael Durso
 * course:  MSCS 630
 * assignment:  Lab 1
 * due date:  January 23, 2022
 * verison:  1.0
 *
 * This file contains the source code for lab1.
 */

import java.util.Arrays;
import java.util.Scanner;

/**
 * Driver_lab1
 * This class implements a program which converts text into integers.
 */
public class Driver_lab1 {

    /**
     * str2int
     *
     * This function takes a text and converts each character
     * into an encoded number from 0 - 25 and sets
     * the whitespace to 26.
     *
     * Parameters
     *   plainText: the string from the next line of the input file
     *
     * Return value: an array of integers.
     */
    public static int[] str2int(String plainText) {

        char letter;
        int num;
        int len = plainText.length();
        int[] numArray = new int[len];

        for (int i = 0; i < len; i++) {
            letter = plainText.charAt(i);
            if (Character.isWhitespace(letter)) {
                num = 26;
            } else {
                letter = Character.toLowerCase(letter);
                num = letter - 97;
            }
            numArray[i] = num;
        }
        return numArray;
    }

    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            String line;
            int [] encodedArray;
            while (input.hasNext()) {
                line = input.nextLine();
                encodedArray = str2int(line);
                System.out.println(Arrays.toString(encodedArray).replaceAll("[\\[|\\]|\\,]", ""));
            }
        } catch (Exception e) {
            System.out.println("failed the unit test");
            e.printStackTrace();
        }
    }
}