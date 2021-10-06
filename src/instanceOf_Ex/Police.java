package instanceOf_Ex;

public class Police extends Person{
    @Override
    public void work() {
        System.out.println("범인을 잡는다");
    }

    public void shoot() {
        System.out.println("총을 쏘다");
    }
}
