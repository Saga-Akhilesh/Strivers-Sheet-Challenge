import java.util.* ;
import java.io.*; 
public class CountInversions {
    public static long getInversions(long arr[], int n) {
        return mergeSort(arr,0,n-1);
       }
    private static long merge(long[] arr, long low, long mid, long high) {
        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        long left = low;      // starting index of left half of arr
        long right = mid + 1;   // starting index of right half of arr

        //storing elements in the temporary array in a sorted manner//
        long count=0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                count+=(mid-low+1);
                right++;
            }
        }

        // if elements on the left half are still left //

        while (left <= mid) {
            temp.add(arr[left]);
            left++;
        }

        //  if elements on the right half are still left //
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }

        // transfering all elements from temporary to arr //
        for (long i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return count;
    }

    public static long mergeSort(long[] arr, long low, long high) {
        long count = 0;
        if (low >= high) return count;
        long mid = (low + high) / 2 ;
        count+=mergeSort(arr, low, mid);  // left half
        count+=mergeSort(arr, mid + 1, high); // right half
        count+=merge(arr, low, mid, high);  // merging sorted halves
        return count;
    }
}