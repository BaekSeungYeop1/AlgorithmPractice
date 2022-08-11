import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[]){
        int[] array = {1,10,5,8,7,6,4,3,2,9};

        selectionSort(array);

        System.out.println(Arrays.toString(array));
    }

    private static void selectionSort(int[] array) {
        int min;
        int temp;

        for(int i = 0; i<array.length-1; i++){
            min = i;
            for(int j = i+1; j<array.length; j++){
                if (array[min]>array[j]) {
                    min = j;
                }
            }
            temp = array[min];
            array[min] = array[i];
            array[i] = temp;

        }
    }
}
