import java.math.BigInteger;
import java.util.Scanner;

class A028_유수민_20200122 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        BigInteger num1 = scan.nextBigInteger();
        BigInteger num2 = scan.nextBigInteger();
        BigInteger sum = num1.add(num2);
        System.out.println(sum);
    }
}