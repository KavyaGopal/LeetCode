class Solution {
    public int[] sortArrayByParity(int[] nums) {
       int i = 0, j = nums.length - 1;
        while (i < j) {
            if (nums[i]%2 == 0) {
                i++;
            } else {
                int temp = nums[j];
                nums[j]= nums[i];
                nums[i]= temp;
                j--;
            }
        }
        return nums;
    }
}