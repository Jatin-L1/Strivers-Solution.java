public class reversepairs {
            static int count;
        public  void merge(int[] a , int[] b , int[] c){
        int i =0,j=0,k=0;
        while(i<a.length && j<b.length){
            if(a[i]<=b[j]){
                c[k] = a[i];
                k++;
                i++;
            }
            else{
                c[k] = b[j];
                j++;
                k++;
            }

        }
        if(i==a.length){
            while (j<b.length) {
                c[k] = b[j];
                k++;
                j++;
            }
        }
        if(j==b.length){
            while (i<a.length) {
                c[k] = a[i];
                k++;
                i++;
            }
        }
    }
    public void inversion(int[] a , int[] b){
        int i =0 , j=0;
        while(i<a.length && j<b.length){
            if((long)a[i]>((long)2*(long)b[j])){
                count += (a.length -i);
                j++;
            }
            else{
                i++;
            }
        }
    }
    public  void mergesort(int[] arr){
        int n = arr.length;
        if(n==1) return; //base case
        //create two arrays of n/2 size each
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];

        //copy pasting 
        for(int i =0;i<n/2;i++){
            a[i] = arr[i];
        }
        for(int i=0;i<n-n/2;i++){
            b[i] = arr[i+n/2];

        }

        //magic
        mergesort(a);
        mergesort(b);
        inversion(a,b);

        //merege these 'a' and 'b'
        merge(a,b,arr);
        //delete a and b just to improve space complexity
        a = null;
        b = null;
    }
    public int reversePairs(int[] arr) {

        count =0;
        mergesort(arr);
        return count;

        
    }
}
