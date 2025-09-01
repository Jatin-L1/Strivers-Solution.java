import java.util.*;

public class LengthofthelongestsubarraywithzeroSum {

    public int length(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        
        int prefixSum = 0;
        int ans = 0;

        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            if (prefixSum == 0) {
                ans = Math.max(ans, i + 1);
            }
            if (map.containsKey(prefixSum)) {
                ans = Math.max(ans, i - map.get(prefixSum));
            } else {
                map.put(prefixSum, i); 
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        LengthofthelongestsubarraywithzeroSum obj = new LengthofthelongestsubarraywithzeroSum();
        int[] arr = {15, -2, 2, -8, 1, 7, 10, 23};
        System.out.println(obj.length(arr)); 
    }
}
