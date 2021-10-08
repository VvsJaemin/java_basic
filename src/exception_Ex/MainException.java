package exception_Ex;

public class MainException {
    public static void main(String[] args) {
        // 1) 에러 Error
        // int num1 = 10/"a"; // 숫자 = 숫자 / 문자열

        // 2) 예외 Exception
        int num2 = 10 / 0; // 숫자 = 숫자/숫자 문법적으로는 정상이라 Error가 발생하지 않음
        // 코드에서는 에러가 발생하지 않지만 실행시키면 예외가 발생!
        // --> ﻿오류 발생 가능성이 있는 부분에 대해서 미리 프로그램으로 처리할 수 있는 방법(에러, 예외의 종류에 따라 타입들을 제공)을 제공


        // Integer.parseInt(String s) : 매개변수로 입력된 문자열을 숫자로 변경
        //실행시키면 숫자변경 실패로 java.lang.NumberFormatException 발생
        // int num1 = Integer.parseInt("칠칠칠");

        // 예외 발생가능한 메서드지만 예외처리코드가 없어도 에러발생하지 않음
        int num = Integer.parseInt("777");
        System.out.println(num);

        // 심각한 에러의 경우 예외의 경우 메서드에 예외처리코드를 강제화 할 수 있음
        // Class.forName(String s) : 매개변수로 클래스 전체이름을 입력하면 클래스를 로딩
        // 예외처리 코드가 없으면 에러가 발생


        /*
         * 1. 에러 -> 문법적으로 에러가 발생하지 않도록 코드 수정
         * 2. 예외 -> RuntimeException -> 코드는 정상 -> 실행시키면 예외가 발생할 수 도 있다
         * 3. 예외 -> RuntimeException외 -> 심각한 예외 -> 코드에 예외 코드 추가가 필요
         *        -> 1) 예외를 던져서 회피 -> 2) try...catch절을 이용해 예외 발생시 실행할 코드를 구현
         */


       try{
           Class c = Class.forName("java.util.Date");
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
    }
}
