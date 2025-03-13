import java.util.Scanner;

class Bs{


	public void print(int [] b){
		for(int i=0;i<5;i++){
			System.out.println(b[i]);
		}
	}

	public void sort(int [] b){
		int temp;
		for(int i=0;i<5;i++){
			for(int j=0;j<4-i;j++){
				if(b[j]>b[j+1]){
				temp=b[j];
				b[j]=b[j+1];
				b[j+1]=temp;
			}
			}
		}

		System.out.println("sorted ");
	}

	
	public static void main(String[] args){
		int [] b = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the nos : ");
		for(int i=0;i<5;i++){
			b[i]=sc.nextInt();
		}
		System.out.println("the elements are :");

		Bs a = new Bs();

		a.print(b);
		a.sort(b);
		a.print(b);

	}


}