package com.example.programmers.lv0;
//day0807 LV0 피자 나눠먹기 (1)
public class Solution12 {
    public int solution(int n) {
        int answer = 0;
        if(n % 7 == 0) {
            return answer = n / 7;
        } else {
            return answer = n / 7 + 1;
        }
    }
    public static void main(String[] args) {
        Solution12 sol12 = new Solution12();
        int result = sol12.solution(10); //answer의 값이 들어옴
        System.out.println(result);
    }
}
