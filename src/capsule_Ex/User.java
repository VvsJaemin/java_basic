package capsule_Ex;

public class User {
    private String sn; // 주민번호 : 읽기가능, 쓰기
    private String alias; // 별명 : 읽기, 쓰기 가능 but VO 필드는 무조건 private 규칙
    private int num; // 읽기 쓰기 가능

    // 메서드를 정보은닉 -> 캡슐화-> 무조건 한글먼저고 두개의 메서드 실행

    private void studyKor() {
        System.out.println("한글공부");
    }

    private void studyEng() {
        System.out.println("영어공부");
    }

    // 메서드 호출하는 캡슐화메서드
    public void study() {
        this.studyKor();
        this.studyEng();
    }

    public int getNum() {
        return num;
    }

    // 캡슐화 메서드를 통해 값을 제한

    public void setNum(int num) {
        if (num < 0 || num > 100) {
            this.num = 0;
        } else {
            this.num = num;
        }
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getSn() {
        return sn;
    }

    // 생성자에서 sn 수정 가능하도록 캡슐화

    public User(String sn) {
        this.sn = sn;
    }

    public User() {

    }
}
