package SortingMethod;

import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        QuickSort list = new QuickSort();
        list.quickSort(arr, 0, arr.length - 1);//T.C = O(n^2)
        System.out.println(Arrays.toString(arr));
    }

    void quickSort(int[] arr, int st, int ls) {
        if (st >= ls) {
            return;
        }
        int pivot = arr[ls];
        int s = st, e = ls;
        while (s <= e) {
            while (pivot > arr[s]) {
                s++;
            }
            while (pivot < arr[e]) {
                e--;
            }

            if (s <= e) {
                int t = arr[s];
                arr[s] = arr[e];
                arr[e] = t;
                s++;
                e--;
            }
        }
        quickSort(arr, st, e);
        quickSort(arr, s, ls);


    }
}
