package defaultt;

class Big {
	Big(){  System.out.println("aaa");
		
	}
	Big (int a){
		System.out.println("Big Int a.......................!");
		
	}
	
	
}
class Small extends Big{  
	
	Small(){
		System.out.println("bbb");
	}
	
	Small (int a){
		super(3); // ---------------------->>>>>>>>>>  Super keyword
		System.out.println("Small  Int a");
		
	}
	
	
}

public class Super_Keyword {

	public static void main(String[] args) {
		Small obj = new Small(2);
		
		
		
		

	}

}
