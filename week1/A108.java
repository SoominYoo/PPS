import java.util.Scanner;

public class A108 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스의 개수

        for (int i = 0; i < T; i++) {
            int N = sc.nextInt(); // 정수 N 입력받기
            if (isSymmetric(N)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }

    // 좌우 대칭 여부를 확인하는 함수
    public static boolean isSymmetric(int N) {
        // 주어진 수와 뒤집은 수를 합한 값을 구한다.
        int sum = N + reverse(N);
        // 구한 합의 문자열을 좌우 대칭으로 비교하여 결과를 반환한다.
        return isPalindrome(Integer.toString(sum));
    }

    // 숫자를 뒤집는 함수
    public static int reverse(int n) {
        int reversed = 0;
        while (n != 0) {
            reversed = reversed * 10 + n % 10;
            n /= 10;
        }
        return reversed;
    }

    // 문자열이 좌우 대칭인지 확인하는 함수
    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
