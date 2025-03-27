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

·‌·‌·‌·‌private·‌StringBuilder·‌sumResults(ArrayList<ArrayList<Integer>>·‌results)·‌{
·‌·‌·‌·‌·‌·‌·‌·‌//·‌Initialize·‌answer·‌as·‌a·‌number·‌from·‌results.
·‌·‌·‌·‌·‌·‌·‌·‌ArrayList<Integer>·‌answer·‌=·‌new·‌ArrayList<>(
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌results.get(results.size()·‌-·‌1)
·‌·‌·‌·‌·‌·‌·‌·‌);
·‌·‌·‌·‌·‌·‌·‌·‌ArrayList<Integer>·‌newAnswer·‌=·‌new·‌ArrayList<>();

·‌·‌·‌·‌·‌·‌·‌·‌//·‌Sum·‌each·‌digit·‌from·‌answer·‌and·‌result
·‌·‌·‌·‌·‌·‌·‌·‌for·‌(int·‌j·‌=·‌0;·‌j·‌<·‌results.size()·‌-·‌1;·‌++j)·‌{
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌ArrayList<Integer>·‌result·‌=·‌new·‌ArrayList<>(results.get(j));
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌newAnswer·‌=·‌new·‌ArrayList<>();

·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌int·‌carry·‌=·‌0;

·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌for·‌(int·‌i·‌=·‌0;·‌i·‌<·‌answer.size()·‌||·‌i·‌<·‌result.size();·‌++i)·‌{
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌//·‌If·‌answer·‌is·‌shorter·‌than·‌result·‌or·‌vice·‌versa,·‌use·‌0·‌as·‌the·‌
current·‌digit.
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌int·‌digit1·‌=·‌i·‌<·‌result.size()·‌?·‌result.get(i)·‌:·‌0;
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌int·‌digit2·‌=·‌i·‌<·‌answer.size()·‌?·‌answer.get(i)·‌:·‌0;
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌//·‌Add·‌current·‌digits·‌of·‌both·‌numbers.
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌int·‌sum·‌=·‌digit1·‌+·‌digit2·‌+·‌carry;
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌//·‌Set·‌carry·‌equal·‌to·‌the·‌tens·‌place·‌digit·‌of·‌sum.
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌carry·‌=·‌sum·‌/·‌10;
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌//·‌Append·‌the·‌ones·‌place·‌digit·‌of·‌sum·‌to·‌answer.
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌newAnswer.add(sum·‌%·‌10);
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌}

·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌if·‌(carry·‌!=·‌0)·‌{
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌newAnswer.add(carry);
·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌·‌}
            answer = newAnswer;
