import java.util.*;
public class missingandrepeating{
    //x -> repeating and  y-> missing
    // Sn - sum of n natural number
    // S2n - sum of squares of n natural number
    public static int[] MissingandRepeatingnumbers(int arr[]){

    long n =arr.length;
    long  Sn = n*(n+1)/2;
    long S2n = n*(n+1)*(2*n+1)/2;
    long S1= 0;
    long S2= 0;
    for(int i=0;i<n;i++){
        S1+=(long)arr[i];
        S2+=(long)arr[i]*arr[i];
    }
    long val1 = S1-Sn;
    long val2= S2- S2n;
    val2= val2/2;
    long x = (val1+val2)/2;
    long y = x-val1;
    int result[] = {(int)x,(int)y};
    return result;
}
}