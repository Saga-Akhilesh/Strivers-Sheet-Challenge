//Kadane's Algorithm
import java.util.*;
public clas KadaneAlgo{
    public int maxSubArray(int[] arr) {
        int n =arr.length;
        int sum=0;
        int max= Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(max<sum){
                max= sum;
            }
            if(sum<0){
                sum=0;
            }
        }

        // if(max<0) max=0; use this if empty subarray is also taken in consideration in question
        return arr;
}