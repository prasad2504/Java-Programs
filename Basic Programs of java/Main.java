import java.util.Scanner;
class Main {

	public void big(int fno,int sno,int tno){

  		int max = Math.max(fno,Math.max(sno,tno));
		System.out.println("largest :" + max);
       }


	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);	
	int fno=0;
	int sno=0;
	int tno = 0;

	for(int i=0;i<3;i++){
         int number = sc.nextInt();
 
	if(i==0){
		fno= number;
		System.out.println("1:");
		
	}else if(i==1){
		sno=number;
		System.out.println("2:");
		
	}else{ 
		tno=number;
		System.out.println("3:");
		
}
}

       Main a =new Main();
       a.big(fno,sno,tno);
 
	}

	


	
	}

