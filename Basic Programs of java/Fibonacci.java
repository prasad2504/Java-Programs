import java.util.Scanner;
class Fibonacci{

	public void fib(int num){
		int a = 0 , b = 1;
		System.out.println("the fib series of  " + num + " Is : ");
		for(int i =0; i<num; i++){
			System.out.println(a + " ");
			int nextNum = a + b;
			a = b;
			b = nextNum;	
		}
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number which you want to see fib series : ");
		int num = sc.nextInt();

		
		Fibonacci a =new Fibonacci();
		a.fib(num);
	}

}