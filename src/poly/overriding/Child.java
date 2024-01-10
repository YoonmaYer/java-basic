package poly.overriding;

public class Child extends Parent{

    public String value = "child";

    //메서드 재정의(Overriding)
    @Override
    public void method() {
        System.out.println("Child.method");
    }
}
