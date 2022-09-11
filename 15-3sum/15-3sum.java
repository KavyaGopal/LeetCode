class Solution {
    
    public void twoSum(int[] nums, int index, List<List<Integer>> result) { 
        int left = index + 1, right = nums.length - 1;
        while (left < right) {
            int sum = nums[index] + nums[left] + nums[right];
            if (sum == 0) {
                result.add(Arrays.asList(nums[index], nums[left], nums[right]));
                left++;
                right--;
                while(left < right && nums[left] == nums[left - 1])
                    left++;
            } else if ( sum < 0) {
                left++;
            } else {
                right--;
            }
        }
        
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < nums.length && nums[i] <= 0; i++) {
            if ( i ==0 || nums[i-1] != nums[i]) {
                twoSum(nums, i, result);
            }
        }
        return result;
    }
}