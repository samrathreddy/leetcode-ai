// 43. Multiply Strings - LeetCode
// Difficulty: Medium
/*
Can you solve this real interview question? Multiply Strings - Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.

 

Example 1:

Input: num1 = "2", num2 = "3"
Output: "6"


Example 2:

Input: num1 = "123", num2 = "456"
Output: "56088"


 

Constraints:

 * 1 <= num1.length, num2.length <= 200
 * num1 and num2 consist of digits only.
 * Both num1 and num2 do not contain any leading zero, except the number 0 itself.
*/
// URL: https://leetcode.com/problems/multiply-strings/submissions/1588084322/

import java.math.BigInteger;

class Solution {
    public String multiply(String num1, String num2) {
        BigInteger one = new BigInteger(num1);
        BigInteger two = new BigInteger(num2);

        BigInteger result = one.multiply(two);

        return result.toString();
    }
}
