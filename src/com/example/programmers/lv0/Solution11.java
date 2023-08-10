package com.example.programmers.lv0;
//day0805 LV0 짝수는 싫어요
public class Solution11 {
        public int[] solution(int n) {
            int[] answer;
            int k = 0;

            if(n % 2 == 0) {
                answer = new int[n / 2];
            } else {
                answer = new int[n / 2 + 1];
            }

            for(int i = 0; i<= n; i++) {
                if( i % 2 == 1 ) {
                    answer[k] = i;
                    k++;
                }
            }
            return answer;
        }
    public static void main(String[] args) {
        int n = 10; // 원하는 n 값으로 변경 가능

        Solution11 solution = new Solution11();
        int[] result = solution.solution(n);

        System.out.print("Result: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}