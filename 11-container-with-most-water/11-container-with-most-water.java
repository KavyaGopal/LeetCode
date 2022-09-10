class Solution {
    public int maxArea(int[] height) {
        int area = Integer.MIN_VALUE;
        int left = 0, right = height.length -1;
        while ( left < right) {
            int min = Math.min(height[left], height[right]);
            area = Math.max(area, min*(right - left));
            
            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return area;
    }
}