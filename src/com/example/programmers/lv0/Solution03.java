package com.example.programmers.lv0;
//day0803 LV0 몫 구하기
public class Solution03 {
    public int solution(int num1, int num2) {
        int answer = 0;
        if((0 <= num1 && num1 <= 100) && (0 <= num2 && num2 <= 100)) {
            answer = num1 / num2;
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution03 sol3 = new Solution03();
        int result = sol3.solution(7, 2);
        System.out.println(result);
    }
}
