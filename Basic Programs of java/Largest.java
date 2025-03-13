import java.util.Scanner;

public class Largest1 {



public void large(int firstNumber, int secondNumber , int thirdNumber){

	int maxNumber = Math.max(firstNumber, Math.max(secondNumber, thirdNumber));
        System.out.println("The maximum number is: " + maxNumber);

}



        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number:");
        int secondNumber = scanner.nextInt();

	System.out.println("Enter the third number:");
        int thirdNumber = scanner.nextInt();
 
	Largest a = new Largest();
	a.large(firstNumber,secondNumber,thirdNumber);
        
    }
}
