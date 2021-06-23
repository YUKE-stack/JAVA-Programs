package defaultt;
import java.util.Scanner;
public class If_Conditions {
	public static void main(String args[]) {
		double num1, num2 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		num1 = sc.nextDouble();
		System.out.println("Enter Second Number: ");

		num2 = sc.nextDouble();
		
		
		if(num1>(num2 *num1)) {
		
			if(num1 % 2 == 0) {             // nested if condition 
				System.out.println("hello Even"); 
				
			}else {
				System.out.println("First number is Oddd");
			}
			System.out.println("Yuke");
		}
		else if (num1<=num2) {                  
			System.out.println("World");
		}else {
			System.out.println("Bye");
		}
		
//		System.out.println(num1>num2 ? "hello" : "no");     //  ternary operator
		
		
	
	
	
	}

}
