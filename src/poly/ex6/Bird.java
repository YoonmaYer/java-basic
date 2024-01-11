package poly.ex6;

public class Bird extends AbstractAnimal implements Fly {
    //클래스 상속: 1개, 인터페이스 구현: 이론상 무한(암튼 많음)
    @Override
    public void sound() {
        System.out.println("짹짹");
    }

    @Override
    public void fly() {
        System.out.println("새 날기");
    }
}
