package annotation;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;

@TestInfo(
        testedBy = "aaa",
        testDate = @DateTime(
                yymmdd = "160101",
                hhmmss = "235959"
        )
)
public class AnnotationEx {
    public static void main(String[] args) {
        Class<AnnotationEx> cls = AnnotationEx.class;
        TestInfo anno = cls.getAnnotation(TestInfo.class);

        System.out.println(anno.testedBy());
        System.out.println(anno.testDate().yymmdd());

        for (String str : anno.testTools())
            System.out.println(str);

        Annotation[] annotations = cls.getAnnotations();

        for (Annotation a : annotations)
            System.out.println(a);
    }
}

@Retention(RetentionPolicy.RUNTIME)
@interface TestInfo {
    int count() default 1;

    String testedBy();

    String[] testTools() default "JUNIT";

    TestType testType() default TestType.FIRST;

    DateTime testDate();
}

@Retention(RetentionPolicy.RUNTIME)
@interface DateTime {
    String yymmdd();

    String hhmmss();
}

enum TestType {FIRST, FINAL}


