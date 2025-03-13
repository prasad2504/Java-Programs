import java.util.Scanner;
class Arm{
	
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
			System.out.println("NotArm:");
		}
		
	}


	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number is Armstrong or Not :");

		int num = sc.nextInt();

		Arm a =new Arm();
		a.arm(num);
	}


}

