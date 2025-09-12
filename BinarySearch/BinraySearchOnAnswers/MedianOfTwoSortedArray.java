package BinarySearch.BinraySearchOnAnswers;

public class MedianOfTwoSortedArray {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] arr  = new int[n + m];

        int i = 0, j = 0, k = 0;

        // Merge the two sorted arrays
        while (i < n && j < m) {
            if (nums1[i] > nums2[j]) 
                arr[k++] = nums2[j++];
            else 
                arr[k++] = nums1[i++];
        }

        // Add remaining elements
        while (i < n) arr[k++] = nums1[i++];
        while (j < m) arr[k++] = nums2[j++];

        int total = n + m;

        // Correct median logic
        if (total % 2 == 0) {
            return (arr[total / 2] + arr[(total / 2) - 1]) / 2.0;
        } else {
            return arr[total / 2];
        }
    }
    
}
