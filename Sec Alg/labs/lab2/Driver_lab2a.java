/**
 * file: Driver_lab2a.java
 * author: Michael Durso
 * course: MSCS 630
 * assignment: lab 2
 * due date: January 30th, 2022
 * version: 1.0
 *
 * This file contains the code for lab2a.
 */
public class Driver_lab2a {
    public static void main(String[] args) {
    }

    /**
     * euclidAlg
     *
     * This function calculates the greatest common divisor of a and b
     * where a,b > 0 and a > b
     *
     * Parameters:
     *   a: first long
     *   b: second long
     *
     * Return value: the greatest common divisor
     */
    public static long euclidAlg(long a, long b) {
      if (b == 0) return a;
      else return euclidAlg(b, a % b);
    }
}