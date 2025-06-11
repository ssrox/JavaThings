package qimo.shiyan5;

import java.util.Scanner;

public class StringCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String plaintext = scanner.nextLine();
        scanner.close();

        String encrypted = encrypt(plaintext);
        String decrypted = decrypt(encrypted);

        System.out.println("加密后:" + encrypted);
        System.out.println("解密后:" + decrypted);
    }

    static String encrypt(String plaintext) {
        StringBuilder encrypted = new StringBuilder();
        for (char c : plaintext.toCharArray()) {
            encrypted.append((char) (c + 3));
        }
        return encrypted.toString();
    }

    static String decrypt(String encrypted) {
        StringBuilder decrypted = new StringBuilder();
        for (char c : encrypted.toCharArray()) {
            decrypted.append((char) (c - 3));
        }
        return decrypted.toString();
    }
}