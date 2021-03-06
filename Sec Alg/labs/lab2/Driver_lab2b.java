/**
 * file: Driver_lab2a.java
 * author: Michael Durso
 * course: MSCS 630
 * assignment: lab 2
 * due date: January 30th, 2022
 * version: 1.0
 *
 * This file contains the code for lab2b.
 */
public class Driver_lab2b {
    public static void main(String[] args) {
    }

    /**
     * euclidAlgExt
     *
     * This function calculates the extended greatest common divisor
     * algorithm for a and b in the equation d = ax + by
     * where a,b > 0 and a > b
     *
     * Parameters:
     *   a: first long
     *   b: second long
     *
     * Return value: a long array where index[0] = gcd,
     * and index[1] = x, index[2] = y in the equation above
     */
    public static long[] euclidAlgExt(long a, long b){
        if (b == 0)
          return new long[] { a, 1, 0 };

        long[] outputs = euclidAlgExt(b, a % b);
        return new long[] { outputs[0], outputs[2],
             (outputs[1] - (a / b) * outputs[2]) };
    }
}