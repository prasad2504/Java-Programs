public class IntegerToArray {
    public static void main(String[] args) {
        int number = 12345; // Example integer

        // Convert integer to string to get individual digits
        String numberStr = Integer.toString(number);

        // Create an array of digits using curly braces
        int[] digitsArray = new int[numberStr.length()];

        // Populate the array with the digits
        for (int i = 0; i < numberStr.length(); i++) {
            digitsArray[i] = Character.getNumericValue(numberStr.charAt(i));
        }

        // Print the array
        System.out.println("Digits array: ");
        System.out.print("{ ");
        for (int digit : digitsArray) {
            System.out.print(digit + " ");
        }
        System.out.print("}");
    }
}
