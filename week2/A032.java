package week3;

import java.util.Scanner;

public class A032 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // 테스트 케이스 수 입력

        while (T-- > 0) {
            int k = scanner.nextInt(); // 층 수 입력
            int n = scanner.nextInt(); // 호 수 입력
            System.out.println(countPeople(k, n));
        }

        scanner.close();
    }

    private static int countPeople(int k, int n) {
        int[][] apt = new int[15][15]; // 아파트 배열 선언 (0층부터 14층까지, 1호부터 14호까지)

        // 0층 초기화
        for (int i = 1; i <= 14; i++) {
            apt[0][i] = i;
        }

        // 나머지 층 채우기
        for (int i = 1; i <= k; i++) {
            for (int j = 1; j <= n; j++) {
                apt[i][j] = apt[i - 1][j] + apt[i][j - 1];
            }
        }

        return apt[k][n];
    }
}
