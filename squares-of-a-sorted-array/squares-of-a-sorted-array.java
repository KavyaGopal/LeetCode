class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0, j = nums.length - 1;
        int[] result = new int[nums.length];
        int len = nums.length - 1;
        while(i <= j) {
            if (nums[i]*nums[i] > nums[j]*nums[j]){
                result[len--] = nums[i]*nums[i];
                i++;
            } else {
                result[len--] = nums[j]*nums[j];
                j--;
            }
        }
        return result;
    }
}