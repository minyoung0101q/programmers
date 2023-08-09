package com.example.programmers.lv0; //해당 클래스가 속한 패키지를 정의
import java.util.HashMap; //HashMap 클래스를 사용하기 위한 import문
import java.util.Map; //Map 인터페이스를 사용하기 위한 import문
import java.util.Scanner; //Scanner 클래스를 사용하기 위한 import문
//day0805 LV0 최빈값 구하기
public class Solution10 { //Solution10 클래스 정의
    public int solution(int[] array) { //주어진 배열에서 최빈값을 찾는 역할
        // 배열에서 각 값의 빈도를 저장할 HashMap 생성
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // 배열을 순회하며 빈도수를 계산하여 frequencyMap에 저장
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        int maxFrequency = 0; // 최대 빈도 수
        int mode = -1; // 최빈값
        boolean isMultipleModes = false; // 최빈값이 여러 개인지 확인하는 변수

        // frequencyMap을 순회하며 최빈값과 최대 빈도 수를 찾음
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int currentFrequency = entry.getValue();
            if (currentFrequency > maxFrequency) {
                maxFrequency = currentFrequency;
                mode = entry.getKey();
                isMultipleModes = false;
            } else if (currentFrequency == maxFrequency) {
                isMultipleModes = true;
            }
        }

        // 최빈값이 여러 개인 경우 -1을 반환
        if (isMultipleModes) {
            return -1;
        } else {
            return mode;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("배열의 길이를 입력하세요: ");
        int length = scanner.nextInt();
        int[] array = new int[length];

        System.out.println("배열의 요소를 입력하세요:");
        for (int i = 0; i < length; i++) {
            array[i] = scanner.nextInt();
        }

        Solution10 solution = new Solution10();
        int result = solution.solution(array);

        if (result == -1) {
            System.out.println("최빈값이 여러 개입니다.");
        } else {
            System.out.println("최빈값: " + result);
        }

        scanner.close();
    }
}