package class_Ex;

public class Ex1 {
    public static void main(String[] args) {
        Score s = new Score();
        s.name = "재민";
        s.kor = 10;

        System.out.println(s);
        System.out.println(s.name);
        System.out.println(s.kor);

        Score zoro = new Score();
        zoro.name = "조로";
        zoro.kor = 68;

        System.out.println(zoro);
        System.out.println(zoro.name);
        System.out.println(zoro.kor);

        Score nami = new Score();
        nami.name = "나미";
        nami.kor = 90;

        System.out.println(nami);
        System.out.println(nami.name);
        System.out.println(nami.kor);


    }
}
