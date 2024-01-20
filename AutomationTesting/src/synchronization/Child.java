package synchronization;

public class Child {

	
	public void m2() {
		System.out.println("Child");
	}
	
	
	public static void main(String[] args) {
		Parent p=new Parent();
		p.m1();
		
		
	}
}
