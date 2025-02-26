package week3;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class A046 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 선수의 수 입력
        scanner.nextLine(); // 개행 문자 처리

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String lastName = scanner.nextLine(); // 선수의 성 입력
            char firstChar = lastName.charAt(0); // 성의 첫 글자 추출

            // HashMap에 성의 첫 글자에 해당하는 횟수 갱신
            map.put(firstChar, map.getOrDefault(firstChar, 0) + 1);
        }

        StringBuilder result = new StringBuilder();

        // 성의 첫 글자가 같은 선수가 5명 이상인 경우 결과에 추가
        for (char firstChar : map.keySet()) {
            if (map.get(firstChar) >= 5) {
                result.append(firstChar);
            }
        }

        // 결과가 없는 경우 PREDAJA 출력, 있으면 사전순으로 정렬하여 출력
        if (result.length() == 0) {
            System.out.println("PREDAJA");
        } else {
            char[] chars = result.toString().toCharArray();
            Arrays.sort(chars);
            System.out.println(chars);
        }

        scanner.close();
    }
}
