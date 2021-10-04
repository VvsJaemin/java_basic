package super_Ex;

public class SmartCar1 {
    public  String name;
    public String color;

    public void drive() {
        System.out.println("주행");
    }

    public void selfDrive() {
        System.out.println("자율 주행");
    }

    public static void main(String[] args) {
        SmartCar1 sm1 = new SmartCar1();
        sm1.name = "그랜즈";
        sm1.color = "black";
    }
}
