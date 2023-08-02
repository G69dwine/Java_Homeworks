package Seminar2;

import java.util.Random;

public class Arrays {
    private static Random random = new Random();
    
    public static int[] getArray(){
        return getArray(random.nextInt(10,15));
    }

    public static int[] getArray(int length){
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(-99, 100);
        }
    return arr;
    }
    
    public static void printArray(int[] array){
        for (int element : array){
            System.out.printf("%d\t", element);
        }
    System.out.println();
    }
}
