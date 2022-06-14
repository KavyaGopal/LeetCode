class Solution {
    
    public void replaceNums(int[] arr, int i) {
        int len = arr.length - 1;
        while (len > i+1) {
            arr[len] = arr[len - 1];
            len--;
        }
        if (i+1 < arr.length)
            arr[i+1] = 0;
    }
    
    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                replaceNums(arr, i);
                i++;
            }
        }
    }
}