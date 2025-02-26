/*자연수 n이 매개변수로 주어집니다. n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
답이 항상 존재함은 증명될 수 있습니다.*/

import java.util.Scanner;

public class A176 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num;
        num = sc.nextInt();
        int result = Solution(num);
        System.out.println(result);
    }
    public static int Solution(int num){
        int answer = 0;
        for(int i = 1; i<num; i++){
            if(num % i == 1){
                answer = i;
                break;
            }
        }
        return answer;
    }

}
