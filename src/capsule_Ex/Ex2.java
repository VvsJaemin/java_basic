package capsule_Ex;

public class Ex2 {
    public static void main(String[] args) {
        Member m = new Member("샹크스", "빨간머리");
        System.out.println(m.getName());
        System.out.println(m.getAlias());

        m.setAlias("사황빨간머리");
        System.out.println(m.getAlias());
    }
}
