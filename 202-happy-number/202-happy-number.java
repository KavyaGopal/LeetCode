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

        while(n != 1 && !set.contains(n)) {
            set.add(n);
            n = getSquareOfNum(n);
            
        }
        return n == 1;
    }
}