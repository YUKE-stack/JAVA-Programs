// Switch Case
package defaultt;
import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		String name;
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter the word :  ");
		name = sc.nextLine();
		
		switch(name) {
		case "yuke" : System.out.println("First person"); break ;
		
		case "naveen" : System.out.println("   oru loosu paiyan"); break ;

		case "3" : System.out.println("Third person"); break ;

		case "4" : System.out.println("Fourth person"); break ;

		case "5" : System.out.println("Fifth person"); break ;
		
		case "6" : System.out.println("Sixth person"); break ;

		case "7" : System.out.println("Seventh person"); break ;
		
		case "8" : System.out.println("Eieth person"); break ;

		case "9" : System.out.println("Ninth person"); break ;

		
		default : System.out.println("Invalid character");

		
		}
		

	}

}
