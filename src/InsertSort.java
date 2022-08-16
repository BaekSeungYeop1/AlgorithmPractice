import java.util.Arrays;

public class InsertSort {
    public static void main(String args[]){

        int[] array = {1,10,5,8,7,6,4,3,2,9};

        insertSort(array);

        System.out.println(Arrays.toString(array));
    }

    private static void insertSort(int[] array) {

        for(int i = 0; i < array.length; i++){

            int target = array[i];

            int j = i - 1;

            while (j >= 0 &&target < array[j]) {
                array[j+1] = array[j];
                j--;
            }

            array[j + 1] = target;
        }
    }
}
