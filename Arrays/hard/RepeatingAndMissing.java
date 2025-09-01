import java.util.Arrays;
import java.util.HashMap;

public class RepeatingAndMissing {


    public int[] findMissingRepeatingNumbers(int[] arr) {
        int n = arr.length;
        int[] ans = new int[2];
        Arrays.sort(arr);
        HashMap<Integer , Integer> map = new HashMap<>();

        for (int ele : arr)  map.put(ele, map.getOrDefault(ele, 0) + 1);
        for (int ele : map.keySet()) {
            if (map.get(ele) == 2) {
                ans[0] = ele;
                break;
            }
        }

        int sum = (n * (n + 1)) / 2;
        int secondsum = 0;

        for (int i = 0; i < n; i++) {
            secondsum += arr[i];
        }
        ans[1] = sum - (secondsum - ans[0]); 

        return ans;
    }
    
}
