package week3;

import java.util.Scanner;

public class A048 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 단어의 개수 입력
        scanner.nextLine(); // 개행 문자 처리

        int count = 0; // 그룹 단어의 개수 카운트

        // 각 단어에 대해 그룹 단어인지 확인
        for (int i = 0; i < N; i++) {
            String word = scanner.nextLine();
            if (isGroupWord(word)) {
                count++;
            }
        }

        System.out.println(count); // 그룹 단어의 개수 출력

        scanner.close();
    }

    // 그룹 단어인지 확인하는 메소드
    private static boolean isGroupWord(String word) {
        boolean[] visited = new boolean[26]; // 알파벳 소문자 개수에 해당하는 배열 선언

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            // 현재 문자가 이전에 나온 적이 있는 경우
            if (visited[currentChar - 'a']) {
                // 바로 앞 문자와 다르다면 그룹 단어가 아님
                if (word.charAt(i - 1) != currentChar) {
                    return false;
                }
            } else { // 현재 문자가 이전에 나온 적이 없는 경우
                visited[currentChar - 'a'] = true; // 해당 문자를 방문했다고 표시
            }
        }

        return true; // 그룹 단어인 경우
    }
}
