// 21. Merge Two Sorted Lists - LeetCode
// Difficulty: Easy
/*
Can you solve this real interview question? Merge Two Sorted Lists - You are given the heads of two sorted linked lists list1 and list2.

Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.

Return the head of the merged linked list.

 

Example 1:

[https://assets.leetcode.com/uploads/2020/10/03/merge_ex1.jpg]


Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]


Example 2:


Input: list1 = [], list2 = []
Output: []


Example 3:


Input: list1 = [], list2 = [0]
Output: [0]


 

Constraints:

 * The number of nodes in both lists is in the range [0, 50].
 * -100 <= Node.val <= 100
 * Both list1 and list2 are sorted in non-decreasing order.
*/
// URL: https://leetcode.com/problems/merge-two-sorted-lists/description/

        }
                swap(l1,l2); // haar baar l1 hi chota hoga
            }
                temp -> next = l2;
            }
            else {
                l1 = l1->next;
                temp = l1;
            if(l1->val <= l2->val ){
        while(l1 != NULL && l2 != NULL){
            
        ListNode* result = l1;
        ListNode* temp = NULL;
            swap(l1,l2);    // haar baar l1 hi chota hoga
        }

        if(l1->val > l2->val){  // taking L1 is smaller than l2 
        if(l1 == NULL) return l2;
        if(l2 == NULL) return l1;

public:
    ListNode* mergeTwoLists(ListNode* l1, ListNode* l2) {
        
class Solution {
