import java.util.Scanner;
class ReverseNumber{

	public void rev(int num){ 
		
		int reversed =0;
       		while(num !=0){
			int digit = num % 10;
			reversed = reversed*10+digit;
			num /= 10;
		}
		System.out.println("revsered number :" + reversed);
	}



	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter  number too get  reversed of it :");

		int num = sc.nextInt();

	ReverseNumber a = new ReverseNumber();
	a.rev(num);

	}

}