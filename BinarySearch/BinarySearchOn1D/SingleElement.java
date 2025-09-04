package BinarySearch.BinarySearchOn1D;

public class SingleElement {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        int lo = 0 , hi = n-1;
        if(arr[lo]!=arr[lo+1]) return arr[lo];
        if(arr[hi]!=arr[hi-1]) return arr[hi];

        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]!=arr[mid+1] && arr[mid]!=arr[mid-1]) return arr[mid];
            if(arr[lo]==arr[lo+1])lo+=2;
            if(arr[hi]==arr[hi-1]) hi-=2;
        }
        return 2435;
        
    } 
    
}
