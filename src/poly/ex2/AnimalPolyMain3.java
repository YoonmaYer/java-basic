package poly.ex2;
public class AnimalPolyMain3 {
    public static void main(String[] args) {

        //Animal 타입의 배열을 만들고 다형적 참조를 사용
        Animal[] animalArr = {new Dog(), new Cat(), new Cow()};

        //동물이 추가 되더라도 코드의 변경이 필요없다.
        for (Animal animal : animalArr) {
            soundAnimal(animal);
        }
    }

    //동물이 추가 되더라도 코드의 변경이 필요없다.
    private static void soundAnimal(Animal animal) {
        System.out.println("동물 소리 테스트 시작");
        animal.sound();
        System.out.println("동물 소리 테스트 종료");
    }
}
