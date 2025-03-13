
import java.util.Scanner;
class Largest1{

	public void large(int fno , int sno , int tno){
		int max = Math.max(fno , Math.max(sno , tno));	
		System.out.println("largest number is :" + max);
	}



	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
	
		System.out.println("Enter the first number :");
		int fno = sc.nextInt();

		System.out.println("enter the second number :");
		int sno = sc.nextInt();

		System.out.println("enter the third number :");
		int tno = sc.nextInt();

		Largest1 a = new Largest1();
		a.large(fno,sno,tno);
	}


}