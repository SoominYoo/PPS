import java.util.Scanner;

public class A192_유수민_20200122 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        int total=0;
        num = sc.nextInt();


        for(int i = 1; i<=num; i++){
            total += i;
        }
        System.out.println(total);
    }


}
