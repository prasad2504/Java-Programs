import java.util.Scanner;
class MatrixT{


	public void print(int[][]m){
	System.out.println("\nThe matrix:");
		for(int i=0;i<3;i++){
			for (int j=0;j<3;j++){
				System.out.printf(m[i][j] +"  ");
			}
			System.out.println();
		}
	}

	public void leftDia(int[][]m){
	System.out.println("\n the left diagonal" );
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
		if(i==j){
			System.out.printf("%8d" , m[i][j]);
		}
	}
System.out.println();
}


}


	public void rightDia(int[][]m){
	System.out.println("\n the right diagonal" );
	for(int i=0;i<3;i++){
		for(int j=0;j<3;j++){
		if(i+j==2){
			System.out.printf("%8d" , m[i][j]);
		}
	}



System.out.println();

}


}
 	


public void transpose(int [][]m){
		System.out.println("\n The transpose matrix");
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				System.out.printf("%4d",m[j][i]);
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
		MatrixT a=new MatrixT();
		a.print(m);
		a.transpose(m);
		a.leftDia(m);
		a.rightDia(m);

	}

}