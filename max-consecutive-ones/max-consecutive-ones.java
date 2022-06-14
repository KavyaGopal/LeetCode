class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxNum=0, count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
                if (count > maxNum)
                    maxNum = count;
            } else {
                count = 0;
            }
        }
        return maxNum;
    }
}