import java.util.Scanner;

class PrimeT{

	public void pri(int num){
		
	boolean isPrime=true;
       for(int 	i=2;i<=Math.sqrt(num);i++){
		if(num%i==0){
			isPrime = false;
			break;
		}
	}
	if(isPrime){
	System.out.println(" is prime ");
	}else{
	System.out.println("is not prime ");
	}
	
	
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to cheak prime or not");

		int num = sc.nextInt();
	PrimeT a = new PrimeT();
	a.pri(num);
       
  	}


}