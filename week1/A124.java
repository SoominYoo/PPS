import java.util.Scanner;
public class A124 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = Solution(num);
        sc.close();
    }
    public static int Solution(int num){
        int k = 2;
        while(num != 1){
            if(num % k == 0){
                num /= k;
                System.out.println(k);
            }
            else{
                k++;
            }
        }
        return 0;
    }
}
