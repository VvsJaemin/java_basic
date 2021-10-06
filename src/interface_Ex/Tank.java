package interface_Ex;

public class Tank extends Unit{

    @Override
    public void attack() {
        System.out.println("대포를 쏜다");
    }

    public void changeMode() {
        System.out.println("모드 변경");
    }
}
