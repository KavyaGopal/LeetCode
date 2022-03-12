class Solution {
    public int thirdMax(int[] nums) {
        if (nums.length == 0)
            return 0;
        Arrays.sort(nums);
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i]!= nums[index])
                nums[++index] = nums[i];
        }
        if(index >= 2) 
            return nums[index - 2];
        return nums[index];
    }
}