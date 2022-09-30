class Solution {
    
    public void twoSum(List<List<Integer>> result, int i, int[] nums) {
        int left = i+1, right = nums.length - 1;
        while (left < right) {
            int sum = nums[i] + nums[left] + nums[right];
            if (sum == 0) {
                result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                left++;
                right--;
                while(left < nums.length && nums[left] == nums[left-1] ) {
                    left++;
                }
                    
            } else if (sum < 0) {
                left++;
            } else {
                right--;
            }
        }
    }
    
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 ||  nums[i] != nums[i-1]) {
                twoSum(result, i, nums);
            }
        }
        return result;
    }
}