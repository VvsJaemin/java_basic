package class_Ex;

public class CarMain {
    public static void main(String[] args) {
        CarData car1 = new CarData();
        car1.company = "현대";
        car1.name = "아이오닉5";
        car1.cc = 3000;
        car1.type = "전기차";
        System.out.println(car1.name);

        CarFunction car2 = new CarFunction();
        car2.on();
        car2.off();
        car2.go();
        car2.back();

        Car car3 = new Car();
        car3.name = "K3";
        System.out.println(car3.name);
        car3.go();
    }
}
