import java.util.Arrays;

public class BubbleSort {
    public static void main(String args[]){
        int[] array = {1,10,5,8,7,6,4,3,2,9};

        bubbleSort(array);

        System.out.println(Arrays.toString(array));
    }

    private static void bubbleSort(int[] array) {
        int temp;
        for(int i=1; i<array.length; i++){  // 배열 크기의 -1만큼 진행
            for(int j=0; j< array.length-i; j++ ){  // 뒤에서부터 정렬되기 때문에 한번씩 줄면서 비교
                if(array[j]>array[j+1]){
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }
}
