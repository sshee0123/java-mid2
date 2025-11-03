package generic.ex1;

public class RowTypeMain {

    public static void main(String[] args) {

        //<>을 지정하지 않을 수 있는데, 이를 로 타입 (row type) 또는 원시타입 이라한다.
        // 지정하지 않으면 매개변수가 Object 로 사용된다고 이해
        GenericBox integerBox = new GenericBox();
        // GenericBox<Object> integerBox = new GenericBox<>(); // 권장
        integerBox.set(10);
        Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}
