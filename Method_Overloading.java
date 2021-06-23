package defaultt;

public class Method_Overloading{

	public static void main(String[] args) {
		System.out.println(add(1,2,3));
	

	}
	//method 1
	public static int add(int i) {   // one parameter
		System.out.println(i ); 
		return i ;
	} 
	
	//method 2
	public static int add(int a , int b) { // two  parameter 
		return  a + b ;
	
	} 
	// method 3
	public static int add(int v , int j  , int k) {   // three parameter
		return  v + j + k;
	} 

}
