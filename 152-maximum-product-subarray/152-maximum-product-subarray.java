class Solution {
    public int maxProduct(int[] nums) {
        int min = nums[0], max = nums[0], prod = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            int temp = Math.max(nums[i], Math.max(max*nums[i], min*nums[i]));
            min = Math.min(nums[i], Math.min(max*nums[i], min*nums[i]));
            max = temp;
            prod = Math.max(prod, max);
            
        }
        
        return prod;
    }
}