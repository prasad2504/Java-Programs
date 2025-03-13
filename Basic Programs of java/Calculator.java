class Calculator{
 
    int add(int a , int b) {
      
     System.out.println("a = " + a);
     System.out.println( "b =  " + b);
     
     return a+b;
     

    }

    int sub(int a , int b ){
   
       
     System.out.println("a = " + a);
     System.out.println( "b =  " + b);


     return a-b;
     
    }

 int mul(int a , int b ){
   
       
     System.out.println("a = " + a);
     System.out.println( "b =  " + b);


     return a*b;
     
    }

 int div(int a , int b ){
   
       
     System.out.println("a = " + a);
     System.out.println( "b =  " + b);


     return a/b;
     
    }

    

public static void main(String[] args){
 
	Calculator c1 = new Calculator();
	int ans = c1.add(20,20);
	System.out.println("Addition : " + ans);

	 ans = c1.sub(20,20);
	System.out.println("Substrction : " + ans);

	ans = c1.mul(20,20);
	System.out.println("multiplication : " + ans);

	ans = c1.div(20,20);
	System.out.println("division : " + ans);
}




}