package week3;
import java.util.*;

public class A069 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // N명의 사람
        int K = scanner.nextInt(); // K번째 사람을 제거

        Queue<Integer> queue = new LinkedList<>();

        // 1부터 N까지의 사람을 큐에 추가
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        StringBuilder result = new StringBuilder();
        result.append("<");

        // 큐에서 사람을 제거하면서 요세푸스 순열 생성
        while (!queue.isEmpty()) {
            for (int i = 0; i < K - 1; i++) {
                // K-1번째 사람을 큐의 맨 뒤로 이동
                queue.add(queue.poll());
            }
            result.append(queue.poll()); // K번째 사람을 제거하여 결과에 추가
            if (!queue.isEmpty()) {
                result.append(", "); // 마지막 사람이 아니면 쉼표 추가
            }
        }

        result.append(">");
        System.out.println(result.toString());

        scanner.close();
    }
}
