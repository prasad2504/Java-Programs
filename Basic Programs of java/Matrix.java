import java.util.Scanner;
class Matrix{


	public void print(int[][]m){
	System.out.println("\nThe matrix:");
		for(int i=0;i<3;i++){
			for (int j=0;j<3;j++){
				System.out.print( m[i][j]+ "  ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args){
		int [][] m = new int [3][3];
		Scanner sc =new Scanner(System.in);
 		System.out.println("Enter the element of 3*3 matrix : ");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				m[i][j] = sc.nextInt();	
			}
		}
		Matrix a=new Matrix();
		a.print(m);

	}

}