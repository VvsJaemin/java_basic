package array_Ex;

public class Ex_2 {
    public static void main(String[] args) {
        // 자바가 변수를 통해 데이터 값을 접근하는 메커니즘
        //1) 값 호출(기본타입 8개)

        //2) 위치값 참조를 통해 호출 - > 참조 타입
        // 변수안에는 하나의 값만 들어간다.
        // 자바에서 하나의 값 : 숫자, 글자한자, true, false

        //[] 배열타입
        int[] arr = {10, 20, 30};
        System.out.println(arr);

        double[] arr2 = {0.1, 3.14};
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);

        char[] arr3 = {'a', 'b', 'c'};
        System.out.println(arr3[1]);

        boolean[] arr4 = {true, false, true, false};

        String[] arr5 = {"이순신", "세종대왕", "권율"};
        System.out.println(arr5[3]);
    }
}
