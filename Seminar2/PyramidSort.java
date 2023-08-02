package Seminar2;

public class PyramidSort {
    public static void PyramidSort(int[] arr){
        for (int i = arr.length/2-1; i>=0; i--){
            PyramidSort(arr, arr.length, i);
        }
        for (int i = arr.length-1; i>=0; i--){
            int temp = arr[0];
            arr[0] =  arr[i];
            arr[i] = temp;
            PyramidSort(arr, i, 0);
        }
    }

    private static void PyramidSort(int[] arr, int n, int i){
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left < n && arr[left] > arr[largest])
            largest = left;
        if (right < n && arr[right] > arr[largest])
            largest = right;
        if (largest != i){
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            PyramidSort(arr, n, largest);
        }
    }

    public static void printArray(int[] arr){
        for (int i=0; i< arr.length; i++)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
}
