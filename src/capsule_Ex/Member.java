package capsule_Ex;

// 정보은닉 : private 접근제한자를 활용
public class Member {
    private String name;
    public String alias;

    public Member(String name, String alias) {
        this.name = name;
        this.alias = alias;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
