package stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerEx5 {
    public static void main(String[] args) {
        String data = "100,,,200,300";
        String[] result = data.split(",");

        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + ", ");
        }
        System.out.println();
        System.out.println("======");

        StringTokenizer st = new StringTokenizer(data, ",");

        for (int i = 0; st.hasMoreTokens(); i++) {
            System.out.print(st.nextToken() + ", ");
        }
    }
}
