package BinarySearch.BinarySearchOn1D;

public class PeakElement {
    public int findPeakElement(int[] arr) {
        int n = arr.length;
        int lo = 0 , hi = n-1;
        while(lo<=hi){
            int mid = lo - (hi+lo)/2;

            if(mid>0 && arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1]) return arr[mid];

            if(arr[hi]>arr[mid]) lo = mid+1;
            else hi = mid-1;
        }

        return 2435;

        
        
    }
    
}
