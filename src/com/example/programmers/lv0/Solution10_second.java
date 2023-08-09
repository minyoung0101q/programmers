package com.example.programmers.lv0;

import java.util.Arrays; //java.util.Arrays 패키지를 가져오고 있음, 이 패키지는 배열 관련 유틸리티 기능을 제공함, 예를 들어 배열 정렬에 사용되는 Array.sort() 메서드를 사용할 수 있음

public class Solution10_second { //클래스는 자바에서 코드의 기본적인 구성 요소임
    public static void main(String[] args) {
        int[] array = {3, 9, 3, 5, 6, 3, 5, 7, 10, 9}; //배열 선언과 초기화
        int result = solution(array); //solution 메서드를 호출하고 그 반환값을 result 변수에 저장, array는 인자로 전달
        System.out.println("Most frequent number: " + result); //결과를 출력
    }

    public static int solution(int[] array) {  //solution 메서드는 주어진 int 배열에 대해 가장 빈번하게 나타나는 숫자를 찾는 기능을 구현하고 있음
        int answer = 0;
        int max = 0;

        Arrays.sort(array); //주어진 배열을 오름차순으로 정렬 => {3, 3, 3, 5, 5, 6, 7, 9, 9, 10}
        max = array[array.length - 1]; //정렬된 배열에서 가장 큰 숫자를 max 변수에 저장하고 있음
        //배열은 0부터 시작하는 인덱스를 가지므로, array.length - 1은 배열의 마지막 요소의 인덱스를 나타냅니다.
        //인덱스: 배열 내에서 각 요소의 위치를 가리키는 숫자.
        int[] count = new int[max + 1]; //
        for (int i = 0; i < array.length; i++) {
            count[array[i]]++;
        }
        max = count[0]; //count 배열을 생성하고, max + 1 크기로 초기화합니다. 그리고 주어진 배열의 각 요소를 인덱스로 활용하여 count 배열의 해당 위치에 값을 늘려가며 각 숫자의 등장 횟수를 계산하고 있습니다.

        for (int i = 1; i < count.length; i++) {
            if (max < count[i]) {
                max = count[i];
                answer = i;
            } else if (max == count[i]) {
                answer = -1;
            }
        } //count 배열을 순회하면서 가장 많이 등장한 숫자와 그 등장 횟수를 찾는 로직을 구현하고 있습니다. 만약 동일한 횟수로 등장하는 숫자가 있다면 answer를 -1로 설정하고 있습니다.
        return answer; //solution 메서드는 가장 빈번하게 등장한 숫자의 값을 반환합니다.
    }
}

