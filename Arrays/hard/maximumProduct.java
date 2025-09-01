public class maximumProduct {
    public int maxProduct(int[] arr) {
        int n = arr.length;
        int size = (n * (n + 1)) / 2;  
        int MaxProduct = Integer.MIN_VALUE;
        int count = 0;  
        for (int i = 0; i < n; i++) {
            int product = 1;   
            for (int j = i; j < n; j++) {
                product *= arr[j];  
                MaxProduct = Math.max(product , MaxProduct);
            }
        } 
        return MaxProduct; 
    }
    
}
