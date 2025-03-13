import java.util.Scanner;

class Arraydemouser{
	public static void main(String[] args){
		//datatype [] arrayname = new datatype[size];
		int[] a = new int[10];


		
		Scanner sc = new Scanner (System.in);
		System.out.println("enter any 10 number:");
		for(int i=0;i<10;i++){
			a[i]=sc.nextInt();
}
		
		System.out.println("The array element are : \n");
		for(int i=1;i<10;i++){
			
		System.out.println(a[i]);
		}
	}
}