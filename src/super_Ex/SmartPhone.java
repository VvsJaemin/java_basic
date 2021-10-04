package super_Ex;

public class SmartPhone extends Phone{
    public void setApp(String name) {
        if (this.power) {
            System.out.println(name + "설치 중");
        }
    }

    public static void main(String[] args) {
        SmartPhone sm = new SmartPhone();
        sm.power();
        sm.setApp("으아");
    }
}
