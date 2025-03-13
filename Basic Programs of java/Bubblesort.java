import java.util.Scanner;
class Bubblesort{
	
	public static void sort(int [] a){
		int temp;
		for(int i=0;i<10;i++){
			for(int j=0;j<9-i;j++){
				if(a[j]>a[j+1]){
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;			
				}
			}
		}
	System.out.println("sorted array :" );


	}
	


	public static void print(int [] a){
		for(int i=0;i<10;i++){
		System.out.println(a[i]);
	   }
	}



	public static void main(String[] args){
	int a[]=new int[10];
	Scanner sc = new Scanner(System.in);
        System.out.println("enter any 10 numbers");
	for(int i=0;i<10;i++){
		a[i]=sc.nextInt();
	}
	System.out.println("the entered element are :\n");

	Bubblesort b1 = new Bubblesort();
        b1.print(a);
	b1.sort(a);
	b1.print(a);
	
	
     }
}