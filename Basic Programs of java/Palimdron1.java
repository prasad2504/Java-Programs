 public class PalindromeNumbers {   
 public static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;
        while (number > 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10 + digit;
            number /= 10;
        }
        return originalNumber == reversedNumber;
    }

    public static void main(String[] args) {
        System.out.println("Palindrome numbers between 1 and 100:");
        for (int i = 1; i <= 100; i++) {
            if (isPalindrome(i)) {
                System.out.print(i + " ");
            }
        }
    }
}