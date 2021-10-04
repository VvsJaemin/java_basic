package crud_Ex;

import constructor_Ex.A;

import java.util.ArrayList;

public class Ex1 {
    public static void main(String[] args) {

        Member m1 = new Member();
        m1.name = "D.루피";
        m1.age = 19;
        m1.devilFruit = true;
        m1.money = 1500000000; // 15억
        m1.gender = '남';

        Member m2 = new Member();
        m2.name = "Z.조로";
        m2.age = 22;
        m2.devilFruit = false;
        m2.money = 320000000; // 3.2억
        m2.gender = '남';

        Member m3 = new Member();
        m3.name = "A.나미";
        m3.age = 21;
        m3.devilFruit = false;
        m3.money = 66000000; // 0.66
        m3.gender = '여';

        Member m4 = new Member();
        m4.name = "W.우솝";
        m4.age = 20;
        m4.devilFruit = false;
        m4.money = 200000000; // 2억
        m4.gender = '남';

        Member m5 = new Member();
        m5.name = "S.상디";
        m5.age = 22;
        m5.devilFruit = false;
        m5.money = 330000000; // 3.3억
        m5.gender = '남';

        Member m6 = new Member();
        m6.name = "S.쵸파";
        m6.age = 7;
        m6.devilFruit = true;
        m6.money = 100;
        m6.gender = '남';

        Member m7 = new Member();
        m7.name = "R.로빈";
        m7.age = 24;
        m7.devilFruit = true;
        m7.money = 130000000;
        m7.gender = '여';

        Member m8 = new Member();
        m8.name = "F.프랑키";
        m8.age = 31;
        m8.devilFruit = false;
        m8.money = 94000000;
        m8.gender = '남';

        Member m9 = new Member();
        m9.name = "B.브룩";
        m9.age = 101;
        m9.devilFruit = true;
        m9.money = 83000000;
        m9.gender = '남';

        Member m10 = new Member();
        m10.name = "S.징베";
        m10.age = 45;
        m10.devilFruit = false;
        m10.money = 4380000000L;
        m10.gender = '남';

        //자료구조 -> 영속성이 가능한 곳에 저장되면 db가 된다.
        ArrayList<Member> strawHat = new ArrayList<>();

        // 1.추가
        strawHat.add(m1); // boolean add(Member) 일반메서드
        strawHat.add(m2);
        strawHat.add(m3);
        strawHat.add(m4);
        strawHat.add(m5);
        strawHat.add(m6);
        strawHat.add(m7);
        strawHat.add(m8);
        strawHat.add(m9);
        strawHat.add(m10);
        System.out.println(strawHat.size()); // int size() 일반메서드

        //2. 읽기
        for (Member m : strawHat) {
            System.out.println(m.name);
        }

        // 3. 수정 : 쵸파(6번째)의 age를 7에서 6으로 수정
        strawHat.get(5).age = 6;
        System.out.println(strawHat.get(5).age);

        // 4. 삭제 : 징베(10번째)를 삭제
        strawHat.remove(9);

        // 삭제확인
        System.out.println(strawHat.size());
        for (Member m : strawHat) {
            System.out.println(m.name);
        }

        // 삭제한 데이터 다시 추가(징베)
        strawHat.add(m10);

        int totalAge = 0;
        for (Member m : strawHat) {
            totalAge = totalAge+m.age;
        }
        System.out.println("1) 멤버들의 나이의 합 : " + totalAge);

        // 2) 멤버 나이 평균
        double avg = (double) totalAge / (double) strawHat.size();
        System.out.println("2) 멤버들의 나이 평균" + avg);

        // 3) 가장 나이가 많은 멤버의 나이와 이름
        int maxAge = -1;
        String maxAgeName = "";
        for (Member m : strawHat) {
            if (m.age > maxAge) {
                maxAge = m.age;
                maxAgeName = m.name;
            }
        }
        System.out.println(maxAgeName+maxAge);

        //4) 가장 나이가 어린 멤버의 나이와 이름
        int minAge = Integer.MAX_VALUE; //정적 필드
        String minAgeName = "";

        for (Member m : strawHat) {
            if (m.age < minAge) {
                minAge = m.age;
                minAgeName = m.name;
            }
        }
        System.out.println(minAgeName+minAge);

        //5) 멤버중 미성년자를 출력
        System.out.println("멤버중 미성년자 출력 : ");
        for (Member m : strawHat) {
            if (m.age < 19) {
                System.out.println(m.name);
            }
        }
        //6) 멤버중 악마의 열매 능력자를 출력하고 몇명인지 출력
        System.out.println("멤버중 악마의 열매 능력자 출력");
        int devilFruitCount = 0;
        for (Member m : strawHat) {
            if (m.devilFruit == true) {
                devilFruitCount = devilFruitCount + 1; //  if문 실행 devilFruitCount를 1증가
                System.out.println(m.name);
            }
        }
        System.out.println(devilFruitCount);

        // 남자 멤버중 현상금이 가장 많은 멤버의 이름과 현상금 출력
        long maleMaxMoney =0;
        String maleMaxMoneyName = "";
        for (Member m : strawHat) {
            if (m.gender == '남') {
                if (m.money > maleMaxMoney) {
                    maleMaxMoney = m.money;
                    maleMaxMoneyName = m.name;
                }
            }
        }
        System.out.println(maleMaxMoneyName);
        System.out.println(maleMaxMoney);

        // 남자 악매열매 능력자중 가장 현상금 많은 멤버의 이름과 현상금을 출력
        long money12 = 0;
        String name12 = "";
        for (Member m : strawHat) {
            if ((m.gender == '남') && (m.devilFruit == true)) {
                if (m.money > money12) {
                    money12 = m.money;
                    name12 = m.name;
                }
            }
        }
        System.out.println(name12);
        System.out.println(money12);

        // 멤버중 이름이 "S."문자열로 시작하는 멤버를 출력하시오
        System.out.println("멤버중 이름이 : ");
        for (Member m : strawHat) {
            if (m.name.startsWith("S.") == true) {
                System.out.println(m.name);
            }
        }
    }
}
