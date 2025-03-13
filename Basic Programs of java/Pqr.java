import java.util.Scanner;
class Pqr{


 public void add(int a , int b){
 System.out.println(a+b);
}

 public void mul(int a , int b){
 System.out.println(a*b);
}

 public void sub(int a , int b){
 System.out.println(a-b);
}

 public void div(int a , int b){
 System.out.println(a/b);
}




  public static void main(String[] args){
    

   
   

   int a = 5;
   int b = 5;
   
   
Pqr k1=new Pqr();
System.out.println("Additon of your numbers : ");
k1.add(a,b);
System.out.println("mul of your numbers : ");
k1.mul(a,b);
System.out.println("sub of your numbers : ");
k1.sub(a,b);
System.out.println("div of your numbers : ");
k1.div(a,b);
  
  } 
}