package generics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListGenericsTest {

    @Test
    @DisplayName("Non Generic 타입으로 잘못 형변환하여 데이터를 조회할 시 ClassCastException이 발생한다.")
    void NonGenericGetDataTest() {
        List list = new LinkedList();

        list.add("abc");

        assertThrows(ClassCastException.class, () -> {
            Integer i = (Integer) list.get(0);
        });
    }

    @Test
    @DisplayName("Generic을 사용한 데이터 조회")
    void GenericsTest() {
        List<String> list = new LinkedList();
        list.add("abc");

        String getString = list.get(0);

        Assertions.assertEquals(getString, "abc");
    }

}