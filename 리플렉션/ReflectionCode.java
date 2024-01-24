package reflection;


import java.lang.reflect.Field;

class MyClass {
    private final String name = "홍길동";
}

public class ReflectionCode {
    public static void main(String[] args) throws Exception {

        // 1. 클래스 리터럴 방법으로 클래스 접근
        Class<MyClass> clazz = MyClass.class;
        Field declaredField = clazz.getDeclaredField("name");

        // 2. 객체에 getClass()를 통해 클래스 접근
        MyClass obj = new MyClass();
        Class<? extends MyClass> clazz2 = obj.getClass();

        // 3. 패키지 경로로 클래스 접근
        final Class<?> clazz3 = Class.forName("reflection.ReflectionCode");
        System.out.println(clazz3);

    }
}
