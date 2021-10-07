package arrayList_Ex;

import super_Ex.A;

import java.util.ArrayList;
import java.util.Scanner;

public class OnePieceMain {
    public static void main(String[] args) {
        ArrayList<Pirate> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("[원피스 CRUD 프로그램 메뉴]");
            System.out.println("1. 해적멤버 전체 출력");
            System.out.println("2. 해적멤버 입력");
            System.out.println("3. 해적멤버 삭제");
            System.out.println("4. 해적멤버 악마의 열매 수정");
            System.out.println("5. 프로그램 종료");
            System.out.println("메뉴(번호)를 선택하세요");

            int menuNum = sc.nextInt();
            if (menuNum == 1) {
                System.out.println("1번선택");
                if (list.size() == 0) {
                    System.out.println("입력된 해적멤버가 없습니다.");
                }else {
                    for (Pirate p : list) {
                        System.out.print(p.getName() +"\t");
                        System.out.print(p.getAge() +"\t");
                        System.out.print(p.isDevilFruit() +"\t");
                        System.out.print(p.getWanted() +"\n");
                    }
                }
                sc.reset();
            } else if (menuNum == 2) {
                System.out.println("2번 선택 ");
                Pirate p = new Pirate(); // 객체 p를 생성
                // 객체 p의 값을 입력값(name, age, devilFruit, wanted)으로 설정
                System.out.println("NAME : ");
                String name = sc.next();
                System.out.println("AGE : ");
                int age = sc.nextInt();
                System.out.println("DEVIL FRUIT : ");
                boolean devilFruit = Boolean.parseBoolean(sc.next());
                System.out.println("WANTED : ");
                int wanted = sc.nextInt();
                p.setName(name);
                p.setAge(age);
                p.setDevilFruit(devilFruit);
                p.setWanted(wanted);

                list.add(p);

            } else if (menuNum == 3) {
                System.out.println("3번 선택");
                System.out.println("삭제할 해적의 이름 : ");
                String name = sc.next();
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getName().equals(name)) {
                        System.out.println(list.get(i).getName()+"을 삭제합니다.");
                        list.remove(i);
                    }
                }
            } else if (menuNum == 4) {
                System.out.println("4번 선택");
                System.out.println("수정할 해적의 이름 : ");
                String name = sc.next();
                // 악마의 열매 값은 true / false 스위치 값
                // 스위치 값은 입력값으로 수정하는게 아니고 현재값의 반대로 수정(true일 경우 false)
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getName().equals(name)) {
                        list.get(i).setDevilFruit(!list.get(i).isDevilFruit());
                    }
                }
            } else if (menuNum == 5) {
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("잘못 선택 했습니다.");
            }
            sc.reset();
        }
        sc.close();
    }
}
