package week3;

import java.util.Arrays;

public class A004 {
    public int[] solution(int[] arr, int divisor) {
        // divisor로 나누어 떨어지는 값들을 저장할 배열
        int[] divisibleValues = Arrays.stream(arr)
                .filter(num -> num % divisor == 0)
                .sorted()
                .toArray();

        // divisor로 나누어 떨어지는 값이 없는 경우
        if (divisibleValues.length == 0) {
            return new int[]{-1};
        }

        return divisibleValues;
    }

    public static void main(String[] args) {
        A004 solution = new A004();

        // 예시 1
        int[] arr1 = {5, 9, 7, 10};
        int divisor1 = 5;
        System.out.println(Arrays.toString(solution.solution(arr1, divisor1))); // 출력: [5, 10]

        // 예시 2
        int[] arr2 = {2, 36, 1, 3};
        int divisor2 = 1;
        System.out.println(Arrays.toString(solution.solution(arr2, divisor2))); // 출력: [1, 2, 3, 36]

        // 예시 3
        int[] arr3 = {3, 2, 6};
        int divisor3 = 10;
        System.out.println(Arrays.toString(solution.solution(arr3, divisor3))); // 출력: [-1]
    }
}
