package super_Ex;

public class Bus extends Car{
    public String name; // 부모 클래스의 name 필드는 가려짐 ->  외부에선 호출 불가 -> 자식 클래스안에서는 super로 참조 가능
    public int fee;
}