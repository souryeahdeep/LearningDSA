    package SortingMethod;

    import java.util.Arrays;

    //Sorts an array
    public class SelectionSort {
        public static void main(String[] args) {
            int[] arr = {2, 5, 3, 1, 4};
            SelectionSort list = new SelectionSort();
            list.sort(arr);//T.C = O(n^2)
            System.out.println(Arrays.toString(arr));
        }

        private void sort(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                int curr = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[curr]) {
                        curr = j;
                    }
                }
                int temp = arr[i];
                arr[i] = arr[curr];
                arr[curr] = temp;
            }
        }

    }
