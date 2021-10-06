package final_Ex;
// 클래스 앞 final : Data클래스 상속 금지
public final class Data {
    public final int X = 88; // 필드값 변경 금지 - >  상수

    // final 변수(필드) 대문자로 이름을
    public int y;

    //메서드 앞 final : print()를 오버라이딩 금지
    public final void print(){
        // 지역 변수
        final int NUM = 100; // 지역변수 값 변경 금지 -> 상수
        System.out.println(this.X+","+this.y);
    }
}
