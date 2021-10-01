package class_Ex;

import java.util.ArrayList;

public class Ex4 {
    public static void main(String[] args) {
        Pirate p1 = new Pirate();
        p1.name = "몽키D.루피";
        p1.age = 19;
        p1.gender = "남";
        p1.blood = "F";
        p1.teamName = "밀짚모자해적단";
        p1.devilFruit = true;
        p1.wanted = 3161000100L;
        p1.home = "이스트블루";

        Pirate p2 = new Pirate();
        p2.name = "롤로노아조로";
        p2.age = 22;
        p2.gender = "남";
        p2.blood = "XF";
        p2.teamName = "밀짚모자해적단";
        p2.devilFruit = false;
        p2.wanted = 1500000000L;
        p2.home = "이스트블루";

        Pirate p3 = new Pirate();
        p3.name = "나미";
        p3.age = 21;
        p3.gender = "여";
        p3.blood = "X";
        p3.teamName = "밀짚모자해적단";
        p3.devilFruit = false;
        p3.wanted = 66000000L;
        p3.home = "이스트블루";

        Pirate p4 = new Pirate();
        p4.name = "우솝";
        p4.age = 21;
        p4.gender = "남";
        p4.blood = "S";
        p4.teamName = "밀짚모자해적단";
        p4.devilFruit = false;
        p4.wanted = 200000000L;
        p4.home = "이스트블루";

        Pirate p5 = new Pirate();
        p5.name = "빈스모크상디";
        p5.age = 21;
        p5.gender = "남";
        p5.blood = "S";
        p5.teamName = "밀짚모자해적단";
        p5.devilFruit = false;
        p5.wanted = 330000000L;
        p5.home = "노스블루";

        Pirate p6 = new Pirate();
        p6.name = "토니토니쵸파";
        p6.age = 7;
        p6.gender = "남";
        p6.blood = "X";
        p6.teamName = "밀짚모자해적단";
        p6.devilFruit = true;
        p6.wanted = 100L;
        p6.home = "위대한항로";

        Pirate p7 = new Pirate();
        p7.name = "니코로빈";
        p7.age = 27;
        p7.gender = "여";
        p7.blood = "S";
        p7.teamName = "밀짚모자해적단";
        p7.devilFruit = true;
        p7.wanted = 130000000L;
        p7.home = "웨스트블루";

        Pirate p8 = new Pirate();
        p8.name = "프랑키";
        p8.age = 30;
        p8.gender = "남";
        p8.blood = "XF";
        p8.teamName = "밀짚모자해적단";
        p8.devilFruit = false;
        p8.wanted = 94000000L;
        p8.home = "사우스블루";

        Pirate p9 = new Pirate();
        p9.name = "브룩";
        p9.age = 101;
        p9.gender = "남";
        p9.blood = "X";
        p9.teamName = "밀짚모자해적단";
        p9.devilFruit = true;
        p9.wanted = 83000000L;
        p9.home = "웨스트블루";

        Pirate p10 = new Pirate();
        p10.name = "징베";
        p10.age = 45;
        p10.gender = "남";
        p10.blood = "F";
        p10.teamName = "밀짚모자해적단";
        p10.devilFruit = false;
        p10.wanted = 438000000L;
        p10.home = "어인섬";

        Pirate p11 = new Pirate();
        p11.name = "샹크스";
        p11.age = 37;
        p11.gender = "남";
        p11.blood = "XF";
        p11.teamName = "빨간머리해적단";
        p11.devilFruit = false;
        p11.wanted = 4048900000L;
        p11.home = "웨스트블루";

        Pirate[] pirate = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11};

        for (Pirate p : pirate) {
            System.out.println(p.name +"," + p.home + "," + p.teamName);
        }

        int strawHatCount =0;
        for (Pirate p : pirate) {
            if (p.teamName.equals("밀짚짚모자해적단")== true) {
                strawHatCount++;
            }
        }

        int notDevilFruitCount = 0;
        for (Pirate p : pirate) {
            if ((p.teamName.equals("밀짚모자해적단")) && (p.devilFruit == false)) {
                notDevilFruitCount++;
                System.out.println(p.name+"");
            }
        }

        ArrayList<Pirate> list = new ArrayList<>();
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);
        list.add(p8);
        list.add(p9);
        list.add(p10);
        list.add(p11);

        System.out.println(list.size() + "명");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).name);
        }

        for (Pirate p : pirate) {
            System.out.println(p.name);
        }

        ArrayList<Pirate> bloodX = new ArrayList<>();
        ArrayList<Pirate> bloodF = new ArrayList<>();
        ArrayList<Pirate> bloodS = new ArrayList<>();
        ArrayList<Pirate> bloodXF = new ArrayList<>();

        for (Pirate p : list) {
            if (p.blood.equals("X")) {
                bloodX.add(p);
            } else if (p.blood.equals("F")) {
                bloodF.add(p);
            } else if (p.blood.equals("S")) {
                bloodS.add(p);
            } else if (p.blood.equals("XF")) {
                bloodXF.add(p);
            }
        }

        System.out.println("X형 출력");
        for (Pirate p : bloodX) {
            System.out.println(p.name + p.blood);
        }

        int minAge = Integer.MAX_VALUE;
        for (Pirate p : list) {
            if (p.age < minAge) {
                minAge = p.age;
            }
        }
        System.out.println(minAge);
    }
}
