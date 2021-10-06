package interface_Ex;

public class A2 implements IA{
    @Override
    public void play() {
        System.out.println("A2 play");
    }

    public static void main(String[] args) {
        IA a2 = new A2(); // 다형성
        a2.play();
    }
}
