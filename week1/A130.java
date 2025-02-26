import java.util.Scanner;
public class A130 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int arr[] = new int[cnt];
        int sum = 0;
        int next = -1;

        for(int i = 0; i<cnt; i++){
            arr[i] = sc.nextInt();
            if(arr[i] == 0){
                arr[i-1] = 0;
                next--;
            }
            else{
                next++;
                arr[next] = arr[i];
            }
        }
        for(int i = 0; i<=next; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
