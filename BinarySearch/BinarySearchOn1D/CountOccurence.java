package BinarySearch.BinarySearchOn1D;

public class CountOccurence {

    public static int count(int[] arr ,int x){

        int n = arr.length;
        int lo =0 , hi = n-1;
        int lb  =n  ,ub = n;

        while(lo<=hi){
            int mid = lo + (hi-lo)/2;

            if(arr[mid]>=x){
                lb = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        lo  = 0 ; hi = n-1;

        while(lo<=hi){
            int mid = lo + (hi-lo)/2;

            if(arr[mid]>x){
                ub = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }


        return hi -lo+1;
    }

    
}
