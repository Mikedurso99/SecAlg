/**
 * file: Driver_lab2a.java
 * author: Michael Durso
 * course: MSCS 630
 * assignment: lab 3
 * due date: February 6th, 2022
 * version: 1.0
 *
 * This file contains the getHexMatP method for lab3b.
 */
public class Driver_lab3b {
  public static void main(String[] args) {
  }

  /**
   * getHexMatP
   *
   *
   * Parameters:
   *   s: the substitution character used to fill extra spaces when
   *      p.size > 16
   *   p: the string to be converted into the hex matrix, size <= 16.
   *
   * Return value: a 4x4 matrix containing the ASCII values of p in hex.
   */
   public static int[][] getHexMatP(char s, String p ) {
     int[][] output = new int[4][4];
     int arrayCounter = 0;
     int padChar = s;
     for (int j = 0; j < output[0].length; j++) {
       for (int i = 0; i < output.length; i++) {
         if (arrayCounter > p.length()) {
           output[i][j] = padChar;
         }
         else {
           output[i][j] = p.charAt(arrayCounter);
           arrayCounter++;
         }
       }
     }
     return output;
   }
}