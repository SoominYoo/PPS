import java.util.Collections;
import java.util.Scanner;
/*
세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고,
계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.*/
public class A019 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        int result = Solution(num1, num2, num3);
        sc.close();

    }
    public static int Solution(int num1, int num2, int num3){
        int mux = num1 * num2 * num3;
        int count[] = {0,0,0,0,0,0,0,0,0,0};
        for(int i = 0; i<Integer.toString(mux).length(); i++){
            count[Integer.toString(mux).charAt(i)-'0']++;
        }
        for(int i = 0; i<10; i++){
            System.out.println(count[i]);
        }
        return 0;
    }
}

