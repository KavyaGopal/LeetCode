class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // 1,2,2,3,3,4,7,8
        List<Integer> output = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);
        
        for(int i = 1; i<= nums.length; i++) {
            if(!set.contains(i)) {
                output.add(i);
            }
        }
        return output;
    }
}