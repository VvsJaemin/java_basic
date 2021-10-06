package interface_Ex;

import super_Ex.A;

public class AutoBike extends Bike{

    public boolean power;

    public AutoBike(int wheel) {
        super(wheel);
    }

    public void power() {
        power = !power;
        if (power) {
            System.out.println("전원이 켜졌습니다.");
        }else{
            System.out.println("전원이 꺼졌습니다.");
        }
    }

    public static void main(String[] args) {
        AutoBike ab1 = new AutoBike(2);

        ab1.power();
        ab1.drive();
        System.out.println(ab1.wheel+"자전거");

        ab1.stop();

        Bike b = null;
        b = ab1;
        b.drive();

        AutoBike ab2 = null;
        ab2 = (AutoBike)b;
        ab2.power();
        ab2.drive();
        ab2.stop();
    }
}
