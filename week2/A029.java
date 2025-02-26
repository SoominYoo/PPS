package week3;

/*
문제
유신이는 여러개의 문을 통과해야 밖으로 나갈 수 있는 방에 갇혔다.
유신이를 가둔 재현이는 유신이가 탈출할 수 없도록 하기 위해 특이한 규칙을 만들어 문을 순서대로 규칙에 맞는 방법으로 열어야하도록 시스템을 구성하였다.

규칙 1 : 문을 여는 방법은 두가지가 있다. 밀어서 여는 법과 당겨서 여는 법이 있다.
규칙 2 : 연속 2번 같은 방법으로 문을 열 수 없다.
규칙 3 : 2의 배수(2,4,6,...)번째 문들은 반드시 같은 방법으로 문을 열어야 한다.
	예를 들어 2번째 통과하는 문을 밀어서 열었다면, 4번째 통과하는 문 또한 밀어서 열어야 한다.
규칙 4 : 3의 배수(3,6,9,...)번째 문들은 반드시 같은 방법으로 문을 열어야 한다.
 예를 들어 3번째 통과하는 문을 밀어서 열었다면, 6번째 통과하는 문 또한 밀어서 열어야한다.
유신이는 위의 규칙 4가지를 모두 알고 있음에도 불구하고 탈출하지 못하고 있다. 유신이가 방을 탈출할 수 있도록 도와주는 프로그램을 만들어보자.

입력
첫째 줄에 총 문의 개수 N(2 ≤ N ≤ 2,500,000,000)이 주어진다.

둘째 줄에는 유신이가 첫 번째 문을 통과할 때 문을 연 방법이 주어진다. 밀어서 여는 법은 숫자 0, 당겨서 여는 법은 숫자 1로 표기된다.

 */

import java.util.Scanner;

public class A029{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        int first = scanner.nextInt();
        int second;
        if(first==1)second =  0;

        else second = 1;
        boolean isPossible = true;
        for(int i=0; i<N;i++) {
            if((i+1)%2==0&&(i+1)%3==0) {
                isPossible = false;
                break;
            }

        }
        if(isPossible) {
            for(int i=1; i<N;i++) {
                if(i%2==0)
                    System.out.println(first);
                else
                    System.out.println(second);

            }
        }
        else {
            System.out.println("Love is open door");
        }
        scanner.close();



    }
}

