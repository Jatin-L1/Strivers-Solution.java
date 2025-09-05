package BinarySearch.BinarySearchOn1D.BinraySearchOnAnswers;

public class MinimunNumberOfDaysToMakeMBouquets {
     public int  min(int[] arr){
        int n = arr.length;
        int ans = Integer.MAX_VALUE;

        for(int i =0 ; i<n;i++) ans = Math.min(ans , arr[i]);
        return ans;

    }
    public int  max(int[] arr){
        int n = arr.length;
        int ans = Integer.MIN_VALUE;

        for(int i =0 ; i<n;i++) ans = Math.max(ans , arr[i]);
        return ans;

    }
    public int blooms(int[] arr , int mid ,int k){
        int count =0;
        int ans = 0;

        for(int i =0 ; i<arr.length;i++){
            if(arr[i]<=mid) count++;
            else{
                ans+=count/k;
                count=0;
            }
        }
        ans += count / k;
        return ans;

    }
    public int minDays(int[] arr, int m, int k) {
        int n = arr.length;
        if((long)m * k > n) return -1;
        
        int lo = min(arr);
        int hi = max(arr);
        int ans = -1;

        while(lo<=hi){
            int mid = lo+ (hi-lo)/2;
            int count = blooms(arr , mid , k);
            if(count>=m){
                ans = mid;
                hi=mid-1;
            }
            else lo = mid+1;
        }
        return ans;
        
    }
    
}
