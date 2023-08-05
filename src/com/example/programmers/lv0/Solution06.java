package com.example.programmers.lv0;
//day0804 LV0 분수의 덧셈
/*
* 문제 : 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어짐
* 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
*  */
public class Solution06 {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int numer = numer1 * denom2 + numer2 * denom1; // 분자
        int denom = denom1 * denom2; // 분모

        int max = gcd(numer, denom); // 최대공약수 계산

        numer = numer / max;
        denom = denom / max;

        int[] answer = { numer, denom }; // 배열 선언과 초기화

        return answer;
    }

    // 최대공약수 계산 함수
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        Solution06 solution = new Solution06();
        int numer1 = 1, denom1 = 2, numer2 = 1, denom2 = 3;
        int[] result = solution.solution(numer1, denom1, numer2, denom2);
        System.out.println("결과: " + result[0] + "/" + result[1]);
    }
}
