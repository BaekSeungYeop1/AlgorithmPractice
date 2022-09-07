package Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[]){
        int[] array = {1,10,5,8,7,6,4,3,2,9};

        selectionSort2(array);

        System.out.println(Arrays.toString(array));
    }

    // 최소값
    private static void selectionSort(int[] array) {
        int minIndex; // 가장 작은 원소의 인덱스
        int temp; // 데이터 swap용 임시변수

        for(int i = 0; i<array.length-1; i++){  // 마지막 요소는 자동 정렬됨으로  array.length-1까지 반복
            minIndex = i;
            for(int j = i+1; j<array.length; j++){  // 최솟값 찾기
                if (array[minIndex]>array[j]) {
                    minIndex = j;   // 현재 가장 작은 값보다 작으면 갱신
                }
            }
            temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;

        }
    }
    // 최대값
    private static void selectionSort2(int[] array){
        int maxIndex;
        int temp;

        for(int i = array.length-1; i>0; i--){
            maxIndex = i;
            for (int j = i-1; j>=0; j--){
                if(array[maxIndex]<array[j]){
                    maxIndex = j;
                }
            }
            temp = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = temp;
        }
    }
}
