package sort;

import java.util.Arrays;

public class InsertionSort {
    // 삽입 정렬은 정렬된 부분과 정렬되지 않은 두 부분으로 나뉘어 정렬을 진행한다.
    // 정렬되지 않은 부분 중 첫번째 원소를 정렬되지 않은 부분의 원소 수열에서 알맞은 위치에 삽입하여 정렬을 진행합니다.
    // 선택 정렬은 그래서 위의 정렬 기준을 토대로 시간복잡도로 나타내면 최악의 경우 O(n^2)이지만 만약에 배열이 이미 정렬되어 있는 상태에서 진행하면
    // 최선의 경우 O(n)의 시간복잡도가 나오게 된다.
    public static void main(String[] args) {
        int[] arr = {8, 9, 4, 2, 1};

        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
