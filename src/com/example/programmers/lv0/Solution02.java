package com.example.programmers.lv0;
//day0803 LV0 두 수의 곱
public class Solution02 {
    public int solution(int num1, int num2) {
        int answer = 0;
        if((0<=num1 && num1 <= 100) && (0<=num2 && num2 <= 100)) {
            answer = num1 * num2;
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution02 sol2 = new Solution02();
        int result = sol2.solution(27, 19);
        System.out.println("Result: " + result);
    }
}
