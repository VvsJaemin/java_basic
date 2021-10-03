package class_Ex;
// 1) 데이터 명세서 + 2) 메서드 컨테이너 역할
// 클래스역할 1)+2)
public class Car {
    //필더

    public String company;
    public String name;
    public int cc;
    public String type;

    public void on() {
        System.out.println("시동키기");
    }

    public void off() {
        System.out.println("시동끄기");
    }

    public void go() {
        System.out.println("전진");
    }

    public void back() {
        System.out.println("후진");
    }
}
