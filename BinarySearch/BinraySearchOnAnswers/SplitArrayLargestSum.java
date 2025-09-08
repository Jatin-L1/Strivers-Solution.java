package BinarySearch.BinraySearchOnAnswers;

public class SplitArrayLargestSum {
    public int sum(int[] arr){
        int n = arr.length;
        int ans = 0;
        for(int i =0  ;i<n;i++){
            ans+=arr[i];
        }
        return ans;
    }
    public boolean isPossible(int[] arr , int k , int mid){
        int n = arr.length;
        int count =0;
        int sum =0;
        for(int i =0 ;i<n;i++){
            if(sum+arr[i]<=mid){
                sum+=arr[i];
            }
            else{
                sum = arr[i];
                count++;
            }
        }
      if(count>=k) return true;
      return false;
    }
    public int splitArray(int[] arr, int k) {
        int n = arr.length;
        if(k>n) return  0;
        int lo = arr[0];
        int hi = sum(arr);
        int ans = 0;

        while(lo<=hi){
            int mid = lo +(hi-lo)/2;

            if(isPossible(arr , k , mid)){
                ans =mid;
                hi = mid+1;
            }
            else{
                lo = mid-1;
            }

        }
        return ans;
        
    }
    
    
}
