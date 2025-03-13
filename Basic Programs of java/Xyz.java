import java.util.Scanner;
class Xyz{

public void add(int a,int b){

System.out.println(a+b);
}

public void sub(int a,int b){

System.out.println(a-b);
}

public void mul(int a,int b){

System.out.println(a*b);
}

public void div(int a,int b){

System.out.println(a/b);
}

public static void main(String[] args){
int sum;
Scanner sc = new Scanner(System.in);




System.out.println("enter value of a : ");
int a = sc.nextInt();

System.out.println("enter value of b :");
int b = sc.nextInt();
    


Xyz s1 = new Xyz();


System.out.println("Additon :");
s1.add(a,b);
System.out.println("sub :");
s1.sub(a,b);
System.out.println("mul :");
s1.mul(a,b);
System.out.println("div :");
s1.div(a,b);


  }
}