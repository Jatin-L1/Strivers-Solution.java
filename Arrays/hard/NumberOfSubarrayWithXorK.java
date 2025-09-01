import java.util.HashMap;

public class NumberOfSubarrayWithXorK {
    
    public int count ( int[] arr ,int k){
        int n = arr.length;

        HashMap<Integer , Integer> map = new HashMap<>();
        int xr =0;
        map.put(xr , 1);

        int cnt =0;

        for(int i =0 ; i<n;i++){
            xr^=arr[i];

            int x = xr^k;

            if(map.containsKey(x)){
                cnt+=map.get(x);
            }

            if (map.containsKey(xr)) {
                map.put(xr, map.get(xr) + 1);
            } else {
                map.put(xr, 1);
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] a = {4, 2, 2, 6, 4};
        int k = 6;
        NumberOfSubarrayWithXorK obj = new NumberOfSubarrayWithXorK();

        System.out.println(obj.count(a, k));
    }

}
