package Math;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {
    static int k; //뽑아야 하는 개수
    static int[] num; //뽑은 순열을 저장하는 배열

    static ArrayList<int[]> result = new ArrayList(); // 모든 경우의수 결과 담을 배열.
    static int[] arr; // 뽑을 숫자가 담긴 배열
    static boolean[] visited; // 숫자 처리 배열.

    public static void main(String[] args) {
        int n = arr.length;
        arr = new int[]{1, 2, 3, 4, 5};

        k = 3;
        num = new int[k];
        visited = new boolean[n];

        permutation(0);

        System.out.println("==== num 배열 출력 ====");

        for (int[] a : result) {
            System.out.println(Arrays.toString(a));
        }
    }

    static void permutation(int level) {
        if (level == k) {
            int[] temp = new int[k];
            for (int i = 0; i < k; i++) {
                temp[i] = num[i];
            }
            result.add(temp);
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                num[level] = arr[i];
                visited[i] = true;
                permutation(level + 1);
                visited[i] = false;
            }
        }
    }
}
