package week1.day1;

public class Mobile1 {
	
	public void sendSMS() {
		System.out.println("Hello Testleaf");

	}

	protected void allowVoicecall() {
		System.out.println("This is protected method");

	}
	
	private void takevideo() {
		System.out.println("This is private");

	}
	
	
	public static void main(String[] args) {
		
		Mobile1 obj= new Mobile1();
		obj.allowVoicecall();
obj.sendSMS();
obj.takevideo();

	}

}
