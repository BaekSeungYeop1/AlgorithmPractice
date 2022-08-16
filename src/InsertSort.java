import java.util.Arrays;

public class InsertSort {
    public static void main(String args[]){

        int[] array = {1,10,5,8,7,6,4,3,2,9};

        insertSort(array);

        System.out.println(Arrays.toString(array));
    }

    private static void insertSort(int[] array) {

        for(int i = 0; i < array.length; i++){

            int target = array[i]; // 타겟

            int j = i - 1;  // 비고할 대상

            // 타겟이 이전 원소보다 크기가 작을때까지 반복
            while (j >= 0 &&target < array[j]) {
                array[j+1] = array[j];  // 비교 대상이 큰 경우 오른쪽으로 밀어냄
                j--;
            }

            array[j + 1] = target; // 타겟값 저장
        }
    }
}
