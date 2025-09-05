package BinarySearch.BinarySearchOn1D.BinraySearchOnAnswers;

import java.util.Scanner;

public class NthRoot {
    public static int Nth(int N , int M){

        int lo = 0 , hi =M;

        while (lo<=hi) {
            int mid = lo + (hi-lo)/2;
            if((int)(Math.pow(mid, N))==M) return mid;
            else if((int)(Math.pow(mid  ,N))>M)hi = mid-1;
            else lo = mid+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        System.out.println(Nth(N, M));
    }
    
}
