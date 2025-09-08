package BinarySearch.BinraySearchOnAnswers;

public class CapacityToShipPackageWithinDdAYS {
    public int sum(int[] arr){
        int ans =0;
        for(int i =0;i<arr.length;i++){
            ans+=arr[i];
        }
        return ans;

    }
    public int max(int[] arr){
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        for(int i =0;i<n;i++){
            ans = Math.max(ans , arr[i]);
        }
        return ans;
    }
    public boolean isPossible(int mid , int[] arr , int days){
        int n = arr.length;
        int load = 0;
        int d =1;
        for(int  i =0; i<n;i++){
            if(load+arr[i]<=mid) load+=arr[i];
            else{
                load = arr[i];
                d++;
            }
        }
        if(d>days) return false;
        return true;
    }
    public int shipWithinDays(int[] arr, int days) {
        int n = arr.length;
        int sum =0;
        int lo = max(arr);
        int hi = sum(arr);
        int ans = 0;
        while(lo<=hi){
            int mid = lo +(hi-lo)/2;
            if(isPossible(mid , arr  , days)){
                ans=mid;
                hi =mid-1;
            }
            else lo = mid+1;
        }
        return ans;
        
    }
    
}
