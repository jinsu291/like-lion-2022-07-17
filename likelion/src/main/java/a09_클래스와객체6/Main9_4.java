package a09_클래스와객체6;

public class Main9_4 {
    public static void main(String[] args) {
        // `class 칼 extends 무기 { }` 의 의미 설명
        // 무기 리모콘의 버튼은 1개이다.
        // 칼 리모콘의 버튼은 2개이다.
        // 무기 클래스에 메서드 3개를 더 넣으면 무기 리모콘의 버튼은 4개가 되고 칼 리모콘의 버튼은 5개가 된다.
        // 칼 리모콘의 버튼 개수는 절대 무기 리모콘의 버튼 개수 보다 적을 수 없다.
        // 다시 말하면 칼 리모콘을 무기 리모콘 으로 바꿀 때 해야할 일은 오직 버튼을 제거하는 일 밖에 없다.
        // 하나의 리모콘을 다른 하나의 리모콘으로 바꾼다는 것은 결국 특정 버튼들을 제거하고, 특정 버튼들을 추가하는 일이다.
        // 버튼을 제거하는 일은 좀 더 불편해지는 일이지만 문제가 되진 않는다. 즉 안전한다.
        // 버튼을 추가하는 일은 좀 더 편리해지는 일이지만 문제가 될 가능성이 다분히 높다. 즉 안전하지 않다.
        // 자바에서는 안전한 일은 자동으로 해주고, 안전하지 않은 일은 개발자의 동의를 받는다.
    }

    static class 무기 {
        void 공격() { }
    }

    class 칼 extends 무기 {
        void 사과껍질제거() {

        }
    }
}
