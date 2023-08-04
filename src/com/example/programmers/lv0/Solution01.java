package com.example.programmers.lv0;
//day0803 LV0 두 수의 차
public class Solution01 {
    public int solution(int num1, int num2) {
        int answer = 0;
        if((-50000 <= num1 && num1 <= 50000) && (-50000 <= num2 && num2 <= 50000)) {
            answer = num1 - num2;
        } //입력값의 범위를 체크하여 가능한 산술 오버플로우나 언더플로우를 방지
        return answer;
    }
    public static void main(String[] args) {
        Solution01 sol1 = new Solution01();
        int result = sol1.solution(100, 2);
        System.out.println("Result: " + result);
    }
}
