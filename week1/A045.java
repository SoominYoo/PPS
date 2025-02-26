import java.util.Scanner;

public class A045 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        int arr[] = new int[26];
        int max = 0;
        char s = '?';

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch >= 'A' && ch <= 'Z') {
                int num = ch - 'A';
                arr[num]++;
            }
        }
        for(int i = 0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
                s = (char)(i+'A');
            }
            else if(max == arr[i]){
                s = '?';
            }
        }
        System.out.println(s);
    }
}
