class Solution {
    public static int getSquareOfNum(int num) {
        int sum = 0;
        while (num > 0) {
            int reminder = num % 10;
            sum = sum + reminder * reminder;
            num = num/10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        int slow = n, fast = getSquareOfNum(n);
        while(slow != fast) {
            slow = getSquareOfNum(slow);
            fast = getSquareOfNum(getSquareOfNum(fast));
        }
        return slow == 1;
    }
}