package week4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class B032 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cnt = 2;
        int res = 0;
        Integer arr[] = new Integer[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(arr, Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            res = Math.max(res, cnt + arr[i]);
            cnt++;
        }

        System.out.println(res);
    }
}
