package BinarySearch.BinraySearchOnAnswers;
public class BookAllocation {
     public int max(int[] arr){
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            ans = Math.max(ans, arr[i]);
        }
        return ans;
    }

    public int sum(int[] arr){
        int ans = 0;
        int n = arr.length;
        for(int i = 0; i < n; i++){
            ans += arr[i];
        }
        return ans;
    }

    public boolean isPossible(int[] arr, int k, int mid){
        int n = arr.length;
        int student = 1;
        int pages = 0;

        for(int i = 0; i < n; i++){
            if(pages + arr[i] <= mid){
                pages += arr[i];
            }
            else{
                student++;
                pages = arr[i]; 
                if(student > k) return false; 
            }
        }
        return true;
    }

    public int findPages(int[] arr, int k) {
        int n = arr.length;
        if(n < k) return -1; 

        int lo = max(arr);
        int hi = sum(arr);
        int ans = -1;

        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;

            if(isPossible(arr, k, mid)){
                ans = mid;
                hi = mid - 1; 
            }
            else{
                lo = mid + 1;
            }
        }
        return ans;
    }
    
}
