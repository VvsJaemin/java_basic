package instanceOf_Ex;

public class Ex1 {
    public static void main(String[] args) {
        Police police = new Police();
        police.work();

        // 부모타입 <- 자식 객체 타입 : 다형성
        Person p = new Police();
        p.work();

        if (p instanceof Police == true) {
            ((Police)p).shoot();
        }

        Person p2 = new Doctor();
        p2.work();

        if (p2 instanceof Police == true) {
            ((Police)p2).shoot();
        }else{
            System.out.println("강제 형변환 할 수 없습니다.");
        }

        // 예외처리
        try {
            ((Police) p2).shoot();
        } catch (ClassCastException e) {
            System.out.println("강체 형변환 할 수 없습니다.");
        }
    }
}
