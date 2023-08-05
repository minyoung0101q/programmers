package com.example.programmers.lv0;
//day0804 LV0 두 수의 나눗셈
/* 문제 : 정수 num1고 num2가 매개변수로 주어질 때, num1을 num2로 나눈 값에 1,000을 곱한 후 정수 부분을 return하도록 solution 함수를 완성하라
* 입출력 예시 : num1이 3, num2가 2이므로 3/2 = 1.5에 1,000을 곱하면 1500이 됩니다.
* */
public class Solution04 {
    public int solution(int num1, int num2) {
        double answer = (double) num1 / num2 * 1000; //산술연산에서 적어도 하나의 피연산자가 실수형이라면 다른 피연산자도 자동으로 실수형으로 변환 => 자동형변환
        return (int)answer; //먼저 num1을 double 타입으로 형변환하여 실수 연산을 수행 이후 num2와 나누고 그 결과에 1000을 곱함
    }

    public static void main(String[] args) {
        Solution04 sol4 = new Solution04();
        int result = sol4.solution(3, 2);
        System.out.println(result);
    }
}
