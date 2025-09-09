package BinarySearch.BinraySearchOnAnswers;

public class PainterProblem{
    public int max(int[] arr){
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            ans = Math.max(ans, arr[i]);
        }
        return ans;
    }

    public int sum(int[] arr){
        int n = arr.length;
        int ans = 0;
        for(int i = 0; i < n; i++){
            ans += arr[i];
        }
        return ans;
    }

    public boolean isPossible(int[] arr, int k, int mid){
        int n = arr.length;
        int boards = 0;
        int ans = 1; // start with 1 painter

        for(int i = 0; i < n; i++){
            if(boards + arr[i] <= mid){
                boards += arr[i];
            } else {
                boards = arr[i];
                ans++;
            }
        }
        if(ans <= k) return true;
        return false;
    }

    public int minTime(int[] arr, int k) {
        int n = arr.length;
        int lo  = max(arr);
        int hi = sum(arr);
        int ans = hi;

        while(lo <= hi){
            int mid  = lo + (hi - lo) / 2;
            if(isPossible(arr, k, mid)){
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }

}