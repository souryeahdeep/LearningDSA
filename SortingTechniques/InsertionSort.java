package SortingMethod;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 2, 3, 1};
        InsertionSort list = new InsertionSort();
        list.sort(arr);//T.C = O(n^2)
        System.out.println(Arrays.toString(arr));
    }

    private void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}
