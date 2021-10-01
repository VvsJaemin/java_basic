package class_Ex;

public class Ex3 {
    public static void main(String[] args) {
        Student[] students = new Student[4];

        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
        }

        students[0].name = "재민";
        students[0].kor = 55;
        students[0].eng = 55;
        students[0].math = 53;

        students[1].name = "루피";
        students[1].kor = 25;
        students[1].eng = 55;
        students[1].math = 53;


        students[2].name = "포비";
        students[2].kor = 55;
        students[2].eng = 35;
        students[2].math = 53;

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].name + " " + students[i].kor + " " + students[i].eng + " " + students[i].math);
        }

        //수학점수가 80점 이상
        for (int i = 0; i < students.length; i++) {
            if (students[i].math >= 80) {
                System.out.println(students[i].name + "수학점수는 " + students[i].math+ "점입니다.");
            }
        }

        // 국어 점수가 가장높은 학생 이름과 점수
        int maxKor = 0;
        String maxKorName = "";

        for (int i = 0; i < students.length; i++) {
            if (students[i].kor > maxKor) {
                maxKor = students[i].kor;
                maxKorName = students[i].name;
            }
        }
        System.out.println(maxKorName + maxKor);

        // 영어점수가 가장 낮은 학생의 이름과 점수

        int minEng = 100;
        String minEngName = "";

        for (int i = 0; i < students.length; i++) {
            if (students[i].eng < minEng) {
                minEng = students[i].eng;
                minEngName = students[i].name;
            }
        }

        System.out.println(minEngName + minEng);

        // 3과목 평균이 60점 이상 합격 아니면 불합격

        for (int i = 0; i < students.length; i++) {
            if ((students[i].kor + students[i].eng + students[i].math / 3.0) >= 60) {
                System.out.println(students[i].name + "합격");
            } else {
                System.out.println(students[i].name+"불합격");
            }
        }
    }
}
