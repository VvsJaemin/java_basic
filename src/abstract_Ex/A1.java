package abstract_Ex;

public class A1 extends CA{
    @Override
    public void play() {
        System.out.println("A1 play");
    }

    public static void main(String[] args) {
        CA a1 = new A1(); //다형성
        a1.play();
    }
}
