import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {

    public int[][] merge(int[][] arr){
        int n = arr.length;

        Arrays.sort(arr , new Comparator<int[]>() {
            public int compare(int[] a , int[] b){
                return a[0] - b[0];
            }
        });
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i =0 ; i<n;i++){
            if(ans.isEmpty() || arr[i][0]>ans.get(ans.size()-1).get(1)){
                ArrayList<Integer> list = new ArrayList<>();
                list.add(arr[i][0]);
                list.add(arr[i][1]);
                ans.add(list);
            }
            else{
                ans.get(ans.size()-1).set(1  ,Math.max(arr[i][1] , ans.get(ans.size()-1).get(1)));
            }

        }
        int[][]result = new int[ans.size()][2];
        for(int i=0;i<ans.size();i++){
            result[i][0] = ans.get(i).get(0);
            result[i][1] = ans.get(i).get(1);

        }
        return result;


    }
    
}
