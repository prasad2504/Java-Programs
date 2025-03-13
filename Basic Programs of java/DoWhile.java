import java.util.Scanner;

class DoWhile {
	public static void main (String[] args){     
		int no=1;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("1.Square");
       			System.out.println("2.Cube");
       			System.out.println("3.EvenOdd");
       			System.out.println("4.PostiveNegative");
       			System.out.println("5.exit");
       			System.out.println("please enter your option");
       			int opt = sc.nextInt();

			if(opt==1){
				System.out.println("give me number:");
				no = sc.nextInt();
				System.out.println("square is of your number= " +no*no);
			}
			else if(opt==2){
				System.out.println("give me number:");
				no = sc.nextInt();
				System.out.println("cube is of your number = " +no*no*no);
			}	


			else if(opt==3){
				System.out.println("give me number:");
				no = sc.nextInt();
				if(no%2==0){
					System.out.println("number is even");
				}
				else{
					System.out.println("number is odd:");
				}
			}

			else if(opt==4){
				System.out.println("give me number:");
				no = sc.nextInt();
				if(no>=0){
					System.out.println("no is positive:");
				}
				else{
					System.out.println("no is negetive:");
				}
			}


			else if (opt==5){
 				System.out.println("exit : ");
				break;
			}
		
		}while(no!=5);
    


	}
}