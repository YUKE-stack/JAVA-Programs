import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
		double num1 , num2 ; 
		char op = 0 ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Number 1 : ");
		num1 = sc.nextDouble();
		System.out.println("Number 2 : ");
		num2 = sc.nextDouble();
        System.out.println("Select Operations :");
		System.out.println("Addition - a , Subtraction - s , division - d , Multiplication m");
     	op = sc.next().charAt(op);
		switch(op) {
		case 'a' : System.out.println("Addition : " + (num1+num2)); break ;
		
		case 's' : System.out.println("Subtraction  : " + (num1-num2)); break ;

		case  'm' : System.out.println("Multiplication : " + (num1*num2)); break ;

		case 'd' : System.out.println("Division  : " + (num1/num2)); break ;
     default : System.out.println("Select the opertaion");  break ;
		}         
		}}

		
	/*	double num1, num2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number:");    
        num1 = scanner.nextDouble();
        System.out.print("Enter second number:");
        num2 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);

        scanner.close();
        double output;

        switch(operator)
        {
            case '+':
            	output = num1 + num2;
                break;

            case '-':
            	output = num1 - num2;
                break;

            case '*':
            	output = num1 * num2;
                break;

            case '/':
            	output = num1 / num2;
                break;

            
            default:
                System.out.printf("You have entered wrong operator");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+": "+output);
		
	}

}        */
