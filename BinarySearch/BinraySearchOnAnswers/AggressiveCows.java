public class AggressiveCows {
    public boolean isPossible(int[] arr , int dist , int k){
        int countCows = 1 ; int last = arr[0];
        
        for(int i =0 ; i<arr.length;i++){
            if(arr[i]-last>=dist){
                countCows++;
                last  =arr[i];
            }
        }
        if(countCows>=k) return true;
        return false;
    }
    
    public int aggressiveCows(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        int lo = 1;
        int hi  = arr[n-1] - arr[0];
        int ans =0;
        
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;
            if(isPossible(arr , mid , k)){
                ans =mid;
                lo = mid+1; // try for bigger number heena smallest nhi dhuhd  rahe hain hum isliye hum hi = mid-1 nhi likh rahe
                
            }
            else{
                hi = mid-1;
            }
        }
        return ans;
        
    }
    
}
