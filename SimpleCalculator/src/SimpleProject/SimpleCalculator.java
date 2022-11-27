package SimpleProject;

import java.util.Scanner;

public class SimpleCalculator {
	static void calculator(int n) {
		Scanner input=new Scanner(System.in);
		System.out.print("Number 1: ");
		int num1=input.nextInt();
		System.out.print("Number 2: ");
		int num2=input.nextInt();
		
		int userChoose=n;
		System.out.print("Result: ");
		if(userChoose==1) {
			
			
			System.out.print(num1+num2);
//			
		}
		else if(userChoose==2) {
			
			
			System.out.print(num1-num2);
		}
		else if(userChoose==3) {
			
			
			System.out.print(num1*num2);
		}
		else if(userChoose==4) {
			
			
			System.out.print(num1/num2);
		}
		else {
			System.out.println("Exit");
			System.exit(0);
		}
		System.out.println();
		System.out.println("Wants to Continue?(y/n)");
		char str=input.next().charAt(0);
		if(str =='y'|| str =='Y') {
			main(null);
		}
		else {
			System.out.println("Exit");
			System.exit(0);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.println("1) Sum");
		System.out.println("2) Sub");
		System.out.println("3) Mul");
		System.out.println("4) Div");
		System.out.println("5) Exit");
		System.out.println("================");
		System.out.print("Enter your choice: ");
		int userChoose=input.nextInt();
		
		calculator(userChoose);
	}

}
