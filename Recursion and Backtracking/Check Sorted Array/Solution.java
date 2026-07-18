class Solution {
    public boolean isSorted(int[] arr) {
        return srt(arr,1);
    }
    static boolean srt(int[] arr, int idx){
        if(idx==arr.length)
            return true;
        if(arr[idx]<arr[idx-1])
            return false;
        return srt(arr,idx+1);
    }
}