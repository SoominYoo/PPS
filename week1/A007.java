import java.util.Scanner;

public class A007_유수민_20200122 {
    public static void main(String[] args) {
        Integer[] arr = new Integer[8];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        boolean ascending = true;
        boolean descending = true;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                descending = false;
            } else if (arr[i] < arr[i - 1]) {
                ascending = false;
            }
        }

        if (ascending) {
            System.out.println("ascending");
        } else if (descending) {
            System.out.println("descending");
        } else {
            System.out.println("mixed");
        }
    }
}
