class Solution {
    public int heightChecker(int[] heights) {
        int[] expected = new int[heights.length];
        for (int i = 0; i < heights.length; i++) {
            expected[i] = heights[i];
        }
        Arrays.sort(expected);
        // int index = 0, count = 0;
        int count=0;
        for (int i = 0; i < heights.length; i++) {
            // System.out.println(heights[i] + "  " + expected[i]);
            if (heights[i] != expected[i])
                count++;
        }
        return count;
    }
}