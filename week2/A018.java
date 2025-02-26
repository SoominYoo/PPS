package week3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class A018 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 배열의 길이 입력 받기
        int N = scanner.nextInt();

        // 배열 A 입력 받기
        Integer[] A = new Integer[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        // 배열 B 입력 받기
        Integer[] B = new Integer[N];
        for (int i = 0; i < N; i++) {
            B[i] = scanner.nextInt();
        }

        // 배열 A를 오름차순으로 정렬
        Arrays.sort(A);

        // 배열 B를 내림차순으로 정렬
        Arrays.sort(B, Collections.reverseOrder());

        // 배열 A와 배열 B의 각 원소를 곱하여 더한 후 출력
        int minSum = 0;
        for (int i = 0; i < N; i++) {
            minSum += A[i] * B[i];
        }

        System.out.println(minSum);

        scanner.close();
    }
}
