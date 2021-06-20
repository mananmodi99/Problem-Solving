package TimeandSpaceComplexity;
import java.util.*;

public class RandomizedQS {
    public static void swap(int arr[], int one, int two){
        int temp = arr[one];
        arr[one] = arr[two];
        arr[two] = temp;
    }
    public static void partition_r(int arr[], int lo, int hi){
        Random rand = new Random();
        int pivot = rand.nextInt(hi-lo)+lo;
        int temp1=arr[pivot];
        arr[pivot]=arr[hi];
        arr[hi]=temp1;
    }
    public static int Partitioning(int[] arr, int lo, int hi) {
        partition_r(arr, lo ,hi);
        int pivot = arr[hi];
        int i = lo - 1;
        for (int j = lo; j < hi; j++)
            {
                if (arr[j] < pivot) {
                    i++;
                    swap(arr, i, j);
                }
            }
        swap(arr, i + 1, hi);
        return i+1;
    }
    public static void QuickSort(int[] arr, int lo, int hi){
        if(lo<hi){
            int right = Partitioning(arr, lo, hi);
            QuickSort(arr, lo, right-1);
            QuickSort(arr,right+1, hi);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,4,6,2,5};
        int lo=0, hi=arr.length-1;
        QuickSort(arr, lo, hi);
        for (int i:arr) {
            System.out.print(i + " ");
        }
    }
}
