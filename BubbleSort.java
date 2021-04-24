package Sorting;

public class BubbleSort {
    

    private static boolean more(int value1, int value2) {
        return value1 > value2;
    }

    public static void sort(int[] arr) {
        int size = arr.length;

        int i, j, temp;
        for (i = 0; i < (size - 1); i++) {
            for (j = 0; j < size - i - 1; j++) {
                if (more(arr[j], arr[j + 1])) {
                    /* Swapping */
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    
    public static void main(String[] args) {
        int[] array = { 9, 1, 8, 2, 7, 3, 6, 4, 5 };
        BubbleSort.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        
    }
}