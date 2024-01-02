package static1;

public class Data3 {
    public String name;
    public static int count; //static 변수, 정적 변수, 클래스 변수

    //객체가 생성되면 생성자에서 정적 변수 count의 값을 하나 증가시킴
    public Data3(String name) {
        this.name = name;
        count++;
    }
}
