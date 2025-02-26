/*정수 배열로 표시되는 큰 정수가 제공됩니다 digits. 여기서 각각은 정수의 숫자 digits[i]입니다.
숫자는 왼쪽에서 오른쪽 순서로 가장 중요한 것부터 가장 중요한 것까지 정렬됩니다. 큰 정수에는 선행 '이 포함되어 있지 않습니다.
큰 정수를 1만큼 증가시키고 결과 숫자 배열을 반환합니다 .*/

import java.util.Arrays;
import java.util.Scanner;

public class A003 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] digits = {9};
        int[] output = plusOne(digits);

        System.out.println(Arrays.toString(output));
    }
    public static int[] plusOne(int[] digits) {
        int num = digits.length;
        for(int i = num - 1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            else{
                digits[i] = 0;
            }
        }
        int new_num[] = new int[num+1];
        new_num[0] = 1;
        return new_num;
    }

}
