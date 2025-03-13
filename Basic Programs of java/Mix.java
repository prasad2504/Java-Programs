import java.util.Scanner;
class Mix{
	
	public void fact(int num){

		int factorial = 1;
		for(int i = 1 ; i <=num ; i++){

		factorial *= i;
			
		}

	System.out.println("factorial of " + num + " is :" + factorial);
	}


	public void prime(int num){
		
		boolean isPrime = true; 
		for(int i=2;i<=Math.sqrt(num);i++){
			if(num%i==0){
				isPrime=false;
				break;
			}
		}

		if(isPrime){
			System.out.println("is a prime no");
		}else {
			System.out.println("is not prime no");	
   		}

	}

	
	public void rev(int num){
		
		int reversed = 0;
		while(num!=0){
			int digit = num % 10;
			reversed = reversed *10 + digit ;
			num /=10;
		}
	System.out.println("reversed of that num : " + reversed);
	
	}


	public void pali(int num){
	
		int org = num ,reversed = 0;
		while(num != 0){
			int digit = num % 10;
			reversed = reversed*10+digit;
			num /= 10;
		}	
	
		System.out.println("Is palimdrone " + (org==reversed));
	}



	public void fib(int num){
		int a =0 , b = 1;
		System.out.println("the fib series of" + num + " is :");
		for(int i=0;i<num;i++){
			System.out.print(a + " ");
			int nextNum = a + b ;
			a = b;
			b = nextNum;
		}
	}


	public void arm(int num){
		int d,sum=0;
		int org = num;
			while(num>0){
				d = num % 10;
				sum = sum + d*d*d;
				num /= 10;
			}
		if(sum==org){
			System.out.println("Arm");
		}else{
			System.out.println("not arm:");
		}
		
	}

	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		System.out.println("enter your number : ");

		int num = sc.nextInt();




		Mix a = new Mix ();


		//System.out.println("enter the number to check factorial");
		a.fact(num);
		a.prime(num);
		a.rev(num);
		a.pali(num);
		a.fib(num);
		a.arm(num);
}


}