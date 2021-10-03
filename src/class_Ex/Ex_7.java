package class_Ex;

public class Ex_7 {
    public static void main(String[] args) {
        // 클래스의 객체 역할
        // 1) 데이터
        // 2) 메서드의 컨테이너

        Function f = new Function();
        f.test();

        String str = f.greet();
        System.out.println(str);

        int result = f.add(10, 20);
        System.out.println(result);

        Function.hi();
    }
}
