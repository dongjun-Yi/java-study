package tree;

import java.util.Scanner;

// Trie는 문자열 탐색을 효율적으로 처리하는 자료구조로, Retrieval에서 약자를 뜻한다.
public class Trie {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        tNode root = new tNode();

        while (n > 0) {
            String text = sc.next();
            tNode now = root;
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (now.next[c - 'a'] == null) {
                    now.next[c - 'a'] = new tNode();
                }
                now = now.next[c - 'a'];

                if (i == text.length() - 1) { // 마지막 단어이면 끝문자 flag 표시
                    now.isEnd = true;
                }
            }
            n--;
        }

        int count = 0;

        while (m > 0) {
            String text = sc.next();
            tNode now = root;

            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (now.next[c - 'a'] == null) {
                    break;
                }
                now = now.next[c - 'a'];

                if (i == text.length() - 1 && now.isEnd == true) { // 마지막 단어이면 끝문자 flag 표시
                    count++;
                }
            }
            m--;
        }
        System.out.println(count);

    }
}

class tNode {
    tNode[] next = new tNode[26];
    boolean isEnd;
}