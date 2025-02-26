import java.util.Scanner;

public class A026_유수민_20200122 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean answer = true;
        int num;
        int originalNum;
        int sum = 0;

        num = sc.nextInt();
        originalNum = num;

        while (num != 0) {
            sum += num % 10;
            num /= 10;
        }

        if (originalNum % sum != 0) {
            answer = false;
        } else {
            answer = true;
        }

        System.out.println(answer);
    }
}
