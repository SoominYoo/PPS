import java.util.Scanner;

public class A191 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        int a;
        int b;
        int sum[] = new int[num];

        for(int i = 0; i<num; i++){
            a = sc.nextInt();
            b = sc.nextInt();
            sum[i] = a + b;
        }
        for(int i = 0; i<num; i++){
            System.out.println(sum[i]);
        }
    }
}
