package BinarySearch.BinarySearchOn1D;

public class UpperBound {
    public static int UB(int[] arr ,int x){
        int n = arr.length;

        int lo =0  ,hi = n-1;
        int ans = n;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>x){
                ans = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        return ans;
    }
    
}
