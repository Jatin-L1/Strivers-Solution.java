package BinarySearch.BinraySearchOnAnswers;

public class kokoeatingbanana {
    public int max(int[] arr){
        int n = arr.length;
        int ans = Integer.MIN_VALUE;

        for(int i =0 ; i<n;i++){
            if(arr[i]>ans){
                ans=  arr[i];
            }
        }
        return ans;

    }
    public int hours(int[] arr  ,int mid){
        int n = arr.length;

        int ans = 0;
        for(int i =0 ; i<n;i++){
            ans+=Math.ceil(((double)(arr[i]))/((double)(mid)));
        }
        return (int)(ans);
    }
    public int minEatingSpeed(int[] arr, int h) {
        int n = arr.length;

        int lo = 0;
        int hi = max(arr);
        int ans =-1;

        while(lo<=hi){
            int mid = lo + (hi-lo)/2;

            int totalhrs = hours(arr  ,mid);
            if(totalhrs<=h){
                ans = mid;
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        return ans;
        
    }
    
}
