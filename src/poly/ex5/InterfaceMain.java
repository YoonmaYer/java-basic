package poly.ex5;

import poly.ex4.AbstractAnimal;

public class InterfaceMain {
    public static void main(String[] args) {
        //인터페이스 = 빈 껍데기, 순수 추상 클래스
        //인터페이스 = 완전 추상화라 인스턴스 생성 불가
        //InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

        Dog dog = new Dog();
        Cat cat = new Cat();
        Caw caw = new Caw();

        soundAnimal(cat);
        soundAnimal(caw);
        soundAnimal(dog);

        moveAnimal(cat);
        moveAnimal(caw);
        moveAnimal(dog);
    }

    //동물이 추가 되어도 변하지 않는 코드
    private static void soundAnimal(InterfaceAnimal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }

    //동물이 추가 되어도 변하지 않는 코드
    private static void moveAnimal(InterfaceAnimal animal) {
        System.out.println("동물 이동 테스트 시작");
        animal.move();
        System.out.println("동물 이동 테스트 종료");
    }
}
