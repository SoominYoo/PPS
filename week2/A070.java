package week3;

import java.util.*;

public class A070 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 카드의 개수

        Queue<Integer> queue = new LinkedList<>();

        // 카드 번호를 큐에 추가
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        // 카드를 하나 남을 때까지 반복하여 버리고 옮기기
        while (queue.size() > 1) {
            queue.poll(); // 제일 위에 있는 카드를 버림
            int topCard = queue.poll(); // 제일 위에 있는 카드를 저장
            queue.add(topCard); // 제일 위에 있는 카드를 제일 아래로 옮김
        }

        System.out.println(queue.peek()); // 남은 카드 출력

        scanner.close();
    }
}
