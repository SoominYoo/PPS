package week3;

import java.util.Arrays;

public class A001 {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);

        int childIndex = 0;
        int cookieIndex = 0;

        while (childIndex < g.length && cookieIndex < s.length) {
            if (g[childIndex] <= s[cookieIndex]) {
                childIndex++;
            }
            cookieIndex++;
        }

        return childIndex;
    }

    public static void main(String[] args) {
        A001 solution = new A001();

        // 예시 1
        int[] g1 = {1, 2, 3};
        int[] s1 = {1, 1};
        System.out.println(solution.findContentChildren(g1, s1)); // 출력: 1

        // 예시 2
        int[] g2 = {1, 2};
        int[] s2 = {1, 2, 3};
        System.out.println(solution.findContentChildren(g2, s2)); // 출력: 2
    }
}
