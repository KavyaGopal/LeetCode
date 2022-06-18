class Solution {
    public boolean checkIfExist(int[] arr) {
        ArrayList<Integer> map = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if(map.contains(arr[i]*2) || (map.contains(arr[i]/2) && arr[i]%2 == 0))
                return true;
            map.add(arr[i]);
        }
        return false;
    }
}