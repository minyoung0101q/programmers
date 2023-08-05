package com.example.programmers.lv0;
//day0805 LV0 배열 두 배 만들기
public class Solution07 {
    public int[] solution(int[] numbers) {
        int[] doubledNumbers = new int[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            doubledNumbers[i] = numbers[i] * 2;
        }

        return doubledNumbers;
    }

    public static void main(String[] args) {
        Solution07 solution = new Solution07();
        int[] numbers = {1, 2, 3, 4, 5};
        int[] doubledNumbers = solution.solution(numbers);

        System.out.print("Original numbers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        System.out.print("\nDoubled numbers: ");
        for (int num : doubledNumbers) {
            System.out.print(num + " ");
        }
    }
}
