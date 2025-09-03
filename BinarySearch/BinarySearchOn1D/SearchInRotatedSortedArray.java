package BinarySearch.BinarySearchOn1D;

public class SearchInRotatedSortedArray {
    public int search(int[] arr, int target) {
        int n = arr.length;
        int lo = 0  ,hi = n-1;

        while(lo<=hi){
            int mid = lo+(hi-lo)/2;

            if(arr[mid]==target) return mid;
            else if( arr[mid]<=arr[hi]){

                // yani ki mid se lakar hi tak sab sorted hain

                if(target>=arr[mid] && target<=arr[hi]) lo = mid+1;
                else hi = mid-1;
            }
            else{
                if(target>=arr[0] && target<=arr[mid]) hi = mid-1;
                else lo = mid+1;
            }
        }
        return -1;

        
    }
    
}
