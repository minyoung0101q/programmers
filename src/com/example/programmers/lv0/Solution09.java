package com.example.programmers.lv0;
//day0805 LV0 중앙값 구하기
import java.util.Arrays;

class Solution09 {
    public int solution(int[] array) {
        Arrays.sort(array);
        int answer = array[array.length / 2];
        return answer;
    }

    public static void main(String[] args) {
        // 테스트를 위해 예시 배열을 생성합니다.
        int[] testArray = {1, 2, 7, 10, 11};

        // Solution 클래스의 인스턴스를 생성합니다.
        Solution09 solution = new Solution09();

        // solution 메서드를 호출하여 중앙값을 얻고 출력합니다.
        int result = solution.solution(testArray);
        System.out.println("중앙값: " + result);
    }
}
