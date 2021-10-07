package wrapper_Ex;

import java.util.ArrayList;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        // 제네릭 사용 전
        List list = new ArrayList(); // 오브젝트 List -> ArrayList<Object> list와 동일
        list.add(new User("루피"));
        list.add(new User("나미"));
        list.add(new String("조로")); // 형이 강제화 되지 않아 어떤 참조 타입도 가능
        // list.get(0) -> Object타입 -> User타입으로 형변화 후 User타입의 getName()메서드 사용
        // System.out.println(list.get(0).getName()); // 형변환 전에는 Object클래스에 getName()존재

        System.out.println(((User)list.get(0)).getName());

        // 제네릭 사용 후 -> 형을 강제화
        // 형을 강제화 하기 싫으면... -> 위코드처럼 사용할려면 <Object>하면 된다.
        List<User> list2 = new ArrayList<>();
        list2.add(new User("루피"));
        list2.add(new User("나미"));
        // list2.add(new String("조로")); // 제네릭타입과 불일치로 에러!
        System.out.println(list2.get(0).getName()); // 제네릭에 지정한 User타입으로 고정되어 있어 형변환도 필요 없다
    }
}

class User{
    public User() {
    }

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}