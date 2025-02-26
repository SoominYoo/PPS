package week3;

import java.util.*;

class Point {
    int x, y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class A065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        // 점들을 저장할 리스트 생성
        List<Point> points = new ArrayList<>();

        // 입력 받기
        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            points.add(new Point(x, y));
        }

        // 정렬하기
        Collections.sort(points, new Comparator<Point>() {
            @Override
            public int compare(Point p1, Point p2) {
                if (p1.x == p2.x) {
                    return Integer.compare(p1.y, p2.y);
                }
                return Integer.compare(p1.x, p2.x);
            }
        });

        // 출력하기
        for (Point point : points) {
            System.out.println(point.x + " " + point.y);
        }

        scanner.close();
    }
}
