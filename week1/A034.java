import java.util.Scanner;

public class A034_유수민_20200122 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 10;
        int[] arr = new int[10];
        int[] remain = new int[10];


        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            remain[i] = arr[i] % 42;
        }
        for(int i = 0; i<10; i++){
            for(int j = 0; j<10; j++){
                if(remain[i] == remain[j]){
                    count--;
                }
            }
        }
        System.out.println(count);
    }
}
