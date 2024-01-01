package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        //필드에 직접 접근
        System.out.println("volume 필드 직접 접근 수정");
        // speaker.volume = 200; 접근이 불가능하기 때문에(private) 컴파일 에러
        // 좋은 프로그램은 무한한 자유도가 주어지는 것이 아닌 적절한 제약이 필요하다.
        speaker.showVolume();
    }
}
