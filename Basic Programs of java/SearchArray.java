import java.util.Scanner;

class SearchArray{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter any 10 numbers");
	int [] no = new int[10];
	int i = 0;
	for(i=0;i<10;i++){
		no[i]=sc.nextInt();
		
	}
		System.out.println("enter the number to search ");
		int key = sc.nextInt();

		for(i=0;i<10;i++){
			if(key == no[i]) {
			System.out.println("the value found at position" +(i+1));
			break;	
			}
		}
		if (i==10){
		  System.out.println("The number is not found : ");
		}
	}
}
