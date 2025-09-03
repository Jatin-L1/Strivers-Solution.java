package BinarySearch.BinarySearchOn1D;

public class InsertPosition {

    public int searchInsert(int[] arr, int target) {
        int n = arr.length;
        int lo = 0  ,hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]==target) return mid;
            else if(arr[mid]>target) hi = mid;
            else lo = mid+1;
        }
        return lo;    
    }
    
}
