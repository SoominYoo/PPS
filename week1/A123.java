/*정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.

X가 3으로 나누어 떨어지면, 3으로 나눈다.
X가 2로 나누어 떨어지면, 2로 나눈다.
1을 뺀다.
정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.*/

import java.util.Scanner;

public class A123 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int count[] = new int[num+1];

        for(int i = 2; i<=num; i++){
            count[i] = count[i-1] + 1;
            if(i % 2 == 0) count[i] = Math.min(count[i], count[i / 2] + 1);
            if(i % 3 == 0) count[i] = Math.min(count[i], count[i / 3] + 1);
        }
        System.out.println(count[num]);
    }
}
