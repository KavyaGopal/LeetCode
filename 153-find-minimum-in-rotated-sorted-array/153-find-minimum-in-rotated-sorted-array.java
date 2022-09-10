class Solution {
    public int findMin(int[] nums) {
        int val = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < val)
                val = nums[i];
        }
        return val;
    }
}