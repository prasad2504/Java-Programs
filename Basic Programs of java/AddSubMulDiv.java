import java.util.Scanner;
class AddSubMulDiv{

public void Add(int no){

System.out.println(a+b);

}

public void Sub(int no){

System.out.println(a-b);

}

public void Mul(int no){

System.out.println(a*b);
}

public void Div(int no){

System.out.println(a/b);
}


public static void main(String[] args){
          Scanner sc =new Scanner(System.in);
	  System.out.println("enter your numbers:");
	   int no = sc.nextInt();
		int a;
		int b;
	

	 
AddSubMulDiv p1 = new AddSubMulDiv();
p1.Add(no);
p1.Sub(no);
p1.Mul(no);
p1.Div(no);

	}
}