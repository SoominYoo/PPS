/*김형택은 탑문고의 직원이다. 김형택은 계산대에서 계산을 하는 직원이다. 김형택은 그날 근무가 끝난 후에, 오늘 판매한 책의 제목을 보면서 가장 많이 팔린 책의 제목을 칠판에 써놓는 일도 같이 하고 있다.

오늘 하루 동안 팔린 책의 제목이 입력으로 들어왔을 때, 가장 많이 팔린 책의 제목을 출력하는 프로그램을 작성하시오.*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A135_유수민_20200122 {
    public static void main(String args[]){
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int num;
        int max_count = 0;
        String title = "";
        num = sc.nextInt();
        for(int i = 0; i<num; i++){
            title = sc.nextLine();
            int count = map.getOrDefault(title, 0);
            map.put(title, count+1);
        }
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            //title = entry.getKey();
            int count = entry.getValue();

            if(count > max_count){
                max_count = count;
                title = entry.getKey();
            }
        }
        System.out.println(title);
        sc.close();
    }
}
