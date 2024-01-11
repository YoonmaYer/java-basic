package poly.ex4;

//추상 메서드가 하나라도 있는 클래스는 추상 클래스로 선언해야 한다.
public abstract class AbstractAnimal {
    //추상 메서드는 상속 받는 자식 클래스가 반드시 오버라이딩 해서 사용하여야 한다.
    public abstract void sound();
    //클래스 내의 메서드가 모두 추상 메서드이면 순수 추상 클래스라고 한다.
    public abstract void move();
}
