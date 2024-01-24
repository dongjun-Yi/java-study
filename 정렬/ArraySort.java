package comparable;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ArraySort {
    public static void main(String[] args) {
        // 오름차순 정렬
        int[] arr1 = {1, 26, 17, 25, 99, 44, 203};
        Arrays.sort(arr1);

        // 내림차순 정렬
        Integer[] arr2 = {1, 26, 17, 25, 99, 44, 203};
        Arrays.sort(arr2, Collections.reverseOrder());

        //내림차순 직접 구현
        Integer[] arr3 = {1, 26, 17, 25, 99, 44, 203};
        Arrays.sort(arr3, new Comparator<Integer>() {
            @Override
            public int compare(Integer i1, Integer i2) {
                return i2 - i1;
            }
        });

        //내림차순 Lambda로 구현
        Integer[] arr4 = {1, 26, 17, 25, 99, 44, 203};
        Arrays.sort(arr4, (i1, i2) -> i2 - i1);

        System.out.println("arr[] = " + Arrays.toString(arr1));
        System.out.println("arr[] = " + Arrays.toString(arr2));
        System.out.println("arr[] = " + Arrays.toString(arr3));
        System.out.println("arr[] = " + Arrays.toString(arr4));

    }
}
