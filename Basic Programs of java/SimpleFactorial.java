
import java.util.Scanner;
class SimpleFactorial{
	public void max(int number){


		int factorial = 1;
		for(int i=1;i<=number ; i++){
		factorial *= i;		
			
		}
		System.out.println("fact " + factorial);
	}


	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("enter number : ");
		int number = sc.nextInt();

		SimpleFactorial a = new SimpleFactorial();
		a.max(number);
	}

}