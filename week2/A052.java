package week3;

import java.util.Scanner;
public class A052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();
        scanner.nextLine(); // 개행문자 처리

        for (int i = 0; i < testCases; i++) {
            String quizResult = scanner.nextLine();
            int score = calculateScore(quizResult);
            System.out.println(score);
        }

        scanner.close();
    }

    private static int calculateScore(String quizResult) {
        int score = 0;
        int consecutiveO = 0;

        for (int i = 0; i < quizResult.length(); i++) {
            if (quizResult.charAt(i) == 'O') {
                consecutiveO++;
                score += consecutiveO;
            } else {
                consecutiveO = 0;
            }
        }

        return score;
    }
}
