class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int index = 0;
        for (int i = 1; i < nums.length ; i++) {
            if (nums[index] != nums[i]) {
                nums[++index] = nums[i];
            }
        }
        if (index >= 2) {
            return nums[index - 2];
        } else if (index == 1) {
            return nums[index];
        }
        return nums[index];
    }
}