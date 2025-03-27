# 40. Combination Sum II - LeetCode
# Difficulty: Medium
"""
Can you solve this real interview question? Combination Sum II - Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.

 

Example 1:


Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]


Example 2:


Input: candidates = [2,5,2,1,2], target = 5
Output: 
[
[1,2,2],
[5]
]


 

Constraints:

 * 1 <= candidates.length <= 100
 * 1 <= candidates[i] <= 50
 * 1 <= target <= 30
"""
# URL: https://leetcode.com/problems/combination-sum-ii/submissions/1588048044/

class Solution {
    public int combinationSum2(int[] arr, int tar, int idx, List<Integer> smallAns, List<List<Integer>> res) {
        if (tar == 0) {
            ArrayList<Integer> base = new ArrayList<>(smallAns);
            res.add(base);
            return 1;
        }
        boolean[] visited = new boolean[50];
        int count = 0;
        for (int i = idx; i < arr.length; ++i) {
            if (!visited[arr[i]] && tar - arr[i] >= 0) {
                
                visited[arr[i]] = true;
                
                smallAns.add(arr[i]);
                count += combinationSum2(arr, tar - arr[i], i + 1, smallAns, res);
                smallAns.remove(smallAns.size() - 1);
            }
        }
        return count;
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> smallAns = new ArrayList<>();
        
        Arrays.sort(candidates);
        
        combinationSum2(candidates, target, 0, smallAns, res);
        return res;
    }
}
