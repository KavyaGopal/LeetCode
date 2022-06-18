class Solution {
    public boolean validMountainArray(int[] arr) {
        int index = 0;
        while(index<arr.length - 1) {
            if (arr[index] < arr[index+1]){
                index++;
            } else {
                break;
            }
        }
        if (index == 0 || index == arr.length - 1) {
            return false;
        }
        while(index < arr.length - 1) {
            if (arr[index] <= arr[index+1]){
                return false;
            }
            index++;
        }
        System.out.println(index);
        if (index == arr.length - 1) {
            return true;
        }
        return false;
    }
}