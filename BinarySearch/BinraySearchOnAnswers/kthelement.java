package BinarySearch.BinraySearchOnAnswers;

public class kthelement {
        public void sortArray(int[] a , int[] b , int[] arr){
        int n = a.length;
        int m = b.length;
        
        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (a[i] > b[j]) 
                arr[k++] = b[j++];
            else 
                arr[k++] = a[i++];
        }
        while (i < n) arr[k++] = a[i++];
        while (j < m) arr[k++] = b[j++];
        
    }
    
    public int kthElement(int a[], int b[], int k) {
        
        int n = a.length;
        int m = b.length;
        
        int[] arr = new int[m+n];
        
        sortArray(a , b , arr);
        
        return arr[k-1];
        
        
    }
    
}
