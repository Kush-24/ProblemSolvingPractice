package com.kush.studyplan.seventyfive.arraystring;
class GCDOfStrings {
    public static void main(String[] args) {
        // Sample inputs
        String str1 = "ABCABC";
        String str2 = "ABC";

        // Calling gcdOfStrings method and printing the result
        String gcdResult = gcdOfStrings(str1, str2);
        System.out.println("GCD of Strings: " + gcdResult);
    }

    /*
    Problem:
    Find the greatest common divisor (GCD) of two strings.
    

    Logic Explanation:
    - If the concatenation of str1 and str2 is not equal to the concatenation of str2 and str1,
      there cannot be a valid GCD of the strings. In this case, return an empty string.
    - Calculate the GCD of the lengths of str1 and str2 using the Euclidean algorithm.
    - Return the substring of str1 from index 0 to the calculated GCD length.

    Key Points:
    - Verifies if the strings can be formed by repeating a common substring.
    - Uses Euclidean algorithm to calculate the GCD of lengths.
    - Returns the common substring of maximum length that forms both strings.
    */

    public static String gcdOfStrings(String str1, String str2) {
        // Check if concatenation of str1 and str2 is equal to concatenation of str2 and str1
        if (!(str1 + str2).equals(str2 + str1)) {
            return ""; // If not equal, return an empty string
        }

        // Calculate the greatest common divisor (GCD) of lengths of str1 and str2
        int gcdLength = gcd(str1.length(), str2.length());

        // Return substring of str1 from index 0 to gcdLength (GCD)
        return str1.substring(0, gcdLength);
    }

    // Method to find the greatest common divisor (GCD) of two numbers using Euclidean algorithm
    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a; // Return the GCD
    }
}
