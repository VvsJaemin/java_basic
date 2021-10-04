package capsule_Ex;


public class Ex1 {
    public static void main(String[] args) {
       // 참조타입 생성시 필드 값은 자동으로 초기화
        // 필드가 참조타입이면 null
        // 필드가 숫자값타입이면 0, boolean false 초기화

        Member m = new Member();

        System.out.println(m.alias);

        m.alias = "자바";
        m.alias = "으아";

        System.out.println(m.alias);

        // 정보은닉으로 외부에서 쓰기를 막았으나 읽기까지 막혀버림
    }
}
