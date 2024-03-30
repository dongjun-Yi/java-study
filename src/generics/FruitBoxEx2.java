package generics;

import java.util.ArrayList;

public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox();
        //FruitBox<Object> fruitBox1 = new FruitBox(); => 지네릭 클래스의 타입을 제한함. 타입을 제한하여 타입을 정확하게 명시할 수 있음.
        // FruitBox<T extends Fruit> => Object는 Fruit의 조상이므로 불가

        FruitBox<Apple> appleBox = new FruitBox();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

        appleBox.add(new Apple());

        System.out.println("fruitbox : " + fruitBox);
        System.out.println("appleBox : " + appleBox);
    }

    static class Fruit implements Eatable {
        @Override
        public String toString() {
            return "Fruit";
        }
    }

    interface Eatable {
    }

    static class Apple extends Fruit {
        @Override
        public String toString() {
            return "Apple";
        }
    }

    static class Grape extends Fruit {
        @Override
        public String toString() {
            return "Grape";
        }
    }

    static class Toy {
        @Override
        public String toString() {
            return "Toy";
        }
    }

    static class FruitBox<T extends Fruit & Eatable> extends Box<T> {

    }

    static class Box<T> {
        ArrayList<T> list = new ArrayList();

        void add(T item) {
            list.add(item);
        }

        T get(int i) {
            return list.get(i);
        }

        int size() {
            return list.size();
        }

        @Override
        public String toString() {
            return list.toString();
        }
    }
}
