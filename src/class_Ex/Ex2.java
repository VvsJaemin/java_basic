package class_Ex;

public class Ex2 {
    public static void main(String[] args) {
        //5명의 성적 -> 성적(이름 + 성적) -> Score -> Score 배열

        Score[] arr = new Score[3];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Score();
        }

        arr[0].name = "재민";
        arr[0].kor = 20;

        arr[1].name = "나미";
        arr[1].kor = 21;

        arr[2].name = "재트";
        arr[2].kor = 22;
        // 자료구조(데이터) - > 검색 - > 정보
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].name + " " + arr[i].kor);
        }

        // 나미 국어점수만 출력
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].name.equals("나미")) {
                System.out.println(arr[i].name + "의 국어 성적 : " + arr[i].kor);
            }
        }

        // 국어성적의 합계와 평균
        int sum = 0;
        double avg = 0;

        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i].kor;
        }
        System.out.println("합계 : "+ sum);
        System.out.println("평균 : " + (double) sum / (double)arr.length );

    }
}
