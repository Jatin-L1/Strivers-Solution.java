package BinarySearch.BinarySearchOn2DArrays;

public class rowwitmaxone {
    public int lowerbound(int[] arr  ,int i){
        int n = arr.length;
        int lo = 0  , hi = n-1;
        int ans = -1;

        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(arr[mid]>=i){
                ans  = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        return (ans);

    }
    int minRow(int arr[][]) {
        int n =arr.length;
        int m = arr[0].length;
        int ans = Integer.MAX_VALUE;
        int row =-1;


        for(int i =0 ;i<n;i++){
            int one = m - lowerbound(arr[i] , 1);

            if(one < ans){
                ans = one;
                row = i;
            }
        }

        return row;
    }
    
}
