import java.util.Scanner;

public class A033_유수민_20200122 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[5][4];
        int sum=0;
        int max=0;
        int count=0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = sc.nextInt();
                sum += arr[i][j];
            }
            if(max < sum){
                max = sum;
                count = i+1;
            }
            sum = 0;
        }
        System.out.println(count + " " + max);
        sc.close();
    }

}
