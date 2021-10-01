package class_Ex;

public class Ex5 {
    public static void main(String[] args) {
        // 메모리 데이터를 저장 -> 불러서 데이터 처리 - > 변수라는 문법 사용
        // 변수를 사용하여 데이터를 저장하는 자바언어 2가지 방식
        // 1) 변수에 데이터값을 저장하고 변수를 통해 호출
        // 2) 변수에 참조(위치) 값을 저장하고 변수에 저장된 참조값을 통해서 호출

        byte a =1;
        short b = 2;
        int c = 3;
        long d = 4;
        float e =5.1f;
        double f =6.1;
        char g = '가';
        boolean h  = true;
        System.out.println(h);

        int[] i = {2, 5, 7};
        System.out.println(i);
        System.out.println(i[0]);

        int[] j = new int[3];
        j[0] = 2;
        j[1] = 5;
        j[2] = 7;

        System.out.println(j[1]);

        String k = "자바";
        System.out.println(k);

        MyType mt = new MyType();
        mt.num=17;
        mt.name = "홍길동";
        System.out.println(mt);
        System.out.println(mt.num);
        System.out.println(mt.name);
    }
}
