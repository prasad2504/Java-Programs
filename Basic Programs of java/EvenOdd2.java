import java.util.Scanner;
class EvenOdd2{
 
	public void evenodd(int no){
           if (no%2==0){
		System.out.println("even");
	}
	else{
		System.out.println("odd");
	
	}
	

	}

	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number: ");
	int no = sc.nextInt();
	
	EvenOdd2 b1 = new EvenOdd2();
	b1.evenodd(no);
	}
}