package variable;

public class Main {
  public static void main(String[] args) {
    Test t = new Test();
    t.test();
  }
}

class Test {
  // instance variable a
  boolean a;
  // class variable c
  static boolean c;

  void test() {
    System.out.println(a); // false 출력
    System.out.println(c);
    // local variable b
    boolean b;
    // System.out.println(b); // error: variable b might not have been initialized
  }
}

// instance, class 변수는 선언이 되면 자동으로 초기화가 되지만, 지역변수는 자동으로 초기화되지 않는다.
// 지역변수 초기화를 하지않고 지역변수에 접근하면 error: variable b might not have been initialized 오류 발생