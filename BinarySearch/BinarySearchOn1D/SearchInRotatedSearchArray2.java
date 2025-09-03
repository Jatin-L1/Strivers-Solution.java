package BinarySearch.BinarySearchOn1D;

public class SearchInRotatedSearchArray2 {
    public boolean search(int[] arr, int target) {
        int n = arr.length;

        int lo = 0 , hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;


            if(arr[mid]==target) return true;
            if(arr[lo]==arr[mid] && arr[mid]==arr[hi]){
                lo++;
                hi--;
                continue;
            }
            if(arr[mid]<=arr[hi]){
                //left part sorted hain
                if(arr[mid]<=target && arr[hi]>=target)lo = mid+1;
                else hi = mid-1;
            }
            else{
                //right part sorted hain
                if(arr[0]<=target && arr[mid]>=target) hi = mid-1;
                else lo = mid+1;
            }
        }
        return false;

        
    }
    
}
