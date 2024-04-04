package stringtokenizer;

import java.util.StringTokenizer;

public class StringTokenizerEx1 {
    public static void main(String[] args) {
        String source = "100,200,300,400";
        StringTokenizer s = new StringTokenizer(source, ",");

        while (s.hasMoreTokens())
            System.out.println(s.nextToken());
    }
}
