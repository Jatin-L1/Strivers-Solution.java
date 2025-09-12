package BinarySearch.BinarySearchOn2DArrays;

public class searchmatrix2 {
    public boolean searchMatrix(int[][] arr, int target) {

        int m = arr.length , n = arr[0].length;

        // below code is okay but it is not efficient. alag banne ke liye kuch alag sachna padega!!!!!. if the no of rows or columns are greater bahut time lega ye.

        // for(int i =0;i<m;i++){
        //     for(int j=0;j<n;j++){
        //         if(arr[i][j]==target) return true;
        //     }
        // }
        // return false;
        int i =0 ,j=n-1;
        while(i<m && j>=0){
            if(arr[i][j]==target) return true;
            else if (arr[i][j]>target){ //go left
                j--;
            }
            else{//go down
                i++;
            }
        }
        return false;


    }
    
}
