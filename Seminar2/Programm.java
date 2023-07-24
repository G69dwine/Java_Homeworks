package Homeworks.Seminar2;

public class Programm {
    public static void main(String[] args) {
        int[] arr = Arrays.getArray();
        Arrays.printArray(arr);
        PyramidSort.PyramidSort(arr); 
        Arrays.printArray(arr);
    }
}
