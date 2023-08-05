package com.example.programmers.lv0;
//day0804 LV0 숫자 비교하기
public class Solution05 {
    public int solution(int num1, int num2) {
        int answer = (num1 == num2) ? 1 : -1;
        return answer;
    }
    public static void main(String[] args) {
        Solution05 sol5 = new Solution05();
        int result = sol5.solution(2, 3);
        System.out.println("Result: " + result);
    }
}
