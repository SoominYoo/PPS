import java.util.Scanner;

public class A145_유수민_20200122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int answer = 0;
        int price = sc.nextInt();
        int money = sc.nextInt();
        int count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            sum += price * i;
        }

        if (money < sum) {
            answer = sum - money;
        }

        System.out.println(answer);
    }
}
