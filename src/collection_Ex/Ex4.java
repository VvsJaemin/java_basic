package collection_Ex;

import java.util.HashMap;
import java.util.Map;

public class Ex4 {
    public static void main(String[] args) {
        Ex4 ex4 = new Ex4();

        Member member = ex4.getMember();
        System.out.println(member.no+member.name);

        Map<String, Object> map = ex4.getMap();
        System.out.println((Integer)map.get("no")+ (String) map.get("name"));

    }
     // vo타입 사용 단점 : Member라는 새로운 데이터 타입을 만들어야한다.
    public Member getMember(){
        // 두개의 값을 리턴하고자할 때
        int no =17;
        String name = "루피";

        Member member = new Member();
        member.no = no;
        member.name = name;

        return member;
    }
    // Map타입 사용  ->  ekswja 맵안의 값을 사용할 땐 형변환 연산 필요
    public Map<String,Object> getMap() {
        int no =17;
        String name = "루피";

        Map<String, Object> map = new HashMap<>();

        map.put("no", no);
        map.put("name", name);

        return map;

    }
}
