package BinarySearch.BinarySearchOn1D;

import java.util.Arrays;

public class FirstAndLastPosition {
public int[] searchRange(int[] arr, int target) {
        int n = arr.length;
        int lo = 0 , hi = n-1;
        int lb =n;
        int ub  = n;

        boolean flag = false;
        int[] range = new int[2];
        Arrays.fill(range  ,-1);

        while(lo<=hi){
            int mid = lo+(hi-lo)/2;
            if(arr[mid]==target){
                flag = true;
                break;
            }
            else if(arr[mid]>target) hi = mid-1;
            else lo = mid+1;
        }
        if(!flag){
            return range;
        }
        lo = 0 ; hi = n-1;

        while(lo<=hi){
            int mid = lo + (hi-lo)/2;

            if(arr[mid]>=target){
                lb = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }
        lo = 0 ; hi = n-1;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;

            if(arr[mid]>target){
                ub = mid;
                hi = mid-1;
            }
            else lo = mid+1;
        }

        range[0] = lb;
        range[1] = ub-1;
        return range;

    }
    
}
