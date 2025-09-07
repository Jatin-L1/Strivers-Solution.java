package BinarySearch.BinarySearchOn1D.BinraySearchOnAnswers;

public class SmallestDivisor {
    public int compute(int[] arr , int mid){
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%mid==0) ans+=arr[i]/mid;
            else ans+=arr[i]/mid+1;
        }
        return ans;
    }

    public int smallestDivisor(int[] arr, int threshold) {
        int n = arr.length;
        int lo = 1;
        int hi = 0;
        for (int num : arr) hi = Math.max(hi, num);

        int ans = hi;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            int sum = compute(arr, mid);

            if (sum <= threshold) {
                ans = mid;
                hi = mid - 1; 
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }
    
}
