import java.util.Scanner;

public class A035_유수민_20200122 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        //float sum[] = new float[count];
        float num[] = new float[count];
        String str[] = new String[count];
        for(int i = 0; i<count; i++){
            num[i] = sc.nextFloat();
            str[i] = sc.nextLine();
            for(int j = 0; j<str[i].length(); j++){
                if(str[i].charAt(j) == '@'){
                    num[i] *= 3;
                }
                if(str[i].charAt(j) == '%'){
                    num[i] += 5;
                }
                if(str[i].charAt(j) == '#'){
                    num[i] -= 7;
                }
            }
        }
        for(int i = 0; i<count; i++){
            System.out.println(String.format("%.2f", num[i]));
        }

    }
}
