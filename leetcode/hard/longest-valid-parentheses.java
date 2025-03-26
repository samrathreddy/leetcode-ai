// 32. Longest Valid Parentheses - LeetCode
// Difficulty: Hard
/*
Can you solve this real interview question? Longest Valid Parentheses - Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses substring.

 

Example 1:


Input: s = "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()".


Example 2:


Input: s = ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()".


Example 3:


Input: s = ""
Output: 0


 

Constraints:

 * 0 <= s.length <= 3 * 104
 * s[i] is '(', or ')'.
*/
// URL: https://leetcode.com/problems/longest-valid-parentheses/submissions/1587055802/

public class Solution {
public int longestValidParentheses(String s) {
    int max = Integer.MIN_VALUE;
    s += "x";
    Stack<Integer> stack = new Stack<>();
    for(int i = 0; i < s.length(); i++){
        if(s.charAt(i) == ')' && !stack.empty() && 
s.charAt(stack.peek())== '(')
            stack.pop();
        else{
            if(stack.empty()){
                max = Math.max(max, i);
            }
            else
                max = Math.max(max, i-stack.peek()
-1);
            stack.push(i);
        }
    }
    return stack.empty() ? s.length() : max;
    }
}
