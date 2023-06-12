import java.util.*;
public class ReversePairs {
    private static int merge(int[] arr, int low, int mid, int high) {
        int count=0;
        int j = mid + 1; 
        for(int i = low;i<=mid;i++) {
            while(j<=high && arr[i] > (2 * (long) arr[j])) {
                j++;
            }
            count += (j - (mid+1));
        }

        ArrayList<Integer> temp = new ArrayList<>(); // temporary array
        int left = low;      // starting index of left half of arr
        int right = mid + 1;   // starting index of right half of arr

        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

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
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
        return count;
    }

    public static int mergeSort(int[] arr, int low, int high) {
        int count = 0;
        if (low >= high) return 0 ;
        int mid = (low + high) / 2 ;
        count+= mergeSort(arr, low, mid);  // left half
        count+=mergeSort(arr, mid + 1, high); // right half
        count+=merge(arr, low, mid, high);  // merging sorted halves
        return count;
    }

    public static int reversePairs(int arr[]){
        return mergeSort(arr,0,arr.length-1);
    }
}