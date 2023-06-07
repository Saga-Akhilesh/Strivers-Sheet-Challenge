import java.util.*;

public class mergetwosorted {
public static void swap(long[] arr1, long[] arr2, int ind1, int ind2) {
    if (arr1[ind1] > arr2[ind2]) {
        long temp = arr1[ind1];
        arr1[ind1] = arr2[ind2];
        arr2[ind2] = temp;
    }
}

public static void merge(long[] arr1, long[] arr2, int n, int m) {
    int len = n + m;
    int gap = (len / 2) + (len % 2);
    while (gap > 0) {
        int left = 0;
        int right = left + gap;
        while (right < len) {
            // case 1: left in arr1[] and right in arr2[]:
            if (left < n && right >= n) {
                swap(arr1, arr2, left, right - n);
            }
            // case 2: both pointers in arr2[]:
            else if (left >= n) {
                swap(arr2, arr2, left - n, right - n);
            }
            // case 3: both pointers in arr1[]:
            else {
                swap(arr1, arr1, left, right);
            }
            left++; right++;
        }
        // break after gap=1 iteration is completed:
        if (gap == 1) break;

        // Otherwise, calculate new gap:
        gap = (gap / 2) + (gap % 2);
    }
}
}
