package week3;

import java.util.Scanner;

public class A050 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String caesarWord = scanner.nextLine();
        String originalWord = decryptCaesarWord(caesarWord);

        System.out.println(originalWord);

        scanner.close();
    }

    private static String decryptCaesarWord(String caesarWord) {
        StringBuilder originalWord = new StringBuilder();

        for (int i = 0; i < caesarWord.length(); i++) {
            char currentChar = caesarWord.charAt(i);
            char decryptedChar = decryptCharacter(currentChar);
            originalWord.append(decryptedChar);
        }

        return originalWord.toString();
    }

    private static char decryptCharacter(char encryptedChar) {
        char decryptedChar = (char) ((encryptedChar - 'A' - 3 + 26) % 26 + 'A');
        return decryptedChar;
    }
}
