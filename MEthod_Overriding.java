package defaultt;

class parent{
	void add() {
		System.out.println("Hi..! parent method");
	}
	
}
class child extends parent{
	@Override
	void add() {
		System.out.println("Hi..! child method fire!!@#^^ ");
	}
	
}


public class MEthod_Overriding {
	public static void main(String args[]){
		child obj = new child();
		obj.add();


}
}