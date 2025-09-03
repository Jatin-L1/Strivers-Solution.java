package BinarySearch.BinarySearchOn1D;

public class MinimumInRotatedSortedArray {
    public int findMin(int[] arr) {
        int n = arr.length;
        int lo =0 ; 
        int hi = n-1;
        int ans = Integer.MAX_VALUE;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>arr[hi]) lo = mid+1;
            else hi = mid;
        }
        return arr[lo];
        
    }
    
    
}
