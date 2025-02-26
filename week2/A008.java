package week3;

import java.util.Scanner;

public class A008 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCaseCount = scanner.nextInt(); // 테스트 케이스의 개수

        for (int t = 0; t < testCaseCount; t++) {
            int studentCount = scanner.nextInt(); // 학생의 수
            int[] scores = new int[studentCount];
            int sum = 0;

            // 학생들의 점수를 입력받고 총합 계산
            for (int i = 0; i < studentCount; i++) {
                scores[i] = scanner.nextInt();
                sum += scores[i];
            }

            // 평균 계산
            double average = (double) sum / studentCount;

            // 평균을 넘는 학생들의 수 계산
            int aboveAverageCount = 0;
            for (int score : scores) {
                if (score > average) {
                    aboveAverageCount++;
                }
            }

            // 평균을 넘는 학생들의 비율 출력
            double aboveAverageRatio = (double) aboveAverageCount / studentCount * 100;
            System.out.printf("%.3f%%\n", aboveAverageRatio);
        }

        scanner.close();
    }
}
