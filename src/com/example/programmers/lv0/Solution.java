package com.example.programmers.lv0;
//day0803 LV0 두 수의 합
public class Solution {
    public int solution(int num1, int num2) {
        int answer = -1;
        boolean be = ((-50000 <= num1 && num1 <= 50000) && (-50000 <= num2 && num2 <= 50000));
        if(be) {
            answer = num1 + num2;
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int result = sol.solution(100, 2);
        System.out.println("Result: " + result);
    }
}
