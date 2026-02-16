package SubarrayProblems;

import java.util.Scanner;

public class MinimumAvgOfConsectiveElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int MinAvg = Integer.MIN_VALUE;
        int wSum = 0;
        for(int i=0; i<k; i++){
            wSum += arr[i];
        }
        int minSum = wSum;
        int startIdx = 0;
        for(int i=k; i<n; i++){
            wSum = wSum - arr[i-k];
            wSum += arr[i];
            if(wSum < minSum){
                minSum = wSum;
                startIdx = i - k + 1;
            }
        }
        System.out.println(startIdx);
        System.out.println(startIdx+k-1);

    }
}
