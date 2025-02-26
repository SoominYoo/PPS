package week3;

import java.util.Scanner;

public class A049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String password = scanner.nextLine();

            if (password.equals("end")) {
                break;
            }

            if (isAcceptable(password)) {
                System.out.println("<" + password + "> is acceptable.");
            } else {
                System.out.println("<" + password + "> is not acceptable.");
            }
        }

        scanner.close();
    }

    private static boolean isAcceptable(String password) {
        boolean hasVowel = false;
        int consecutiveVowel = 0;
        int consecutiveConsonant = 0;
        char prevChar = ' ';

        for (char ch : password.toCharArray()) {
            if (isVowel(ch)) {
                hasVowel = true;
                consecutiveVowel++;
                consecutiveConsonant = 0;
            } else {
                consecutiveConsonant++;
                consecutiveVowel = 0;
            }

            if (consecutiveVowel >= 3 || consecutiveConsonant >= 3) {
                return false;
            }

            if (ch == prevChar && ch != 'e' && ch != 'o') {
                return false;
            }

            prevChar = ch;
        }

        return hasVowel;
    }

    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
