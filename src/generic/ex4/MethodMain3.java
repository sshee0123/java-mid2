package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain3 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("야옹이", 30);

        ComplexBox<Dog> hospital = new ComplexBox<>();
        hospital.set(dog);

        Cat returnCat = hospital.printAndReturn(cat);
        System.out.println("returnCat = " + returnCat);

    }
}

/**
 * animal.className: class generic.animal.Dog
 * t.className: generic.animal.Cat
 * returnCat = Animal{name='야옹이', size=30}
 */