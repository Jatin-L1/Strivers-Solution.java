public class MergeTwoSortedArray {

    public void merge(int[] arr1 , int arr2[]){
        int n = arr1.length;
        int m = arr2.length;
        int i = n-1;
        int j = m-1;
        int k = m+n-1;
        while(i>=0 && j>=0){
            if(arr1[i]>arr2[j]){
                arr1[k--] = arr1[i--];
            }
            else{
                arr1[k--] = arr2[j--];
            }
        }
        while (j >= 0) {
            arr1[k--] = arr2[j--];
        }

    }
    
}
