class Solution {
    public int removeElement(int[] nums, int val) {
        Arrays.sort(nums);
        int i = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                break;
            }
        }
        int count = 0;
        while(i < nums.length && nums[i] == val ) {
            count++;
            i++;
        }
        
        for (;i < nums.length; i++) {
            nums[i-count] = nums[i];
        }
        return nums.length - count;
    }
}