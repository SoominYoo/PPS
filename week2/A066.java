package week3;

import java.util.*;

public class A066 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();

        // 문자열을 문자 배열로 변환
        char[] digits = number.toCharArray();

        // 내림차순으로 정렬
        Arrays.sort(digits);
        StringBuilder result = new StringBuilder(new String(digits));
        result.reverse(); // 역순으로 출력하기 위해 뒤집기

        System.out.println(result.toString());

        scanner.close();
    }
}
