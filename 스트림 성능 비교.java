package variable;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class StreamPractice {


    public static void main(String[] args) {
        String[] strArr = {"aaa", "ddd", "ccc"};
        List<String> strList = Arrays.asList(strArr);

        // 스트림 생성
        Stream<String> stream1 = strList.stream();
        Stream<String> stream2 = Arrays.stream(strArr);

        // 스트림 정렬후 출력
        long start1 = System.currentTimeMillis();
        stream1.sorted().forEach(System.out::println);
        stream2.sorted().forEach(System.out::println);
        long end1 = System.currentTimeMillis();

        long time1 = end1 - start1;
        System.out.println("걸린 시간 : " + time1); // 7


        System.out.println("----------");

        // 스트림 사용 하지 않고 정렬 후 출력
        long start2 = System.currentTimeMillis();
        Arrays.sort(strArr);
        Collections.sort(strList);

        for (String str : strArr)
            System.out.println(str);

        for (String str : strList)
            System.out.println(str);

        long end2 = System.currentTimeMillis();
        long time2 = end2 - start2;

        System.out.println("걸린 시간 : " + time2); // 0
        //스트림으로 변환해서 출력하는 방법보다 스트림을 사용하지 않고 출력하는게 빠름
    }
}
