package Calculator;

import java.util.Scanner;

public class JavaCalculator {
  public static void main(String [] args) {
	  System.out.println("Enter 1 for Addtion");
	  System.out.println("Enter 2 for Subtraction");
	  System.out.println("Enter 3 for Multiplication");
	  System.out.println("Enter 4 for Division");
	  Scanner s = new Scanner(System.in);
	  int choice;
	  while(true) {
		  System.out.println("Enter the choice :");
		  choice = s.nextInt();
		  if(choice == 1) {
			  System.out.println("Enter the value of A:");
			  int a = s.nextInt();
			  System.out.println("Enter the value of B:");
			  int b = s.nextInt();
			  int result =  addition(a ,b);
			  System.out.println("the Answer is :" + result);
			  
		  }
		  if(choice == 2) {
			  System.out.println("Enter the value of A:");
			  int a = s.nextInt();
			  System.out.println("Enter the value of B:");
			  int b = s.nextInt();
			  int result =  subtraction(a ,b);
			  System.out.println("the Answer is :" + result);
			  
		  }
		  if(choice == 3) {
			  System.out.println("Enter the value of A:");
			  int a = s.nextInt();
			  System.out.println("Enter the value of B:");
			  int b = s.nextInt();
			  int result =  multiplication(a ,b);
			  System.out.println("the Answer is :" + result);
			  
		  }
		  if(choice == 4) {
			  System.out.println("Enter the value of A:");
			  int a = s.nextInt();
			  System.out.println("Enter the value of B:");
			  int b = s.nextInt();
			  int result =  divison(a ,b);
			  System.out.println("the Answer is :" + result);
			  
		  }
		  else {
			  break;
		  }
	  }
  }
  public static int addition(int a ,int b) {
	  return a+b;
  }
  public static int subtraction(int a ,int b) {
	  return a-b;
  }
  public static int multiplication(int a ,int b) {
	  return a*b;
  }
  public static int divison(int a ,int b) {
	  return a/b;
  }
  
}
