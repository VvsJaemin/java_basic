package interface_Ex;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Tank t = new Tank();
        t.attack();
        t.changeMode();

        Marine m = new Marine();
        m.attack();

        // 다형성 : 부모타입으로 자식객체 참조

        Unit u1 = new Tank();
        u1.attack();

        Unit u2 = new Tank();
        u2.attack();

        // 다른 타입의 유닛을 다형성을 이용하여 하나의 그룹으로 지정 가능
        ArrayList<Unit> list = new ArrayList<>();

        list.add(new Tank());
        list.add(new Marine());
        list.add(new Tank());

        for (Unit u : list) {
            u.attack();
        }


    }
}
