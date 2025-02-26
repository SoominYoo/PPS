package week3;

import java.util.ArrayList;
import java.util.List;

public class A002 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows <= 0) {
            return triangle;
        }

        // 첫 번째 줄 (1을 가지고 있는 리스트) 추가
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int rowNum = 1; rowNum < numRows; rowNum++) {
            List<Integer> row = new ArrayList<>();
            List<Integer> prevRow = triangle.get(rowNum - 1);

            // 첫 번째 숫자는 항상 1
            row.add(1);

            // 중간 숫자 계산
            for (int j = 1; j < rowNum; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            // 마지막 숫자는 항상 1
            row.add(1);

            triangle.add(row);
        }

        return triangle;
    }

    public static void main(String[] args) {
        A002 solution = new A002();

        // 예시 1
        int numRows1 = 5;
        System.out.println(solution.generate(numRows1));

        // 예시 2
        int numRows2 = 1;
        System.out.println(solution.generate(numRows2));
    }
}
