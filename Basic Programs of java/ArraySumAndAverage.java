import java.util.Scanner;
class ArraySumAndAverage{
	public static void main(String[] args){
		int [] amt = new int[7];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the daily amt you receive from company for one week");
		
		for (int i=0;i<7;i++){
			amt[i]=sc.nextInt();
			
		}
		System.out.println("your daily income is as follows : ");
		
		int total=0;
		for(int i=0;i<7;i++){
			System.out.println(amt[i]);
			total = total + amt[i];
		}
		System.out.println("your income for a week : " +total);
		System.out.println("your average for weak is : " +total/7);

	}
}