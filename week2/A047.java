package week3;

import java.util.Scanner;

public class A047 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine(); // 단어 입력
        scanner.close();

        int length = word.length();
        int start = 0;
        int end = Math.min(start + 10, length);

        // 10글자씩 끊어서 출력
        while (start < length) {
            System.out.println(word.substring(start, end));
            start = end;
            end = Math.min(start + 10, length);
        }
    }
}
