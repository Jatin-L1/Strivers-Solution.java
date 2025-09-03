package BinarySearch.BinarySearchOn1D;

public class FloorCeil {
    public static int lb(int[] arr, int x) {
        int n = arr.length;
        int lo = 0, hi = n - 1;
        int ans = n;  

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] >= x) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1; 
            }
        }
        return ans;
    }
    public static int ub(int[] arr, int x) {  
        int n = arr.length;
        int lo = 0, hi = n - 1;
        int ans = n;  

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] > x) {
                ans = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return ans;
    }
    public int[] getFloorAndCeil(int[] arr, int x) {
        if (arr == null || arr.length == 0) {
            return new int[]{-1, -1};  
        }

        int lbIndex = lb(arr, x);
        int ubIndex = ub(arr, x);

        int floor = (lbIndex > 0) ? arr[lbIndex - 1] : -1;  
        int ceil = (ubIndex < arr.length) ? arr[ubIndex] : -1;  

        return new int[]{floor, ceil};
    }
}