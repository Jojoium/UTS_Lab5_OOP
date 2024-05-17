package Nomor2;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan sebuah string: ");
        String input = scanner.nextLine();

        boolean isPalindrome = checkPalindrome(input);
        System.out.println("Apakah string \"" + input + "\" adalah palindrome? " + isPalindrome);
    }

    public static boolean checkPalindrome(String str) {
        // Menghilangkan spasi dan mengubah string menjadi huruf kecil
        str = str.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}
