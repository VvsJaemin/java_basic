package super_Ex;

public class Phone {
    public boolean power;
    public int number;

    public void power() {
        this.power = !this.power;
    }

    public void send() {
        if (this.power) {
            System.out.println("전화걸기");
        }
    }

    public void receive() {
        if (this.power) {
            System.out.println("전화 받기");
        }
    }

    public static void main(String[] args) {
        Phone p = new Phone();
        p.power();
        p.send();

    }
}
