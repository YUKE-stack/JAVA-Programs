package defaultt;
class X { 
	private int id ;
	private String password ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
 
public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		X obj = new X ();
	int n =	obj.getId();
		obj.setId(21989314);
		obj.setPassword("yuke");
	String s =	obj.getPassword();
		
		System.out.println(n);
		System.out.println(s + obj.getPassword());
		

	}

}
