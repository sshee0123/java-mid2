package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

/**
 * 요구사항 : 개 병원은 개만 고양이 병원은 고양이만 받을 수 있어야 한다.
 * 문제 :
 *      제네릭에서 타입 매개변수를 사용하면 어떤 타입이든 들어올 수 있다.
 *      타입 매개변수를 어떤 타입이든 수용할 수 있는 Object로 가정하고, Object 의 기능만 사용
 */
public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Integer> integerHospital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objHospital = new AnimalHospitalV2<>();
    }
}
