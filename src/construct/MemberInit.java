package construct;

public class MemberInit {
    String name;
    int age;
    int grade;

    //this: 자기 자신의 인스턴스를 가리킴
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
