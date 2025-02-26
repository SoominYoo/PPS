/*동호는 새악대로 T 통신사의 새 핸드폰 옴머나를 샀다. 새악대로 T 통신사는 동호에게 다음 두 가지 요금제 중 하나를 선택하라고 했다.

1. 영식 요금제
2. 민식 요금제
영식 요금제는 30초마다 10원씩 청구된다. 이 말은 만약 29초 또는 그 보다 적은 시간 통화를 했으면 10원이 청구된다.
만약 30초부터 59초 사이로 통화를 했으면 20원이 청구된다.

민식 요금제는 60초마다 15원씩 청구된다. 이 말은 만약 59초 또는 그 보다 적은 시간 통화를 했으면 15원이 청구된다.
만약 60초부터 119초 사이로 통화를 했으면 30원이 청구된다.

동호가 저번 달에 새악대로 T 통신사를 이용할 때 통화 시간 목록이 주어지면 어느 요금제를 사용 하는 것이 저렴한지 출력하는 프로그램을 작성하시오.*/
import java.util.Scanner;

public class A022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        int call[] = new int[N];

        for (int i = 0; i < N; i++) {
            call[i] = sc.nextInt();
        }

        int YoungFee = youngFee(call);
        int MinFee = minFee(call);

        if (YoungFee < MinFee) {
            System.out.println("Y " + YoungFee);
        } else if (MinFee < YoungFee) {
            System.out.println("M " + MinFee);
        } else {
            System.out.println("Y M " + YoungFee);
        }
    }

    public static int youngFee(int[] call) {
        int fee = 0;
        for (int i = 0; i < call.length; i++) {
            fee += (call[i] / 30) * 10 + 10;

        }
        return fee;
    }

    public static int minFee(int[] call) {
        int fee = 0;
        for (int i = 0; i < call.length; i++) {
            fee += (call[i] / 60) * 15 + 15;

        }
        return fee;
    }
}

