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
// URL: https://leetcode.com/problems/multiply-strings/

            return "0";
        }

        StringBuilder firstNumber = new StringBuilder(num1);
        StringBuilder secondNumber = new StringBuilder(num2);

        // Reverse both the numbers.
        firstNumber.reverse();
        secondNumber.reverse();

        // For each digit in secondNumber, multipy the digit by firstNumber and
        // store the multiplication result (reversed) in results.
        ArrayList<ArrayList<Integer>> results = new ArrayList<>();
        for (int i = 0; i < secondNumber.length(); ++i) {
            results.add(
                multiplyOneDigit(firstNumber, secondNumber.charAt(i), i)
            );
        }

        // Add all the results in the results array, and store the sum in the answer string.
        StringBuilder answer = sumResults(results);

        // answer is reversed, so reverse it to get the final answer.
        answer.reverse();
        return answer.toString();
    }
}
