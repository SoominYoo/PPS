package week4;

import java.util.*;

public class B001 {
    static boolean[] visited;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt(); // 컴퓨터의 수
        int m = scanner.nextInt(); // 네트워크 상에서 직접 연결되어 있는 컴퓨터 쌍의 수

        visited = new boolean[n + 1];
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        int answer = bfs(1);
        System.out.println(answer - 1); // 1번 컴퓨터를 제외한 모든 컴퓨터의 수 출력
    }

    public static int bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;
        int count = 0;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            count++;

            for (int next : graph.get(current)) {
                if (!visited[next]) {
                    queue.offer(next);
                    visited[next] = true;
                }
            }
        }

        return count;
    }
}
