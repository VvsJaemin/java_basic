package wrapper_Ex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
        // 컬렉션 기본 API
        // 자료구조(ex:배열)를 다루기 편하도록 제공되는 기본 API
        // List, Set, Map - 인터페이스
        // ArrayList, HashSet, HashMap - List, Set, Map인터페이스를 구현한 클래스 구현체
        ArrayList list = new ArrayList(); // ArrayList<Object> list = new ArrayList<Object>();
        // 오버젝트의 동적배열 -> 모든 참조타입의 배열이 될 수 있다. -> 참조타입의 다형성 때문에 -> 하지만 매번 형변환같은 연산필요
        // -> 그런데 기본타입을 사용하고자 하면? -> 랩퍼타입을 사용

        // <> : 제네릭 문법 -> ArrayList의 타입을 강제화 -> 매번 형변환 같은 연산 필요X
        ArrayList<String> list2 = new ArrayList<>();
        LinkedList<String> list3 = new LinkedList<>();

        // 왼쪽 변수를 부모타입(interface)으로 해서 설계(코드)의 유연성 <- 다형성
        List<String> result = list2; //List<String> result = list3;

    }
}
