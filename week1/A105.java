import java.util.Scanner;

public class A105 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int total=0; // 누적 합
        int diagonal=1; // 대각선

        while(true){
            if(X<=total+diagonal){
                // 홀수 일 때
                if(X % 2 == 1){
                    System.out.print((diagonal - (X - total - 1)) + "/" + (X - total));
                    break;
                }
                // 짝수 일 때
                else{
                    System.out.print((X - total) + "/" + (diagonal - (X - total - 1)));
                    break;
                }
            }
            else{
                total += diagonal;
                diagonal++;
            }
        }
    }
}
