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
// URL: https://leetcode.com/problems/longest-valid-parentheses/

class Solution {
public:
    int longestValidParentheses(string s) {
        stack<int> st;
        st.push(-1);
        int max_len = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s[i] == '(') {
                st.push(i);
            } else {
                st.pop();
                if (st.empty()) {
                    st.push(i);
                } else {
                    max_len = max(max_len, i - st.top());
                }
            }
        }

        return max_len;        
    }
};
