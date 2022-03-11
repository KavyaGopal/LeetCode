class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int output[] = new int[nums.length];
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 0 || nums[i] %2 == 0) {
                output[index++] = nums[i];
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] != 0 && nums[i] %2 != 0) {
                output[index++] = nums[i];
            }
        }
        return output;
    }
}