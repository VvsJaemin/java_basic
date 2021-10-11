package lambda_Ex;

public class App2 {
    public static void main(String[] args) {
        // 람다 적용전
        Z z = new Z();

        z.test(new I() {
            @Override
            public void play() {
                System.out.println("play");
            }
        });

        z.test(() -> System.out.println("play"));
    }
}

class Z{
    public void test(I i) {
        i.play();
    }
}
// 람다를 참조하는 데이터 타입
@FunctionalInterface
interface I{
    void play();
}
