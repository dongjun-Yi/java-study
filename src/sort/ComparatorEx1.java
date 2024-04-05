package sort;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorEx1 {
    public static void main(String[] args) {
        String[] arr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(arr);
        System.out.println("Arr = " + Arrays.toString(arr));

        Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER); // 대소문자 구분 없이 정렬
        System.out.println("Arr = " + Arrays.toString(arr));

        Arrays.sort(arr, new Descending());
        System.out.println("Arr = " + Arrays.toString(arr));

        Arrays.sort(arr, Comparator.reverseOrder()); // 역순 정렬
        System.out.println("Arr = " + Arrays.toString(arr));
    }

    private static class Descending implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return (o1.compareTo(o2) * -1);
        }
    }
}
