package super_Ex;

public class SmartCar2 {
    public Car car;

    public void selfDrive() {
        System.out.println("자율 주행");
    }

    public static void main(String[] args) {
        SmartCar2 sm2 = new SmartCar2();
        sm2.car = new Car(); // 포함 관계에선 Car 객체 생성이 필요
        sm2.car.name = "그랜즈";
        sm2.car.color = "black";
        sm2.car.cc = 3000;
        System.out.println(sm2.car.cc);
    }
}
