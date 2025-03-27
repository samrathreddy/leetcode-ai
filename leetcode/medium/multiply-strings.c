// 43. Multiply Strings - LeetCode
// Difficulty: Medium
// Can you solve this real interview question? Multiply Strings - Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
// 
// Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
// 
//  
// 
// Example 1:
// 
// Input: num1 = "2", num2 = "3"
// Output: "6"
// 
// 
// Example 2:
// 
// Input: num1 = "123", num2 = "456"
// Output: "56088"
// 
// 
//  
// 
// Constraints:
// 
//  * 1 <= num1.length, num2.length <= 200
//  * num1 and num2 consist of digits only.
//  * Both num1 and num2 do not contain any leading zero, except the number 0 itself.
// URL: https://leetcode.com/problems/multiply-strings/submissions/1588085091/

#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char* multiply(char* num1, char* num2) {
    int len1 = strlen(num1);
    int len2 = strlen(num2);
    int resultLen = len1 + len2;
    int *result = (int*)calloc(resultLen, sizeof(int));

    // Reverse multiply
    for (int i = len1 - 1; i >= 0; i--) {
        for (int j = len2 - 1; j >= 0; j--) {
            int mul = (num1[i] - '0') * (num2[j] - '0');
            int sum = mul + result[i + j + 1];

            result[i + j + 1] = sum % 10;
            result[i + j] += sum / 10;
        }
    }

    // Convert result array to string
    char* resStr = (char*)malloc((resultLen + 1) * sizeof(char));
    int index = 0, k = 0;

    // Skip leading zeros
    while (index < resultLen && result[index] == 0) {
        index++;
    }

    // If result is zero
    if (index == resultLen) {
        free(result);
        resStr[0] = '0';
        resStr[1] = '\0';
        return resStr;
    }

    // Fill result string
    while (index < resultLen) {
        resStr[k++] = result[index++] + '0';
    }
    resStr[k] = '\0';

    free(result);
    return resStr;
}

