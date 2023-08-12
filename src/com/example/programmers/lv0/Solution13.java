package com.example.programmers.lv0;
//day0808 LV0 피자 나눠먹기 (2)
public class Solution13 {
    public int solution(int n) {
        int answer = 0; //피자 판의 수
        for(int i = 1; i <= 6 * n; i++) {
            if(6 * i % n == 0) {
                answer = i;
                break;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution13 sol13 = new Solution13();
        int result = sol13.solution(10);
        System.out.println(result);
    }
}
/* 문제 : 머쓱이네 피자가게는 피자를 여섯 조각으로 잘라줍니다.
* 피자를 나눠먹을 사람의 수 n이 매개변수로 주어질 때, n명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면
* 최소 몇 판을 시켜야 하는지를 return 하도록 solution 함수를 완성해보세요.
* 제한사항 : 1 <= n <= 100
* 입출력 예 : n = 6 -> result = 1, n = 10 -> result = 5, n = 4 -> result = 2
* */