package interface_Ex;

public class Bike {
    public int wheel;

    public Bike(int wheel) {
        this.wheel = wheel;
    }

    public void drive() {
        System.out.println("움직인다");
    }

    public void stop() {
        System.out.println("멈춘다");
    }
}
