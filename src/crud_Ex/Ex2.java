package crud_Ex;

import java.util.ArrayList;
import java.util.Collections;

public class Ex2 {
    public static void main(String[] args) {
        ArrayList<Integer> ball = new ArrayList<>();
        for (int i = 1; i <= 45; i++) {
            ball.add(i);
            // 랩퍼 타입(박싱타입) 자리에 기본타입(값타입)을 사용가능 -> 오토박싱
            // 기본타입 -> 랩퍼타입 -> 오토 언박싱
        }
        System.out.println(ball);
        //ArrayList는 참조타입이라 참조값이 출력되어야 하지만, 자주사용하는 데이터타입이라
        //ArrayList<랩퍼타입>이 오는경우는 실제 참조값이 가리키는 데이터값들을 출력해준다.
        Collections.shuffle(ball);
        System.out.println(ball);
    }
}
