class Solution {
    public boolean validMountainArray(int[] arr) {
        int maxElement = 0, maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
                maxIndex = i;
            }
        }
        if (maxIndex == 0 || maxIndex == arr.length - 1)
            return false;
        int index = 0;
        while(index < maxIndex) {
            if(arr[index] >= arr[++index])
                return false;
        }
        index = maxIndex;
        while (index < arr.length - 1) {
            if (arr[index] <= arr[++index])
                return false;
        }
        return true;
    }
}