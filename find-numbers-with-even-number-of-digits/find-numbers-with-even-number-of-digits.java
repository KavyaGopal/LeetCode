class Solution {
    public boolean numOfDigits(int num) {
        int digit = 0;
        while(num>0) {
            digit ++;
            num = num/10;
        }
        if (digit %2 == 0)
            return true;
        return false;
    }
    public int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++){
            if (numOfDigits(nums[i]))
                count++;
        }
        return count;
    }
}