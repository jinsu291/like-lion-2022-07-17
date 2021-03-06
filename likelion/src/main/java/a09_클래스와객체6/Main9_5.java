package a09_클래스와객체6;

// 문제 : `무기 a무기 = new 칼();` 가 실행되는 세부과정을 자세히 쓰세요.


public class Main9_5 {
    public static void main(String[] args) {
        // 설명 v1
        // 01. 오직 객체만 살 수 있는 메모리 구역(힙)에 `칼` 클래스를 사용해서 객체를 하나 생성합니다.
        // 02. 막 태어난 칼 객체는 내부에 자기자신을 조종할 수 있는 리모콘(this)를 가지고 태어납니다.
        // 03. 이 상태는 현재 오직 칼 객체만 자신을 조종 할 수 있는 상태입니다.
        // 04. 칼 객체는 this 리모콘을 복사하여 돌려줍니다.(일종의 리턴)
        // 05. 무기 클래스로 변수 `a무기` 를 만든다.
        // ps. a무기 변수에는 오직 무기를 조종 할 수 있는 리모콘만 들어갈 수 있다.
        // ps. a무기는 태어나자마자 쓰레기 리모콘을 가지고 있다.
        // ps. 쓰레기 리모콘은 객체와 연결되어 있지 않은 리모콘을 말한다.
        // 06. 칼 객체 리모콘이 오직 무기 리모콘만 들어갈 수 있는 `a무기`에 들어가려 시도 한다.
        // 07. a무기 변수는 칼 객체 리모콘에게 묻는다. "당신은 무기 리모콘 입니까?"
        // 08. 칼 리모콘은 자신이 가리키고 있는 대상이 무기인지 자문해본다. 그리고는 `아니!` 라고 응답한다.
        // 09. a무기 리모콘은 다시 묻는다. "니가 비록 무기리모콘은 아니지만 혹시 무기리모콘으로 변신할 의향이 있니?"
        // 10. 칼 리모콘이 대답을 합니다. "그건 불가능 합니다. 왜냐하면 칼과 무기는 호환되지 않거든.."
        // 11. 호환되지 않는 타입에러 가 발생한다.
        // 에러 이유 : `칼은 무기이다.`는 틀린 명제이기 때문에...

        // 설명 v2(호환되는 경우, 칼 클래스가 무기 클래스를 상속 받았을 경의 설명)
        // 01. 칼 클래스로 힙이라는 영역에 객체가 생성된다. => 칼 객체 생성
        // 02. 칼 객체를 조종할 수 있는 리모콘이 칼 객체 내부에 생성된다. => 칼 리모콘 생성
        // 03. `new 칼();` 가 실행되면 그것은 사라지고 우리에게 칼 리모콘을 돌려준다. => `new 칼();` 코드가 `칼 리모콘`으로 변신한다. 즉 그 자리에 `칼 리모콘만 남는다.`
        // 04. 오직 무기리모콘만 저장 할 수 있는 변수 `a무기`가 만들어진다.
        // 05. 오직 무기리모콘만 저장 할 수 있는 `a무기`는 칼 리모콘을 넣을 수 있는지 체크한다. => 불가능
        // 06. 칼 리모콘이 무기 리모콘으로 바뀔 수 있는지 또는 바뀌어도 문제가 없는지 체크한다. => 가능, 이유 : 무기 클래스에 있는 모든 버튼에 대응하는 기능이 칼 객체에 절대적으로 없을 수 가 없다.
        // 07. 칼 리모콘이 무기 리모콘으로 변신해서 `a무기`로 들어간다.
        무기 a무기 = new 칼();
    }

    static class 무기 {
    }

    static class 칼 extends 무기{
    }
}
