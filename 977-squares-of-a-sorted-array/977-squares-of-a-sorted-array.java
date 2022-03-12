
// Brute-force approach - O(n^2)
// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         int min = nums[0]*nums[0];
//         for (int i = 0; i< nums.length; i++) {
//             nums[i] = nums[i]*nums[i];
//             if (nums[i] < min) {
//                 min = nums[i];
//                 index = i;
//             }
//         }
//         Arrays.sort(nums);
//         return nums;
//     }
// }

// int j=0, k = nums.length -1;
//         int newArray[] = new int[nums.length];
        
//         for (int i = nums.length-1; i>=0; i--) {
//             if (nums[k]*nums[k] > nums[j]*nums[j]) {
//                 newArray[i] = nums[k]*nums[k];
//                 k--;
//             } else {
//                 newArray[i] = nums[j]*nums[j];
//                 j++;
//             }
//         }
//         return newArray;

// Start from the end of array and check if that element is greater than the first one. If so, add that to the new array.
// This works since there is increasing -> decreasing -> increasing order in array
class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0, j = nums.length - 1;
        for (int k = 0; k < nums.length; k++) {
            nums[k] = nums[k]*nums[k];
        }
        Arrays.sort(nums);
        return nums;
    }
}