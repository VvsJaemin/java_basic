package capsule_Ex;

public class MainUser {
    public static void main(String[] args) {
        // u1.sn --> "8012251234567"
        User u1 = new User("8012251234567");
        // u2.sn --> "8101011234567"
        User u2 = new User("8101011234567");

        // 주민번호 읽기 캡슐화된 메서드 호출(쓰기는 안됨)
        System.out.println(u1.getSn());
        System.out.println(u2.getSn());


        // 별명 읽기/쓰기 캡슐화된 메서드 호출
        u1.setAlias("몽키");
        System.out.println(u1.getAlias());

        //
        u1.setNum(17);
        System.out.println(u1.getNum()); // 17
        u1.setNum(400);
        System.out.println(u1.getNum()); // 0

        // u1.studyEng();
        // u1.studyKor();
        u1.study();
    }
}
