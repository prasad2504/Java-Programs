import java.util.Scanner;
class Call{

	public int add(int a, int b){
	
		return a + b;
	}


	public static void main(String[] args){
		
		Scanner sc  =new Scanner(System.in);
		
		System.out.println("enter the value of A : ");
		int a = sc.nextInt();
		
		System.out.println("enter the value of B :");
                int b = sc.nextInt();
		
 		
		Call x = new Call();
		int ans = x.add(a,b);
		
		System.out.println("addition :" + ans);
	}

}