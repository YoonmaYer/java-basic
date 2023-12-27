package class1;

public class ClassStart5 {
    //클래스: 설계도
    //인스턴스: 설계도를 기반으로 실제 메모리에 만들어진 실체, 객체라고도 함.
    public static void main(String[] args) {
        Student student1; //Student 타입을 받을 수 있는 변수 선언
        student1 = new Student(); //설계도인 클래스의 정보를 기반으로 인스턴스(객체) 생성
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        //자바에서 대입은 항상 변수에 들어 있는 값을 복사해서 전달한다
        Student[] students = new Student[]{student1, student2};
        //Student[] students =  {student1, student2};

        for (int i = 0; i < students.length; i++) {
            System.out.println("이름:" + students[i].name + " 나이:" + students[i].age + " 성적:" + students[i].grade);
        }
        for (int i = 0; i < students.length; i++) {
            Student s = students[i];
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }
        for (Student s : students) {
            System.out.println("이름:" + s.name + " 나이:" + s.age + " 성적:" + s.grade);
        }


    }
}
