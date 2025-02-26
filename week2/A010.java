package week3;

public class A010 {
    public int solution(String s) {
        int answer = s.length(); // 문자열을 전체로 압축했을 때의 길이로 초기화

        // 문자열을 자를 단위를 1부터 문자열 길이의 절반까지 증가시키면서 반복
        for (int unit = 1; unit <= s.length() / 2; unit++) {
            StringBuilder compressed = new StringBuilder(); // 압축된 문자열을 저장할 StringBuilder

            String prev = s.substring(0, unit); // 이전에 비교한 문자열 단위
            int count = 1; // 연속된 문자열의 개수를 저장하는 변수

            // 현재 단위로 문자열을 자르고 압축하여 새로운 문자열 생성
            for (int i = unit; i <= s.length() - unit; i += unit) {
                String current = s.substring(i, i + unit); // 현재 비교할 문자열 단위

                // 이전 문자열과 현재 문자열이 같다면 연속된 문자열 개수를 증가시킴
                if (prev.equals(current)) {
                    count++;
                } else {
                    // 이전 문자열과 현재 문자열이 다르다면
                    // 연속된 문자열 개수와 이전 문자열을 압축하여 StringBuilder에 추가
                    compressed.append(count > 1 ? count : "").append(prev);
                    prev = current; // 이전 문자열을 현재 문자열로 업데이트
                    count = 1; // 연속된 문자열 개수 초기화
                }
            }

            // 남은 문자열을 압축하여 StringBuilder에 추가
            compressed.append(count > 1 ? count : "").append(prev);

            // 압축된 문자열의 길이와 기존의 답 중 최소값을 선택하여 갱신
            answer = Math.min(answer, compressed.length());
        }

        return answer;
    }

    public static void main(String[] args) {
        A010 solution = new A010();

        String[] testCases = {
                "aabbaccc",
                "ababcdcdababcdcd",
                "abcabcdede",
                "abcabcabcabcdededededede",
                "xababcdcdababcdcd"
        };

        for (String testCase : testCases) {
            System.out.println(solution.solution(testCase));
        }
    }
}
